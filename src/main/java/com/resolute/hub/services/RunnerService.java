package com.resolute.hub.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.resolute.hub.models.PendingTestResult;
import com.resolute.hub.models.RunResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RunnerService {

    private static final Logger log = LoggerFactory.getLogger(RunnerService.class);

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${resolute.rabbitmq.publishQueueName}")
    private String requestQueueName;

    @Value("${resolute.rabbitmq.exchange}")
    private String exchange;

    private ObjectMapper objectMapper;

    public PendingTestResult publish (RunResource runResource) throws Exception{
        String correlationId = UUID.randomUUID().toString();
        rabbitTemplate.send(exchange,requestQueueName, getMessage(runResource, correlationId));
        log.info("Message published to queue "+requestQueueName+". Correlation Id is " + correlationId +" for "+runResource.getAutAppName() + " app");
        return new PendingTestResult(correlationId);
    }

    private Message getMessage(RunResource runResource, String correlationId) throws Exception{
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setCorrelationId(correlationId);
        this.objectMapper = new ObjectMapper();
        Message message = new Message(objectMapper.writeValueAsBytes(runResource), messageProperties);
        return message;
    }

}

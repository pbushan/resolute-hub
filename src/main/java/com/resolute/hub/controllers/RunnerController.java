package com.resolute.hub.controllers;

import com.resolute.hub.models.PendingTestResult;
import com.resolute.hub.models.RunResource;
import com.resolute.hub.services.RunnerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(value = "Resolute hub", description = "Operations pertaining to run a test using the hub. Message is persisted in RabbitMQ and picked up by the nodes.")

public class RunnerController {

/**
 * The class helps expose the /api/runTest api to the user
 * It puts a run message into the queue for the resolute nodes to pick up.
 * @version 1.0
 * @author Phani Bushan
 * @authoremail bushanphani9@gmail.com
 * @date Feb 16th 2020
 */
    @Autowired
    RunnerService runnerService;

    @ApiOperation(value = "Run a gatling test using Resolute")
    @PutMapping("/api/runTest")
    public HttpEntity<PendingTestResult> publishToRabbit(@RequestBody @Valid RunResource run) throws Exception{
        return ResponseEntity.accepted().body(runnerService.publish(run));
    }

}

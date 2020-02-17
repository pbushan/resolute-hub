package com.resolute.hub.models;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class Slack {

    /**
     * The class helps configure a slack webhook URL for slack notifications
     * Look into Slack's documentation for creating your webhooks.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */

    @ApiModelProperty(notes = "Your webhook URL where you would like notifications. Use multiple notification objects to send a notification to multiple channels")
    @NotNull
    private String webhookUrl;

    @ApiModelProperty(notes = "Use this to define when you want to receive slack notifications.")
    private Events events;

    public Slack() {
    }

    public Slack(@NotNull String webhookUrl, Events events) {
        this.webhookUrl = webhookUrl;
        this.events = events;
    }

    public String getWebhookUrl() {
        return webhookUrl;
    }

    public void setWebhookUrl(String webhookUrl) {
        this.webhookUrl = webhookUrl;
    }

    public Events getEvents() {
        return events;
    }

    public void setEvents(Events events) {
        this.events = events;
    }
}

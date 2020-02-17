package com.resolute.hub.models;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Email {

    /**
     * The class helps determine recipients of an email notification.
     * Your email settings will be configured on the node.
     * This allows for greater flexibility while deploying nodes and keeps the hub lightweight
     * You can also set a custom email subject. The email footer cannot be changed and gives credit to the developer.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */

    @ApiModelProperty(notes = "A list of recipients that'll receive your an email after test run")
    @NotNull
    private List<String> recipients;

    @ApiModelProperty(notes = "Your email subject. If not provided will default to set value")
    private String emailSubject = "Resolute test notification for your gatling test";

    public Email() {
    }

    public Email(@NotNull List<String> recipients, String emailSubject) {
        this.recipients = recipients;
        this.emailSubject = emailSubject;
    }

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }
}

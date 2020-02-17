package com.resolute.hub.models;

public class NotificationType {
    /**
     * The class helps configure a notification type. You can add as many notification objects as required.
     * We currently support a notification type of slack or email.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */

    private Slack slack;
    private Email email;

    public NotificationType() {
    }

    public NotificationType(Slack slack, Email email) {
        this.slack = slack;
        this.email = email;
    }

    public Slack getSlack() {
        return slack;
    }

    public void setSlack(Slack slack) {
        this.slack = slack;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }
}

package com.resolute.hub.models;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class Notification {

    /**
     * The class helps configure notifications based on your preferences.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */

    @ApiModelProperty(notes = "Generate notifications based on your preferences")
    @NotNull
    private NotificationType notificationType;

    public Notification() {
    }

    public Notification(@NotNull NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }
}

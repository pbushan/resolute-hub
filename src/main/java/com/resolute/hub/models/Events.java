package com.resolute.hub.models;

import io.swagger.annotations.ApiModelProperty;

public class Events {

    /**
     * The class helps configure when a user wants a slack notification
     * By default, a user will get a notification when a test starts and when it passes or fails.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */
    @ApiModelProperty(notes = "Defaults to true")
    private Boolean onStart = true;
    @ApiModelProperty(notes = "Defaults to true")
    private Boolean onPass = true;
    @ApiModelProperty(notes = "Defaults to true")
    private Boolean onFail = true;

    public Events() {
    }

    public Events(Boolean onStart, Boolean onPass, Boolean onFail) {
        this.onStart = onStart;
        this.onPass = onPass;
        this.onFail = onFail;
    }

    public Boolean getOnStart() {
        return onStart;
    }

    public void setOnStart(Boolean onStart) {
        this.onStart = onStart;
    }

    public Boolean getOnPass() {
        return onPass;
    }

    public void setOnPass(Boolean onPass) {
        this.onPass = onPass;
    }

    public Boolean getOnFail() {
        return onFail;
    }

    public void setOnFail(Boolean onFail) {
        this.onFail = onFail;
    }
}

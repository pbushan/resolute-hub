package com.resolute.hub.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RunResource {

    /**
     * The class helps build the /api/runTest api to the user.
     * @version 1.0
     * @author Phani Bushan
     * @authoremail bushanphani9@gmail.com
     * @date Feb 16th 2020
     */

    @ApiModelProperty(notes = "Provide your repo url that contains your gatling script from your git repository")
    @NotEmpty
    private String repoUrl;

    @ApiModelProperty(notes = "Provide your influx DB host URL. We'll use this to build a link for your test result. It doesn't configure InfluxDB for you. Thats on you!")
    private String influxdbHost;

    @ApiModelProperty(notes = "Provide your branch name. If not provided, this will default to master")
    @NotEmpty
    private String branch = "master";

    @ApiModelProperty(notes = "Provide the name of your application under test")
    @NotEmpty
    private String autAppName;

    @ApiModelProperty(notes = "If you want to run a single simulation in your test, provide the name of your simulation. The default is to run all simulations in your gatling test")
    private String simulation;

    @ApiModelProperty(notes = "If you use this tool as a part of your CI pipeline, provide a link to your build. We'll use this for result notification.")
    private String buildLink;

    @ApiModelProperty(notes = "Provide any test properties")
    private Map<String, String> properties;


    @ApiModelProperty(notes = "Provide your notification preferences. If not provided, the tool will not send any notifications.")
    private List<Notification> notifications;

    public RunResource() {
    }

    public RunResource(@NotEmpty String repoUrl, String influxdbHost, @NotEmpty String branch, @NotEmpty String autAppName, String simulation, String buildLink, Map<String, String> properties, List<Notification> notifications) {
        this.repoUrl = repoUrl;
        this.influxdbHost = influxdbHost;
        this.branch = branch;
        this.autAppName = autAppName;
        this.simulation = simulation;
        this.buildLink = buildLink;
        this.properties = properties;
        this.notifications = notifications;
    }

    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public String getInfluxdbHost() {
        return influxdbHost;
    }

    public void setInfluxdbHost(String influxdbHost) {
        this.influxdbHost = influxdbHost;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getAutAppName() {
        return autAppName;
    }

    public void setAutAppName(String autAppName) {
        this.autAppName = autAppName;
    }

    public String getSimulation() {
        return simulation;
    }

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    public String getBuildLink() {
        return buildLink;
    }

    public void setBuildLink(String buildLink) {
        this.buildLink = buildLink;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
}

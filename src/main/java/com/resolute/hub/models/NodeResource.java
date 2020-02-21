package com.resolute.hub.models;

import java.util.List;
import java.util.Map;

public class NodeResource {

    private String id;

    private String repoUrl;

    private String influxdbHost;

    private String branch = "master";

    private String autAppName;

    private String simulation;

    private String buildLink;

    private Map<String, String> properties;

    private List<Notification> notifications;

    public NodeResource() {
    }

    public NodeResource(String id, String repoUrl, String influxdbHost, String branch, String autAppName, String simulation, String buildLink, Map<String, String> properties, List<Notification> notifications) {
        this.id = id;
        this.repoUrl = repoUrl;
        this.influxdbHost = influxdbHost;
        this.branch = branch;
        this.autAppName = autAppName;
        this.simulation = simulation;
        this.buildLink = buildLink;
        this.properties = properties;
        this.notifications = notifications;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
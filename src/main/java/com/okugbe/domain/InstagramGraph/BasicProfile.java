package com.okugbe.domain.InstagramGraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BasicProfile {

    @JsonProperty("id")
    private String id;
    @JsonProperty("username")
    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "BasicProfile{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}

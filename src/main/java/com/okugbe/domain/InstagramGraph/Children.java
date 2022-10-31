package com.okugbe.domain.InstagramGraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Children {

    @JsonProperty("data")
    private List<ChildData> data = null;

    public List<ChildData> getData() {
        return data;
    }

    public void setData(List<ChildData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Children{" +
                "data=" + data +
                '}';
    }
}

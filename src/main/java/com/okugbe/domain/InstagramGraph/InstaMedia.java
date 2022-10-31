package com.okugbe.domain.InstagramGraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstaMedia {

    @JsonProperty("data")
    private List<Data> data = null;
    @JsonProperty("paging")
    private Paging paging;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    @Override
    public String toString() {
        return "InstaMedia{" +
                "data=" + data +
                ", paging=" + paging +
                '}';
    }
}


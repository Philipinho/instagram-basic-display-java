package com.okugbe.domain.InstagramGraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Paging {

    @JsonProperty("cursors")
    private Cursors cursors;

    public Cursors getCursors() {
        return cursors;
    }

    public void setCursors(Cursors cursors) {
        this.cursors = cursors;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "cursors=" + cursors +
                '}';
    }
}

package com.okugbe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramApiError {

    @JsonProperty("error")
    private Error error;

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "InstagramApiError{" +
                "error=" + error +
                '}';
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Error {

        @JsonProperty("message")
        private String message;
        @JsonProperty("type")
        private String type;
        @JsonProperty("code")
        private Integer code;
        @JsonProperty("fbtrace_id")
        private String fbtraceId;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getCode() {
            return code;
        }

        public void setCode(Integer code) {
            this.code = code;
        }

        public String getFbtraceId() {
            return fbtraceId;
        }

        public void setFbtraceId(String fbtraceId) {
            this.fbtraceId = fbtraceId;
        }

        @Override
        public String toString() {
            return "Error{" +
                    "message='" + message + '\'' +
                    ", type='" + type + '\'' +
                    ", code=" + code +
                    ", fbtraceId='" + fbtraceId + '\'' +
                    '}';
        }
    }
}

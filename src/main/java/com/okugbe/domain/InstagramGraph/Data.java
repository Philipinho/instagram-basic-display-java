package com.okugbe.domain.InstagramGraph;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
    public class Data {

        @JsonProperty("id")
        private String id;
        @JsonProperty("username")
        private String username;
        @JsonProperty("media_type")
        private String mediaType;
        @JsonProperty("caption")
        private String caption;
        @JsonProperty("timestamp")
        private String timestamp;
        @JsonProperty("media_url")
        private String mediaUrl;
        @JsonProperty("permalink")
        private String permalink;
        @JsonProperty("children")
        private Children children;


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

        public String getMediaType() {
            return mediaType;
        }

        public void setMediaType(String mediaType) {
            this.mediaType = mediaType;
        }

        public String getCaption() {
            return caption;
        }

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getMediaUrl() {
            return mediaUrl;
        }

        public void setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
        }

        public String getPermalink() {
            return permalink;
        }

        public void setPermalink(String permalink) {
            this.permalink = permalink;
        }

        public Children getChildren() {
            return children;
        }

        public void setChildren(Children children) {
            this.children = children;
        }

    @Override
    public String toString() {
        return "Data{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", mediaType='" + mediaType + '\'' +
                ", caption='" + caption + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", mediaUrl='" + mediaUrl + '\'' +
                ", permalink='" + permalink + '\'' +
                ", children=" + children +
                '}';
    }
}

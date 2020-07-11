package com.gpms.covidupdater.api.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonInclude
public class CasesTO {

    @JsonProperty("uid")
    int uid;

    @JsonProperty("uf")
    String uf;

    @JsonProperty("state")
    String state;

    @JsonProperty("cases")
    int cases;

    @JsonProperty("deaths")
    int deaths;

    @JsonProperty("suspects")
    int suspects;

    @JsonProperty("refuses")
    int refuses;

    @JsonProperty("broadcast")
    boolean broadcast;

    @JsonProperty("comments")
    String comments;

    @JsonProperty("datetime")
    Date datetime;
}

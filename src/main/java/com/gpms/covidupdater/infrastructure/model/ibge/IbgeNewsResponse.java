package com.gpms.covidupdater.infrastructure.model.ibge;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gpms.covidupdater.api.to.NewsItemTO;
import lombok.Getter;

import java.util.List;

@Getter
@JsonInclude
public class IbgeNewsResponse {

    @JsonProperty("count")
    int count;

    @JsonProperty("page")
    int page;

    @JsonProperty("totalPages")
    int totalPages;

    @JsonProperty("nextPage")
    int nextPage;

    @JsonProperty("previousPage")
    int previousPage;

    @JsonProperty("showingFrom")
    int showingFrom;

    @JsonProperty("showingTo")
    int showingTo;

    @JsonProperty("items")
    List<NewsItemTO> items;

}

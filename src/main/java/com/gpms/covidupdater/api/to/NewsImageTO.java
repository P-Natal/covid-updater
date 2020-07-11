package com.gpms.covidupdater.api.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude
class NewsImageTO{

    @JsonProperty("image_intro")
    String image_intro;

    @JsonProperty("float_intro")
    String float_intro;

    @JsonProperty("image_intro_alt")
    String image_intro_alt;

    @JsonProperty("image_intro_caption")
    String image_intro_caption;

    @JsonProperty("image_fulltext")
    String image_fulltext;

    @JsonProperty("float_fulltext")
    String float_fulltext;

    @JsonProperty("image_fulltext_alt")
    String image_fulltext_alt;

    @JsonProperty("image_fulltext_caption")
    String image_fulltext_caption;
}

package com.gpms.covidupdater.infrastructure.model.covidbrazil;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.gpms.covidupdater.api.to.CasesTO;
import lombok.Getter;

import java.util.List;

@JsonInclude
@Getter
public class UpdateCasesResponse {

    @JsonProperty("data")
    List<CasesTO> data;

}

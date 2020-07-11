package com.gpms.covidupdater.infrastructure;

import com.gpms.covidupdater.infrastructure.model.covidbrazil.UpdateCasesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "covid-updater", url = "https://covid19-brazil-api.now.sh/api/report/v1")
public interface CovidBrazilClient {

    @GetMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    UpdateCasesResponse getAllCases();

}

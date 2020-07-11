package com.gpms.covidupdater.infrastructure;

import com.gpms.covidupdater.infrastructure.model.ibge.IbgeNewsResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ibge-news", url = "http://servicodados.ibge.gov.br/api/v3/noticias/")
public interface IbgeNewsClient {
    @GetMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    IbgeNewsResponse searchNews(@RequestParam("busca")String busca);
}

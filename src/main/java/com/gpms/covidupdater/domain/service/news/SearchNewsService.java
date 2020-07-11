package com.gpms.covidupdater.domain.service.news;

import com.gpms.covidupdater.infrastructure.IbgeNewsClient;
import com.gpms.covidupdater.infrastructure.model.ibge.IbgeNewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchNewsService implements SearchNewsFacade {

    private static String BUSCA = "Coronavirus";

    @Autowired
    private IbgeNewsClient ibgeNewsClient;

    public IbgeNewsResponse execute(){
        return ibgeNewsClient.searchNews(BUSCA);
    }

}

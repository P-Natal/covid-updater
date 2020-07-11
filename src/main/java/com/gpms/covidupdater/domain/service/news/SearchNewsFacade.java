package com.gpms.covidupdater.domain.service.news;

import com.gpms.covidupdater.infrastructure.model.ibge.IbgeNewsResponse;

public interface SearchNewsFacade {
    IbgeNewsResponse execute();
}

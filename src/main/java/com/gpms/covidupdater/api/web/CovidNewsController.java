package com.gpms.covidupdater.api.web;

import com.gpms.covidupdater.api.to.CasesTO;
import com.gpms.covidupdater.domain.service.cases.UpdateCasesFacade;
import com.gpms.covidupdater.domain.service.news.SearchNewsFacade;
import com.gpms.covidupdater.infrastructure.model.ibge.IbgeNewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping
public class CovidNewsController {

    @Autowired
    private SearchNewsFacade searchNewsFacade;

    @Autowired
    private UpdateCasesFacade updateCasesFacade;

    @GetMapping("/update-news")
    public @ResponseBody IbgeNewsResponse searchNews(){
        return searchNewsFacade.execute();
    }

    @GetMapping("/update-cases")
    public @ResponseBody List<CasesTO> updateCases(){
        return updateCasesFacade.execute();
    }

}

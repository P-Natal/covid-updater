package com.gpms.covidupdater.api;

import com.gpms.covidupdater.api.to.NewsTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/news")
public class CovidNewsController {

    public @ResponseBody List<NewsTO> searchNews(){
        List<NewsTO> news = new ArrayList<>();



        return news;
    }

}

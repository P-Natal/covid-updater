package com.gpms.covidupdater.domain.service.cases;

import com.gpms.covidupdater.api.to.CasesTO;
import com.gpms.covidupdater.infrastructure.CovidBrazilClient;
import com.gpms.covidupdater.infrastructure.model.covidbrazil.UpdateCasesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UpdateCasesService implements UpdateCasesFacade {

    @Autowired
    private CovidBrazilClient covidBrazilClient;

    @Override
    public List<CasesTO> execute() {
        UpdateCasesResponse response = covidBrazilClient.getAllCases();
        List<CasesTO> cases = new ArrayList<>(response.getData());
        return cases;
    }
}

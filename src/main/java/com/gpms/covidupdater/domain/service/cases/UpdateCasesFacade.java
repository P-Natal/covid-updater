package com.gpms.covidupdater.domain.service.cases;

import com.gpms.covidupdater.api.to.CasesTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UpdateCasesFacade {
    List<CasesTO> execute();
}

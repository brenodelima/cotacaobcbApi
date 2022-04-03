package io.github.brenodelima.service;

import io.github.brenodelima.bcb.CotacaoAPIBCBResource;
import io.github.brenodelima.model.CotacaoDolar;
import io.github.brenodelima.model.DTO.CotacaoDolarDTO;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.inject.Inject;
import java.util.List;

@RegisterRestClient
public class ConsultaCotacaoBCBService {
    @Inject
    CotacaoAPIBCBResource resource;
    public List<CotacaoDolarDTO> pesquisarCotacaoDolar(String data) {
        List<CotacaoDolar> retornoAPI = resource.consultarCotacaoDolarBCB(data);
        return null;
    }
}

package io.github.brenodelima.bcb;

import io.github.brenodelima.model.CotacaoDolar;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;


@Tag(name = "Consultar cotação do dolar no BCB", description = "Consultar a cotação do dolar através de uma api que se comunica com o BCB.")
@ApplicationScoped
public class CotacaoAPIBCBResource {
    @Inject
    @RestClient
    CotacaoAPIBCBService service;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @APIResponse(responseCode = "500", description = "Serviço indisponível, tente novamente mais tarde",
            content = @Content(mediaType = APPLICATION_JSON))
    public List<CotacaoDolar> consultarCotacaoDolarBCB(@PathParam String data) {
        return service.pesquisarCotacaoDolarBCB("USD", data, "json");
    }
}

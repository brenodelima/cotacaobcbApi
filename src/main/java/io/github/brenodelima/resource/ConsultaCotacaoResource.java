package io.github.brenodelima.resource;

import io.github.brenodelima.model.DTO.CotacaoDolarDTO;
import io.github.brenodelima.service.ConsultaCotacaoBCBService;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

import static javax.ws.rs.core.MediaType.APPLICATION_JSON;

@Path("/cotacaobcb")
@Tag(name = "Consultar cotação do dolar no BCB", description = "Consultar a cotação do dolar no BCB.")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class ConsultaCotacaoResource {
    @Inject
    @RestClient
    ConsultaCotacaoBCBService service;
    @GET
    @Path("/{data}")
    @APIResponse(responseCode = "500", description = "Serviço indisponível, tente novamente mais tarde",
            content = @Content(mediaType = APPLICATION_JSON))
    public List<CotacaoDolarDTO> consultarCotacaoDolarBCB(
            @Parameter(description = "Data da cotação desejada.", required = true) @PathParam("data") String data) {
        return service.pesquisarCotacaoDolar(data);
    }
}

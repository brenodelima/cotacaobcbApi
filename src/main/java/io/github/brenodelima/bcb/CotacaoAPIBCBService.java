package io.github.brenodelima.bcb;

import io.github.brenodelima.model.CotacaoDolar;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient
public interface CotacaoAPIBCBService {
    @GET
    @Path("/{moeda}{data}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List<CotacaoDolar> pesquisarCotacaoDolarBCB(
            @PathParam String moeda, @PathParam String data, @PathParam String formato);
}

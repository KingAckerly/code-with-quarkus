package org.acme.resource;

import org.acme.entity.QuarkusTestEntity;
import org.acme.service.QuarkusService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/quarkus")
@Produces(MediaType.APPLICATION_JSON)
public class QuarkusResource {
    @Inject
    private QuarkusService quarkusService;

    @GET
    @Path("/listQuarkusTests")
    @Produces(MediaType.TEXT_PLAIN)
    public List<QuarkusTestEntity> listQuarkusTests() {
        return quarkusService.listQuarkusTests();
    }
}

package Services;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient
@ApplicationScoped
@Path("/hello")
public interface RessourcesServices {

    @GET
    @Path("/hellofromressource")
    @Produces(MediaType.TEXT_PLAIN)
    String helloFrom();


}

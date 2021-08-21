package Services;


import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RegisterRestClient(baseUri = "https://helloworldblockchain.herokuapp.com")
@ApplicationScoped
@Path("/customer")
public interface GreetingServices {

    @GET
    @Path("/getCustomersList")
    @Produces(MediaType.APPLICATION_JSON)
    String getCustomerListFromApi();


}

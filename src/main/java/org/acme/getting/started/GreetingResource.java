package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import Services.GreetingServices;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/hello")
public class GreetingResource {

    @RestClient
    GreetingServices service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String helloyou(){
        return "hello";
    }


    @GET
    @Path("/getCustomers")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes
    public String getCustomer() {
        return service.getCustomerListFromApi();
    }
}
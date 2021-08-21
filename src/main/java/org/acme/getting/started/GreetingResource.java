package org.acme.getting.started;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Services.RessourcesServices;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public class GreetingResource {

    @Inject
    @RestClient
    RessourcesServices service;


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return service.helloFrom();
    }
}
package org.acme.getting.started;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @ConfigProperty(name="greeter.message", defaultValue = "default value")
    String greetingMsg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
//        return "Hello RESTEasy";

        return greetingMsg;
    }
}
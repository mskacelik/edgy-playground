package org.example.edgyplayground;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/api/resource")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class MicroserviceTwoResource {

    @GET
    public String getMethod() {
        return "I am second microservice GET method";
    }

    @POST
    public String postMethod(String body) {
        return "I am second microservice POST method";
    }

    @PUT
    public String putMethod(String body) {
        return "Received PUT body: " + body;
    }
}

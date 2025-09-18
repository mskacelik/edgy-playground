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
public class MicroserviceOneResource {

    @GET
    public String getMethod() {
        return "I am first microservice GET method";
    }

    @POST
    public String postMethod(String body) {
        return "I am first microservice POST method";
    }

    @PUT
    public String putMethod(String body) {
        return "I am first microservice PUT method. Received body: " + body;
    }
}

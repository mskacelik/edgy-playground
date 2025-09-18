package org.example.edgyplayground;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/third/api/unique")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class MicroserviceThreeResource {

    @GET
    @Path("/fetch")
    public String fetch() {
        return "I am third microservice GET method";
    }

    @POST
    @Path("/create")
    public String create(String body) {
        return "Received POST body: " + body;
    }

    @PUT
    @Path("/modify")
    public String modify(String body) {
        return "I am third microservice PUT method. Received body: " + body;
    }
}

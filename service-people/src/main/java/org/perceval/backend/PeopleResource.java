package org.perceval.backend;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.perceval.model.Person;

@Path("/people")
public class PeopleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "people";
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    public String createPerson() {
        Person person = new Person();
        return "Created person: " + person.toString();
    }
}
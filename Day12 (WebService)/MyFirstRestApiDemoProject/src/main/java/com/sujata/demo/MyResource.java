package com.sujata.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "<h1>Got it!</h1>";
    }
    
    @Path("/html")
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getItByHtml(String name) {
        return "<h1>Got it " +name+"!</h1>";
    }
}

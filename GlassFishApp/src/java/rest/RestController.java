/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 *
 * @author Yomna
 */
@Path("/demo")
public class RestController {
    
    @GET
    @Path("/hello")
    public String sayHello(@QueryParam("name") String name){
        return "Hello " + name;
    }
    
    @GET
    @Path("/{name}")
    public String sayGooodBye(@PathParam("name") String name){
        return "Bye Bye  " + name;
    }    
}
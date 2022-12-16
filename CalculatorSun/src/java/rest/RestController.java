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
    @Path("/add")
    public String add(@QueryParam("n") String n, @QueryParam("m") String m){
        
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(m);
        num1 += num2;
        String s = String.valueOf(num1);
        return s;
    }
    
    @GET
    @Path("/sub")
    public String sub(@QueryParam("n") String n, @QueryParam("m") String m){
        
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(m);
        int result = num1 - num2;
        String s = String.valueOf(result);
        return s;
    }    


    @GET
    @Path("/mul")
    public String mul(@QueryParam("n") String n, @QueryParam("m") String m){
        
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(m);
        num1 *= num2;
        String s = String.valueOf(num1);
        return s;
    }



    @GET
    @Path("/div")
    public String div(@QueryParam("n") String n, @QueryParam("m") String m){
        
        int num1 = Integer.parseInt(n);
        int num2 = Integer.parseInt(m);
        int result = num1 / num2;
        String s = String.valueOf(result);
        return s;
    }    
  
}
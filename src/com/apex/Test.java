package com.apex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.internal.MediaTypes;

@Path("hello")
public class Test {

	@Path("hi")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Jersy welcome....";
	}
	
	@Path("bye")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage1() {
		return "Bye Jersy";
	}
	
	
}

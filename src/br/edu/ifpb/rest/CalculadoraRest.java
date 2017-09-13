package br.edu.ifpb.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.spi.inject.Inject;

import br.edu.ifpb.service.CalculadoraService;

@Path("/calculadora")
public class CalculadoraRest {
	
	@Inject 
	CalculadoraService service;
	
	/*
	 * Neste método a passagem dos valores para serem calculados são passado por path param, ou seja,
	 * eles fazem parte da url do serviço.
	 *
	 * */
	@GET
	@Path("/{op}/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response calcular(@PathParam("op") String op,@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		return Response.ok("Resultado:" + service.calcular(op,num1,num2)).build();
	}

	@GET
	@Path("/soma/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response soma(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		return Response.ok("Resultado:" + service.soma(num1,num2)).build();
	}
	
	@GET
	@Path("/sub/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response sub(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		return Response.ok("Resultado:" + service.sub(num1,num2)).build();
	}
	
	@GET
	@Path("/div/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response div(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		return Response.ok("Resultado:" + service.div(num1,num2)).build();
	}
	
	@GET
	@Path("/mult/{num1}/{num2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response mult(@PathParam("num1") Double num1, @PathParam("num2") Double num2) {
		return Response.ok("ResultadoOP:" + service.mult(num1,num2)).build();
	}
	
	
}

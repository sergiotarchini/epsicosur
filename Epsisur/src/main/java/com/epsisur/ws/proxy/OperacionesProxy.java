package com.epsisur.ws.proxy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.epsisur.ws.dto.RespuestaDTO;

@Path("")
public interface OperacionesProxy
{
	@GET
	@Produces("application/json")
	public RespuestaDTO getAlumnos(@QueryParam("url") String url);
}

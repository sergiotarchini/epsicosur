package com.epsisur.ws;

import javax.ws.rs.core.UriBuilder;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsisur.configuracion.Configuracion;
import com.epsisur.ws.dto.RespuestaDTO;
import com.epsisur.ws.proxy.OperacionesProxy;

@Service
public class Cliente
{
	private final Configuracion configuracion;
	
	private String url = null;
	private ResteasyClient client = null;
	private OperacionesProxy operacionesProxy = null;
	
	@Autowired
    public Cliente(Configuracion conf) 
    {
		this.configuracion = conf;
		
		url = configuracion.getValorDeProperty("com.epsisur.ws.url");
		
		client = new ResteasyClientBuilder().build();
		ResteasyWebTarget target = client.target(UriBuilder.fromPath(url));
		operacionesProxy = target.proxy(OperacionesProxy.class);
    }
	
	public RespuestaDTO getAlumnos()
	{
		RespuestaDTO respuestaDTO = operacionesProxy.getAlumnos("usuarios");
		
		return respuestaDTO;
	}
}

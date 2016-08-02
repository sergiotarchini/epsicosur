package com.epsisur.ws.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement(name="respuesta")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value="respuesta")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RespuestaDTO
{
	@XmlElement(name="estado", required = true)
	private String estado;
	@XmlElement(name="usuarios", required = true)
	private List<AlumnoDTO> usuarios;

	public String getEstado()
	{
		return estado;
	}

	public void setEstado(String estado)
	{
		this.estado = estado;
	}

	public List<AlumnoDTO> getUsuarios()
	{
		return usuarios;
	}

	public void setUsuarios(List<AlumnoDTO> usuarios)
	{
		this.usuarios = usuarios;
	}

	@Override
	public String toString()
	{
		return "RespuestaDTO [estado=" + estado + ", usuarios=" + usuarios + "]";
	}

}

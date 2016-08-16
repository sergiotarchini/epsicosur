package com.epsisur.ws.mappers.toEntity;

import com.epsisur.model.business.entities.Alumno;
import com.epsisur.ws.dto.AlumnoDTO;

public class AlumnoMapper
{
	public static Alumno convertir(AlumnoDTO alumnoDTO)
	{
		Alumno alumno = new Alumno();

		alumno.setNombre(alumnoDTO.getNombre());
		alumno.setApellido(alumnoDTO.getApellido());
		alumno.setMail(alumnoDTO.getEmail());
		// TODO: ver si se repite o se deja en blanco
		// alumno.setMail2();
		alumno.setTelefono(alumnoDTO.getTelefono_fijo());
		alumno.setCelular(alumnoDTO.getTelefono_celular());
		// TODO: ver si se repite o se deja en blanco
		// alumno.setComoConocio();
		try
		{
			alumno.setModalidadId(Integer.parseInt(alumnoDTO.getCurso_modalidad()));

		}
		catch (NumberFormatException nfe)
		{
			alumno.setModalidadId(0);
		}

		// TODO: ver si se repite o se deja en blanco
		// alumno.setGradoInteres();
		alumno.setFechaInteresado(alumnoDTO.getCreated());
		alumno.setComentario(alumnoDTO.getAclaracion());
		alumno.setProvincia(alumnoDTO.getDireccion_provincia());
		// TODO: ver si se repite o se deja en blanco
		// alumno.setSituacionInscripcion();
		// alumno.setSituacionEspecial();
		alumno.setDni(alumnoDTO.getDni());
		String direccion = alumnoDTO.getDireccion_calle() + " " + alumnoDTO.getDireccion_numero() + " "	+ alumnoDTO.getDireccion_departamento() + ", " + alumnoDTO.getDireccion_localidad();
		alumno.setDomicilio((direccion.length() < 500) ? direccion : direccion.substring(0, 500));

		return alumno;
	}
}

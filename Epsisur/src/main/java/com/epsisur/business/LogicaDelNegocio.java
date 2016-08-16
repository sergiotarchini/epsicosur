package com.epsisur.business;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epsisur.business.logger.DataLogger;
import com.epsisur.configuracion.Configuracion;
import com.epsisur.model.business.entities.Alumno;
import com.epsisur.repository.AlumnoRepository;
import com.epsisur.utilidades.Utilidades;

@Component
public class LogicaDelNegocio
{
	private final Configuracion configuracion;
	
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	private DataLogger logger;
	
	@Autowired
	public LogicaDelNegocio(Configuracion conf)
	{
		this.configuracion = conf;
	}
	
	public boolean persistirAlumnosEnBD(List<Alumno> listaAlumnos) throws Exception
	{
		logger.infoLog("|Se ingresa en metodo (persistirAlumnosEnBD)|");

		int alumnosPersistidos = 0;
		
		for (Alumno alumnoWS : listaAlumnos)
		{
			Alumno alumnoBD = alumnoRepository.obtenerAlumnoPorDNI(alumnoWS.getDni());
			
			if (alumnoBD == null)
			{
				alumnoRepository.save(alumnoWS);
				alumnoRepository.flush();
				alumnosPersistidos++;
			}
			else
			{
				if (!alumnoWS.getFechaInteresado().equals(""))
				{
					int diasDescarte = Integer.valueOf(configuracion.getValorDeProperty("com.epsisur.business.alumnos.diasDescarte")).intValue();
					Date fechaHoy = new Date();
					Date fecha = Utilidades.obtenerObjetoFecha(alumnoWS.getFechaInteresado());
					long diferencia = fechaHoy.getTime() - fecha.getTime();
					double dias = Math.floor(diferencia / 86400000L);
					int diasDif = (int)dias;
					
					if (diasDif < diasDescarte)
					{
						if (!alumnoWS.getNombre().equals(""))
						{
							alumnoBD.setNombre(alumnoWS.getNombre());
						}
						if (!alumnoWS.getApellido().equals(""))
						{
							alumnoBD.setApellido(alumnoWS.getApellido());
						}
						if (!alumnoWS.getMail().equals(""))
						{
							alumnoBD.setMail(alumnoWS.getMail());
						}
						if (!alumnoWS.getTelefono().equals(""))
						{
							alumnoBD.setTelefono(alumnoWS.getTelefono());
						}
						if (!alumnoWS.getCelular().equals(""))
						{
							alumnoBD.setCelular(alumnoWS.getCelular());
						}
						if (!alumnoWS.getComoConocio().equals(""))
						{
							alumnoBD.setComoConocio(alumnoWS.getComoConocio());
						}
						if (alumnoWS.getModalidadId()>0)
						{
							alumnoBD.setModalidadId(alumnoWS.getModalidadId());
						}
						if (!alumnoWS.getGradoInteres().equals(""))
						{
							alumnoBD.setGradoInteres(alumnoWS.getGradoInteres());
						}
						if (!alumnoWS.getFechaInteresado().equals(""))
						{
							alumnoBD.setFechaInteresado(alumnoWS.getFechaInteresado());
						}
						if (!alumnoWS.getComentario().equals(""))
						{
							alumnoBD.setComentario(alumnoWS.getComentario());
						}
						if (!alumnoWS.getProvincia().equals(""))
						{
							alumnoBD.setProvincia(alumnoWS.getProvincia());
						}
						if (!alumnoWS.getSituacionInscripcion().equals(""))
						{
							alumnoBD.setSituacionInscripcion(alumnoWS.getSituacionInscripcion());
						}
						if (!alumnoWS.getSituacionEspecial().equals(""))
						{
							alumnoBD.setSituacionEspecial(alumnoWS.getSituacionEspecial());
						}
						if (!alumnoWS.getDomicilio().equals(""))
						{
							alumnoBD.setDomicilio(alumnoWS.getDomicilio());
						}

						alumnoRepository.save(alumnoBD);
						alumnoRepository.flush();
						alumnosPersistidos++;
					}  
				}
			}
		}
		
		logger.infoLog("Se recibieron: " + listaAlumnos.size() + " alumnos|Se persistieron: " + alumnosPersistidos + " alumnos");
		
		return true;
	}

}

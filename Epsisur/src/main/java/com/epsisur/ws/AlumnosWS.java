package com.epsisur.ws;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.epsisur.business.LogicaDelNegocio;
import com.epsisur.model.business.entities.Alumno;
import com.epsisur.ws.dto.AlumnoDTO;
import com.epsisur.ws.dto.RespuestaDTO;
import com.epsisur.ws.logger.WebLogger;
import com.epsisur.ws.mappers.toEntity.AlumnoMapper;

@Component
@EnableScheduling
public class AlumnosWS
{
	@Autowired
	private WebLogger logger;
	
	@Autowired
	private Cliente cliente;
	
	@Autowired
	private LogicaDelNegocio logicaDelNegocio;
	
	// Se ejecuta al inicio/reinicio del server y cuando se llegue al MAX_VALUE de un Long
	@Scheduled(fixedDelay = Long.MAX_VALUE)
	public void serverStart()
	{
		ejecutarConsultaAlumnos();
	}
	
	// Se ejecuta al comienzo de cada dia (hora 00:00:00)
	@Scheduled(cron="0 0 0 * * ?")
	public void consultarAlumnos()
	{
		ejecutarConsultaAlumnos();
	}
	
	private void ejecutarConsultaAlumnos()
	{
		RespuestaDTO respuestaDTO = cliente.getAlumnos();
    	logger.infoLog("Cantidad de alumnos devueltos por el WS: " + respuestaDTO.getUsuarios().size());
    	logger.debugLog("JSON devuelto por el WS: \n" + respuestaDTO.toString() + "\n");
		
    	List<Alumno> listaAlumnos = new ArrayList<Alumno>();
    	
    	for (AlumnoDTO alumnoDTO : respuestaDTO.getUsuarios())
    	{
    		listaAlumnos.add(AlumnoMapper.convertir(alumnoDTO));
    	}

    	try
    	{
    		logicaDelNegocio.persistirAlumnosEnBD(listaAlumnos);
    		
    		logger.infoLog("Se persistieron los alumnos devueltos por el WS");
    	}
    	catch (Exception e)
    	{
    		logger.errorLog("Error al persistir los alumnos en la BD");
    	}
	}
}

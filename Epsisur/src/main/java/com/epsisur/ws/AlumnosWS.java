package com.epsisur.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.epsisur.ws.dto.RespuestaDTO;
import com.epsisur.ws.logger.WebLogger;

@Component
@EnableScheduling
public class AlumnosWS
{
	@Autowired
	private WebLogger logger;
	@Autowired
	private Cliente cliente;
	
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
		
/*    	PersistirAlumnosDTO dto = new PersistirAlumnosDTO();
    	List<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
    	List<Interesados> listaInteresados = new ArrayList<Interesados>();
    	IRequest request = new RequestBean();
    	
    	logger.infoLog("Cantidad de alumnos devueltos por el WS: " + respuestaDTO.getUsuarios().size());
    	logger.debugLog("JSON devuelto por el WS: \n" + respuestaDTO.toString() + "\n");
    	
    	for (AlumnoDTO alumnoDTO : respuestaDTO.getUsuarios())
    	{
    		listaAlumnos.add(AlumnoMapper.convertir(alumnoDTO));
    		listaInteresados.add(InteresadoMapper.convertir(alumnoDTO));
    	}
    	
    	dto.setAlumnos(listaAlumnos);
    	dto.setInteresados(listaInteresados);
    	request.setDatos(dto);
    	
    	try
    	{
        	//PersistirAlumnosEnBDCommand comando = new PersistirAlumnosEnBDCommand();
        	comando.ejecutar(request);
        	logger.infoLog("Se persistieron los alumnos devueltos por el WS");
    	}
    	catch (Exception e)
    	{
    		logger.errorLog("Error al persistir los alumnos en la BD");
    	}
*/	}
}

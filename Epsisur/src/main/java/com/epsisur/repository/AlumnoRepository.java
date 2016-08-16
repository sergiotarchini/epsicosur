package com.epsisur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.epsisur.model.business.entities.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>
{
	@Query("FROM Alumno WHERE dni = :dni")
	Alumno obtenerAlumnoPorDNI(@Param("dni") String dni) throws Exception;
}

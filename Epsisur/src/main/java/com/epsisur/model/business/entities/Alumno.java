package com.epsisur.model.business.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos")
public class Alumno
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	
	@Column(name = "nombre", length = 100)
	private String nombre;
	
	@Column(name = "apellido", length = 120)
	private String apellido;
	
	@Column(name = "mail", length = 150)
	private String mail;
	
	@Column(name = "mail2", length = 150)
	private String mail2;
	
	@Column(name = "telefono", length = 25)
	private String telefono;
	
	@Column(name = "celular", length = 25)
	private String celular;
	
	@Column(name = "como_conocio", length = 100)
	private String comoConocio;
	
	@Column(name = "modalidad_id")
	private Integer modalidadId;
	
	@Column(name = "grado_interes", length = 50)
	private String gradoInteres;
	
	@Column(name = "fecha_interesado", length = 10)
	private String fechaInteresado;
	
	@Column(name = "comentario", length = 1500)
	private String comentario;
	
	@Column(name = "provincia", length = 70)
	private String provincia;
	
	@Column(name = "situacion_inscripcion", length = 200)
	private String situacionInscripcion;
	
	@Column(name = "situacion_especial", length = 200)
	private String situacionEspecial;
	
	@Column(name = "dni", length = 100)
	private String dni;

	@Column(name = "domicilio", length = 500)
	private String domicilio;

	public Alumno()
	{
	}

	public Alumno(int id)
	{
		this.id = id;
	}

	public Alumno(int id, String nombre, String apellido, String mail, String mail2, String telefono, String celular,
			String comoConocio, Integer modalidadId, String gradoInteres, String fechaInteresado, String comentario,
			String provincia, String situacionInscripcion, String situacionEspecial, String dni, String domicilio)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.mail2 = mail2;
		this.telefono = telefono;
		this.celular = celular;
		this.comoConocio = comoConocio;
		this.modalidadId = modalidadId;
		this.gradoInteres = gradoInteres;
		this.fechaInteresado = fechaInteresado;
		this.comentario = comentario;
		this.provincia = provincia;
		this.situacionInscripcion = situacionInscripcion;
		this.situacionEspecial = situacionEspecial;
		this.dni = dni;
		this.domicilio = domicilio;
	}

	public int getId()
	{
		return this.id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getApellido()
	{
		return this.apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getMail()
	{
		return this.mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}

	public String getMail2()
	{
		return this.mail2;
	}

	public void setMail2(String mail2)
	{
		this.mail2 = mail2;
	}

	public String getTelefono()
	{
		return this.telefono;
	}

	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	public String getCelular()
	{
		return this.celular;
	}

	public void setCelular(String celular)
	{
		this.celular = celular;
	}

	public String getComoConocio()
	{
		return this.comoConocio;
	}

	public void setComoConocio(String comoConocio)
	{
		this.comoConocio = comoConocio;
	}

	public Integer getModalidadId()
	{
		return this.modalidadId;
	}

	public void setModalidadId(Integer modalidadId)
	{
		this.modalidadId = modalidadId;
	}

	public String getGradoInteres()
	{
		return this.gradoInteres;
	}

	public void setGradoInteres(String gradoInteres)
	{
		this.gradoInteres = gradoInteres;
	}

	public String getFechaInteresado()
	{
		return this.fechaInteresado;
	}

	public void setFechaInteresado(String fechaInteresado)
	{
		this.fechaInteresado = fechaInteresado;
	}

	public String getComentario()
	{
		return this.comentario;
	}

	public void setComentario(String comentario)
	{
		this.comentario = comentario;
	}

	public String getProvincia()
	{
		return this.provincia;
	}

	public void setProvincia(String provincia)
	{
		this.provincia = provincia;
	}

	public String getSituacionInscripcion()
	{
		return this.situacionInscripcion;
	}

	public void setSituacionInscripcion(String situacionInscripcion)
	{
		this.situacionInscripcion = situacionInscripcion;
	}

	public String getSituacionEspecial()
	{
		return this.situacionEspecial;
	}

	public void setSituacionEspecial(String situacionEspecial)
	{
		this.situacionEspecial = situacionEspecial;
	}

	public String getDni()
	{
		return this.dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getDomicilio()
	{
		return this.domicilio;
	}

	public void setDomicilio(String domicilio)
	{
		this.domicilio = domicilio;
	}

}
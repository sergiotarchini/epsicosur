package com.epsisur.ws.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlumnoDTO
{
	@XmlElement(name = "id", required = true)
	private String id = null;

	@XmlElement(name = "apellido", required = true)
	private String apellido = null;

	@XmlElement(name = "nombre", required = true)
	private String nombre = null;

	@XmlElement(name = "sexo", required = true)
	private String sexo = null;

	@XmlElement(name = "fecha_nacimiento", required = true)
	private String fecha_nacimiento = null;

	@XmlElement(name = "lugar_nacimiento", required = true)
	private String lugar_nacimiento = null;

	@XmlElement(name = "dni", required = true)
	private String dni = null;

	@XmlElement(name = "cuit", required = true)
	private String cuit = null;

	@XmlElement(name = "telefono_fijo", required = true)
	private String telefono_fijo = null;

	@XmlElement(name = "telefono_celular", required = true)
	private String telefono_celular = null;

	@XmlElement(name = "email", required = true)
	private String email = null;

	@XmlElement(name = "direccion_calle", required = true)
	private String direccion_calle = null;

	@XmlElement(name = "direccion_numero", required = true)
	private String direccion_numero = null;

	@XmlElement(name = "direccion_departamento", required = true)
	private String direccion_departamento = null;

	@XmlElement(name = "direccion_otros", required = true)
	private String direccion_otros = null;

	@XmlElement(name = "direccion_localidad", required = true)
	private String direccion_localidad = null;

	@XmlElement(name = "direccion_cp", required = true)
	private String direccion_cp = null;

	@XmlElement(name = "direccion_provincia", required = true)
	private String direccion_provincia = null;

	@XmlElement(name = "direccion_pais", required = true)
	private String direccion_pais = null;

	@XmlElement(name = "titulo_secundario", required = true)
	private String titulo_secundario = null;

	@XmlElement(name = "titulo", required = true)
	private String titulo = null;

	@XmlElement(name = "titulo_exp", required = true)
	private String titulo_exp = null;

	@XmlElement(name = "terciario", required = true)
	private String terciario = null;

	@XmlElement(name = "terciario_completo", required = true)
	private String terciario_completo = null;

	@XmlElement(name = "terciario_carrera", required = true)
	private String terciario_carrera = null;

	@XmlElement(name = "terciario_institucion", required = true)
	private String terciario_institucion = null;

	@XmlElement(name = "universitario", required = true)
	private String universitario = null;

	@XmlElement(name = "universitario_completo", required = true)
	private String universitario_completo = null;

	@XmlElement(name = "universitario_carrera", required = true)
	private String universitario_carrera = null;

	@XmlElement(name = "universitario_institucion", required = true)
	private String universitario_institucion = null;

	@XmlElement(name = "trabajo", required = true)
	private String trabajo = null;

	@XmlElement(name = "trabajo_lugar", required = true)
	private String trabajo_lugar = null;

	@XmlElement(name = "trabajo_cargo", required = true)
	private String trabajo_cargo = null;

	@XmlElement(name = "trabajo_antiguedad", required = true)
	private String trabajo_antiguedad = null;

	@XmlElement(name = "trabajo_telefono", required = true)
	private String trabajo_telefono = null;

	@XmlElement(name = "curso_ano", required = true)
	private String curso_ano = null;

	@XmlElement(name = "curso_modalidad", required = true)
	private String curso_modalidad = null;

	@XmlElement(name = "conoce_quien", required = true)
	private String conoce_quien = null;

	@XmlElement(name = "aclaracion", required = true)
	private String aclaracion = null;

	@XmlElement(name = "created", required = true)
	private String created = null;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getApellido()
	{
		return apellido;
	}

	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getSexo()
	{
		return sexo;
	}

	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}

	public String getFecha_nacimiento()
	{
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento)
	{
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getLugar_nacimiento()
	{
		return lugar_nacimiento;
	}

	public void setLugar_nacimiento(String lugar_nacimiento)
	{
		this.lugar_nacimiento = lugar_nacimiento;
	}

	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getCuit()
	{
		return cuit;
	}

	public void setCuit(String cuit)
	{
		this.cuit = cuit;
	}

	public String getTelefono_fijo()
	{
		return telefono_fijo;
	}

	public void setTelefono_fijo(String telefono_fijo)
	{
		this.telefono_fijo = telefono_fijo;
	}

	public String getTelefono_celular()
	{
		return telefono_celular;
	}

	public void setTelefono_celular(String telefono_celular)
	{
		this.telefono_celular = telefono_celular;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getDireccion_calle()
	{
		return direccion_calle;
	}

	public void setDireccion_calle(String direccion_calle)
	{
		this.direccion_calle = direccion_calle;
	}

	public String getDireccion_numero()
	{
		return direccion_numero;
	}

	public void setDireccion_numero(String direccion_numero)
	{
		this.direccion_numero = direccion_numero;
	}

	public String getDireccion_departamento()
	{
		return direccion_departamento;
	}

	public void setDireccion_departamento(String direccion_departamento)
	{
		this.direccion_departamento = direccion_departamento;
	}

	public String getDireccion_otros()
	{
		return direccion_otros;
	}

	public void setDireccion_otros(String direccion_otros)
	{
		this.direccion_otros = direccion_otros;
	}

	public String getDireccion_localidad()
	{
		return direccion_localidad;
	}

	public void setDireccion_localidad(String direccion_localidad)
	{
		this.direccion_localidad = direccion_localidad;
	}

	public String getDireccion_cp()
	{
		return direccion_cp;
	}

	public void setDireccion_cp(String direccion_cp)
	{
		this.direccion_cp = direccion_cp;
	}

	public String getDireccion_provincia()
	{
		return direccion_provincia;
	}

	public void setDireccion_provincia(String direccion_provincia)
	{
		this.direccion_provincia = direccion_provincia;
	}

	public String getDireccion_pais()
	{
		return direccion_pais;
	}

	public void setDireccion_pais(String direccion_pais)
	{
		this.direccion_pais = direccion_pais;
	}

	public String getTitulo_secundario()
	{
		return titulo_secundario;
	}

	public void setTitulo_secundario(String titulo_secundario)
	{
		this.titulo_secundario = titulo_secundario;
	}

	public String getTitulo()
	{
		return titulo;
	}

	public void setTitulo(String titulo)
	{
		this.titulo = titulo;
	}

	public String getTitulo_exp()
	{
		return titulo_exp;
	}

	public void setTitulo_exp(String titulo_exp)
	{
		this.titulo_exp = titulo_exp;
	}

	public String getTerciario()
	{
		return terciario;
	}

	public void setTerciario(String terciario)
	{
		this.terciario = terciario;
	}

	public String getTerciario_completo()
	{
		return terciario_completo;
	}

	public void setTerciario_completo(String terciario_completo)
	{
		this.terciario_completo = terciario_completo;
	}

	public String getTerciario_carrera()
	{
		return terciario_carrera;
	}

	public void setTerciario_carrera(String terciario_carrera)
	{
		this.terciario_carrera = terciario_carrera;
	}

	public String getTerciario_institucion()
	{
		return terciario_institucion;
	}

	public void setTerciario_institucion(String terciario_institucion)
	{
		this.terciario_institucion = terciario_institucion;
	}

	public String getUniversitario()
	{
		return universitario;
	}

	public void setUniversitario(String universitario)
	{
		this.universitario = universitario;
	}

	public String getUniversitario_completo()
	{
		return universitario_completo;
	}

	public void setUniversitario_completo(String universitario_completo)
	{
		this.universitario_completo = universitario_completo;
	}

	public String getUniversitario_carrera()
	{
		return universitario_carrera;
	}

	public void setUniversitario_carrera(String universitario_carrera)
	{
		this.universitario_carrera = universitario_carrera;
	}

	public String getUniversitario_institucion()
	{
		return universitario_institucion;
	}

	public void setUniversitario_institucion(String universitario_institucion)
	{
		this.universitario_institucion = universitario_institucion;
	}

	public String getTrabajo()
	{
		return trabajo;
	}

	public void setTrabajo(String trabajo)
	{
		this.trabajo = trabajo;
	}

	public String getTrabajo_lugar()
	{
		return trabajo_lugar;
	}

	public void setTrabajo_lugar(String trabajo_lugar)
	{
		this.trabajo_lugar = trabajo_lugar;
	}

	public String getTrabajo_cargo()
	{
		return trabajo_cargo;
	}

	public void setTrabajo_cargo(String trabajo_cargo)
	{
		this.trabajo_cargo = trabajo_cargo;
	}

	public String getTrabajo_antiguedad()
	{
		return trabajo_antiguedad;
	}

	public void setTrabajo_antiguedad(String trabajo_antiguedad)
	{
		this.trabajo_antiguedad = trabajo_antiguedad;
	}

	public String getTrabajo_telefono()
	{
		return trabajo_telefono;
	}

	public void setTrabajo_telefono(String trabajo_telefono)
	{
		this.trabajo_telefono = trabajo_telefono;
	}

	public String getCurso_ano()
	{
		return curso_ano;
	}

	public void setCurso_ano(String curso_ano)
	{
		this.curso_ano = curso_ano;
	}

	public String getCurso_modalidad()
	{
		return curso_modalidad;
	}

	public void setCurso_modalidad(String curso_modalidad)
	{
		this.curso_modalidad = curso_modalidad;
	}

	public String getConoce_quien()
	{
		return conoce_quien;
	}

	public void setConoce_quien(String conoce_quien)
	{
		this.conoce_quien = conoce_quien;
	}

	public String getAclaracion()
	{
		return aclaracion;
	}

	public void setAclaracion(String aclaracion)
	{
		this.aclaracion = aclaracion;
	}

	public String getCreated()
	{
		return created;
	}

	public void setCreated(String created)
	{
		this.created = created;
	}

	@Override
	public String toString()
	{
		return "AlumnoDTO [id=" + id + ", apellido=" + apellido + ", nombre=" + nombre + ", sexo=" + sexo + ", fecha_nacimiento="
				+ fecha_nacimiento + ", lugar_nacimiento=" + lugar_nacimiento + ", dni=" + dni + ", cuit=" + cuit
				+ ", telefono_fijo=" + telefono_fijo + ", telefono_celular=" + telefono_celular + ", email=" + email
				+ ", direccion_calle=" + direccion_calle + ", direccion_numero=" + direccion_numero + ", direccion_departamento="
				+ direccion_departamento + ", direccion_otros=" + direccion_otros + ", direccion_localidad=" + direccion_localidad
				+ ", direccion_cp=" + direccion_cp + ", direccion_provincia=" + direccion_provincia + ", direccion_pais="
				+ direccion_pais + ", titulo_secundario=" + titulo_secundario + ", titulo=" + titulo + ", titulo_exp=" + titulo_exp
				+ ", terciario=" + terciario + ", terciario_completo=" + terciario_completo + ", terciario_carrera="
				+ terciario_carrera + ", terciario_institucion=" + terciario_institucion + ", universitario=" + universitario
				+ ", universitario_completo=" + universitario_completo + ", universitario_carrera=" + universitario_carrera
				+ ", universitario_institucion=" + universitario_institucion + ", trabajo=" + trabajo + ", trabajo_lugar="
				+ trabajo_lugar + ", trabajo_cargo=" + trabajo_cargo + ", trabajo_antiguedad=" + trabajo_antiguedad
				+ ", trabajo_telefono=" + trabajo_telefono + ", curso_ano=" + curso_ano + ", curso_modalidad=" + curso_modalidad
				+ ", conoce_quien=" + conoce_quien + ", aclaracion=" + aclaracion + ", created=" + created + "]";
	}

}

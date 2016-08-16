package com.epsisur.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades
{

	public static Date obtenerObjetoFecha(String fechaString)
	{
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-mm-dd");
		Date fecha = null;

		try
		{
			fecha = (Date)formatoDelTexto.parse(fechaString);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
		return fecha;
	}

	public static String formatearDNI(String dni)
	{
		return dni.replace(" ", "").replace("-", "").replace(".", "").replace("/", "").toString();
	}

	public static Boolean validarMail(String mail)
	{

		Boolean mailValido = Boolean.FALSE;
		Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		Matcher mat = pat.matcher(mail);

		if (mat.find())
		{
			mailValido = Boolean.TRUE;
		}

		return mailValido;
	}

}

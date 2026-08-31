package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;


public class Persona {
	String nombre;
	String apellido;
	LocalDate fechaNacimiento;
	
	public Persona (String unNombre,String unApellido, LocalDate unaFecha) {
		nombre = unNombre;
		apellido = unApellido;
		fechaNacimiento = unaFecha;
	}
	
	public int edad () {
		return this.calcularEdad();
	}
	
	public int calcularEdad() {
	    LocalDate fechaActual = LocalDate.now();
		return Period.between(fechaNacimiento, fechaActual).getYears();
	}
	
	public boolean menorQue(Persona otraPersona) {
		int edadDeOtraPersona = otraPersona.edad();
		return this.edad() < edadDeOtraPersona;
	}
	
	
	
}

/* 
 1- No, el objeto externo que le pregunta al objeto persona no conoce el funcionamiento
 de como calcula su edad ni su estado interno, solo le devuelve un int debido al mensaje enviado, en 
 este caso la edad. El mecanismo de abstraccion es encapsulamiento, el estado interno solo lo conoce
 el propio objeto.
  
  
  
  */



	


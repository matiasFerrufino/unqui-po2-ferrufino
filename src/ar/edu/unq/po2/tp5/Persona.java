package ar.edu.unq.po2.tp5;
import java.time.LocalDate;
import java.time.Period;



public class Persona implements Nombrable{
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona (String n,LocalDate f) {
		nombre = n; 
		fechaDeNacimiento = f;
	}
	
	public int edad() {
		return this.calcularEdad();
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		return Period.between(fechaDeNacimiento, fechaActual).getYears();
	}
	
	public boolean menorQue(Persona otraPersona) {
		int edadDeOtraPersona = otraPersona.edad();
		return this.edad() < edadDeOtraPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	

}

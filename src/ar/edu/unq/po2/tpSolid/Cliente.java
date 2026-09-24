package ar.edu.unq.po2.tpSolid;

public class Cliente {
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoMensual;
	
	public Cliente (String n, String a, int e, double s) {
		nombre = n;
		apellido = a;
		edad = e;
		sueldoMensual = s;
	}
	
	public double sueldoNetoAnual() {
		return sueldoMensual*12;
	}
	
	public double sueldoMensual() {
		return sueldoMensual;
	}
	
	public int getEdad() {
		return edad;
	}
}

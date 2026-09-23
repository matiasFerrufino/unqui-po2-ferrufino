package ar.edu.unq.po2.tp4;

public abstract class Ingreso {
	private String mesPercepcion;
	private String concepto;
	protected double montoPercibido;
	
	public Ingreso (String unMes,String unConcepto,double unMonto) {
		mesPercepcion = unMes; 
		concepto = unConcepto;
		montoPercibido = unMonto;
}
	public abstract double montoImponible();
	
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	
	
}

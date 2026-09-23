package ar.edu.unq.po2.tp4;

public class IngresoNormal extends Ingreso {
	 
	
	public IngresoNormal (String unMes, String unConcepto, double unMonto) {
		super(unMes,unConcepto,unMonto);
		
	}
	
	public double montoImponible() {
		return montoPercibido;
	}
	
}

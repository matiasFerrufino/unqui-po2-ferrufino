package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends Ingreso {
private int horasRealizadas; 
	
	public IngresoHorasExtras (String unMes, String unConcepto, double unMonto, int horas) {
		super(unMes,unConcepto,unMonto);
		horasRealizadas = horas;
	}
	
	public double montoImponible() {
		return 0.0;
	}
}

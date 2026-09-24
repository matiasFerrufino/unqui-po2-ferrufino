package ar.edu.unq.po2.tpSolid;

public abstract class SolicitudCredito {
	private Cliente clienteQueSolicita;
	private double montoSolicitado;
	private int cantCuotas;
	
	public SolicitudCredito (Cliente c, double m, int ct) {
		clienteQueSolicita = c;
		montoSolicitado = m; 
		cantCuotas = ct;
	}
	
	public double montoCuotaMensual () {
		return montoSolicitado / cantCuotas;
	}
	
	public double montoSolicitado() {
		return montoSolicitado;
	}
	
	public int cantCuotas() {
		return cantCuotas; 
	}
	
	public Cliente getCliente() {
		return clienteQueSolicita;
	}
	
	public double getIngresoAnualCliente() {
		return clienteQueSolicita.sueldoNetoAnual();
	}
	
	public double getIngresoMensualCliente() {
		return clienteQueSolicita.sueldoMensual();
	}
	
	public abstract boolean esAceptable();
	
	
}

package ar.edu.unq.po2.tpSolid;

public class CreditoPersonal extends SolicitudCredito {
	
	public CreditoPersonal(Cliente c,  double m, int ct) {
		super(c,m,ct);
	}
	
	public boolean esAceptable() {
		return this.ingresosAnualesSuficientes() && this.ingresosMensualesSuficientes();
	}
	
	public boolean ingresosAnualesSuficientes() {
		return this.getIngresoAnualCliente() >= 15000;
	}
	
	public boolean ingresosMensualesSuficientes () {
	   return this.montoCuotaMensual() <= (this.getIngresoMensualCliente() * 0.70);
	}
	
}

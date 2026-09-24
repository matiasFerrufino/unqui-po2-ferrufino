package ar.edu.unq.po2.tpSolid;

public class CreditoHipotecario extends SolicitudCredito {
	private Propiedad garantia;
	
	public CreditoHipotecario(Cliente c, double m, int ct, Propiedad g ) {
		super(c,m,ct);
		garantia = g;
	}
	
	public boolean esAceptable() {
		return this.ingresosMensualesValidos() && this.valorFiscalValido() && this.edadSuficiente();
	}
	
	
	public double cuotasEnAño() {
		return this.cantCuotas() / 12.0;
	}
	
	public boolean edadSuficiente() {
		return this.edadCliente() + this.cuotasEnAño() <= 65;
	}
	
	public boolean valorFiscalValido() {
		return (garantia.valorFiscal() * 0.70) >= this.montoSolicitado();
	}
	
	public boolean ingresosMensualesValidos() {
		return (this.getIngresoMensualCliente() * 0.50) >= this.montoCuotaMensual();
	}
	
	public int edadCliente() {
		return this.getCliente().getEdad();
	}
}

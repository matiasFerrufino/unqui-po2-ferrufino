package ar.edu.unq.po2.tpSolid;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valorFiscal; 
	
	public Propiedad (String d, String dr, double v) {
		descripcion = d;
		direccion = dr;
		valorFiscal = v;
	}
	
	public double valorFiscal() {
		return valorFiscal;
	}

}

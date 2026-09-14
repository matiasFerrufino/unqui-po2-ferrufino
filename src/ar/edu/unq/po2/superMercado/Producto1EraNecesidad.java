package ar.edu.unq.po2.superMercado;

public class Producto1EraNecesidad extends Producto {
	private double descuento;
	
	public Producto1EraNecesidad (String unNombre, double unPrecio, double unDescuento) {
		super (unNombre,unPrecio);
		descuento = unDescuento;
	}
	
	public Producto1EraNecesidad (String unNombre, double unPrecio, boolean unBooleano, double unDescuento) {
		super (unNombre,unPrecio, unBooleano);
		descuento = unDescuento;
	}
	
	public double getPrecio () {
		return precio * descuento;
	}
	
}


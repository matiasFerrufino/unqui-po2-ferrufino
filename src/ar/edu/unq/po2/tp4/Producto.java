package ar.edu.unq.po2.tp4;

public abstract class Producto {
	private double precio;
	
	public Producto (double unPrecio) {
		precio = unPrecio;
	}
	
	public abstract double precio ();
	
	public double getPrecioBase () {
		return precio;
	}
}

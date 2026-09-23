package ar.edu.unq.po2.tp5;

public class Cooperativa extends Producto {
	public Cooperativa (double unPrecio) {
		super (unPrecio);
	}
	
	public double precio() {
		return this.getPrecioBase() - this.descuento();
	}
	private double descuento() {
		return this.getPrecioBase() * 0.10;
	}
}

package ar.edu.unq.po2.tp5;

public class EmpresaTradicional extends Producto {
	public EmpresaTradicional (double unPrecio) {
		super(unPrecio);
	}
	
	public double precio() {
		return this.getPrecioBase();
	}
	
}

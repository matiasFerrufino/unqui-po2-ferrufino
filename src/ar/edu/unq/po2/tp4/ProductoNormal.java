package ar.edu.unq.po2.tp4;

public class ProductoNormal extends Producto {
	
	public ProductoNormal (String unNombre, double unPrecio) {
		super (unNombre,unPrecio);
	}
	
	public ProductoNormal (String unNombre, double unPrecio, boolean unBooleano) {
		super (unNombre,unPrecio,unBooleano);
	}
	
	public double getPrecio () {
		return precio; 
	}
	
	
}

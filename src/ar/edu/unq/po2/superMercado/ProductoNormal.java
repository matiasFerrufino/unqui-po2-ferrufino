package ar.edu.unq.po2.superMercado;

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

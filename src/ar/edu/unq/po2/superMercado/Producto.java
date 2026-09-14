package ar.edu.unq.po2.superMercado;

public abstract class Producto {
	private String nombre;
	protected double precio;
	private boolean precioCuidado;
	
	
	public Producto (String unNombre, double unPrecio) {
		nombre = unNombre;
		precio = unPrecio; 
		precioCuidado = false;
	}
	
	public Producto (String unNombre, double unPrecio, boolean unBooleano) {
		nombre = unNombre;
		precio = unPrecio; 
		precioCuidado = unBooleano;
	}
	
	public abstract double getPrecio();
	
	public String getNombre () {
		return nombre;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	

}



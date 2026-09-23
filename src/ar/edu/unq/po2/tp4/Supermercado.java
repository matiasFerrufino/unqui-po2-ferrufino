package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Supermercado {
	List<Producto> productos = new ArrayList<>();  
	private String nombre;
	private String direccion;
	
	
	public Supermercado (String unNombre, String unaDireccion) {
		nombre = unNombre;
		direccion = unaDireccion;
	}
	
	public double sumPreciosProductos() {
		Stream<Producto> productosStream = productos.stream();
		double sumaPrecios = productosStream.
							   mapToDouble(p-> p.getPrecio()).
							   sum();
		
		return sumaPrecios;
	}
	
	public int cantProductos () {
		return productos.size();
	}
	
	public void addProducto(Producto unProducto) {
		productos.add(unProducto);
	}
	
	public List<Producto> getProductos() {
		return productos;
	}
	
	
	
	
	
	
}

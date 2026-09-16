package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Mercado implements GestorDeStock {
	private List<Producto> stock = new ArrayList<Producto>();
	
	public Mercado (List<Producto> unaListaDeProductos) {
		stock.addAll(unaListaDeProductos);
	}
	
	public void decrementarStock(Producto p) {
		stock.remove(p);
	}
	
	public List<Producto> stock() {
		return stock;
	}
}

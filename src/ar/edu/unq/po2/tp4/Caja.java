package ar.edu.unq.po2.tp4;

public class Caja {
	private double montoAPagar = 0.0;
	private GestorDeStock lugarDeStock; 
	
	public  Caja (GestorDeStock unGestorDeStock) {
		lugarDeStock = unGestorDeStock;
	}
	
	public void registrarProducto(Producto p) {
		montoAPagar += p.precio();
		lugarDeStock.decrementarStock(p);
	}
	
	public double montoAPagar() {
		return montoAPagar;
	}
}


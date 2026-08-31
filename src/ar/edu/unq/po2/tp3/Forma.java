package ar.edu.unq.po2.tp3;

public abstract class Forma{
	private int alto;
	private int ancho;
	private Point origen; 
	
	public Forma (Point unOrigen, int unAlto, int unAncho) {
		origen = unOrigen;
		alto = unAlto; 
		ancho = unAncho;
	}
	
	public Point getOrigen () {
		return origen;
	}
	
	public int getArea() {
	    return ancho * alto;
	}
	
	public int getPerimetro() {
		return (ancho+alto)*2;
	}
	
	public boolean esHorizontal() {
		return ancho > alto;
	}
	
	public boolean esVertical() {
		return alto> ancho;
	}
	
	

}

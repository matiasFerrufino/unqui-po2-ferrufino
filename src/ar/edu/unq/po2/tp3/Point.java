package ar.edu.unq.po2.tp3;

public class Point {
	private int x;
	private int y;
	
	public Point (int unaX, int unaY) {
		x = unaX;
		y = unaY;
	}
	
	public Point () {
		
	}
	
	public void cambiarPunto (int unaX, int unaY) {
		x = unaX;
		y = unaY;
	}
	
	public Point sumarPuntoCon_(Point unPunto) {
	    int otraX = unPunto.getX();
	    int otraY = unPunto.getY();
	    
	    Point nuevoPunto = new Point(x + otraX, y + otraY);
	    return nuevoPunto;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	
	
	
}

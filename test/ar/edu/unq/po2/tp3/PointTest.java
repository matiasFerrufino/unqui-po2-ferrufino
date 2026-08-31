package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	private Point puntoUno;
	private  Point puntoDos;
	private Point puntoCero;
	
	@BeforeEach
	
	public void setup() throws Exception{
		puntoUno = new Point (2,2);
		puntoDos = new Point (3,3);
		puntoCero = new Point();
	}

	@Test
	public void coordenadaX() {
		assertEquals(2, puntoUno.getX());
	}
	
	@Test
	public void coordenadaY() {
		assertEquals(2, puntoUno.getY());
	}
	
	public void puntoCero() {
		assertEquals(0, puntoCero.getX());
		assertEquals(0, puntoCero.getY());
	}
	
	@Test
	void nuevoPuntoSumado() {
		Point puntoNuevo = puntoUno.sumarPuntoCon_(puntoDos);
		assertEquals(5, puntoNuevo.getX());
		assertEquals(5, puntoNuevo.getY());
		
	}
	

}

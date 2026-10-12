package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.Cuadrado;
import ar.edu.unq.po2.tp2.Point;

class CuadradoTest {

	private Cuadrado cuadrado;
	private Point origen;
	
	
	@BeforeEach 
	
	public void setup() throws Exception {
		origen = new Point(1,1);
		cuadrado = new Cuadrado (origen,5);
	}
	

	@Test
	public void areaCuadrado() {
		assertEquals(25, cuadrado.getArea());
	}
	
	@Test 
	public void noEsHorizontalNiVertical() {
		assertFalse(cuadrado.esHorizontal());
		assertFalse(cuadrado.esVertical());
	}
	
	
	

}

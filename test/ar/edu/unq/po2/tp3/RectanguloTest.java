package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	private Rectangulo rectangulo;
	private Point origen;
	
	
	@BeforeEach 
	
	public void setup() throws Exception {
		origen = new Point(1,1);
		rectangulo = new Rectangulo (origen,3,4);
	}
	

	@Test
	public void areaRectangulo() {
		assertEquals(12, rectangulo.getArea());
	}
	
	@Test 
	public void rectanguloHorizontal() {
		assertTrue(rectangulo.esHorizontal());
		assertFalse(rectangulo.esVertical());
	}
	
	@Test 
	public void rectanguloVertical() {
		Rectangulo rectanguloVert = new Rectangulo(origen, 4,3);
		assertFalse(rectanguloVert.esHorizontal());
		assertTrue(rectanguloVert.esVertical());
	}
	
	
	

}

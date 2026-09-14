package ar.edu.unq.po2.superMercado;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTest {
	Supermercado laVarelita;
	Supermercado elCruce;
	ProductoNormal harina;
	ProductoNormal fideos;
	Producto1EraNecesidad carne;
	Producto1EraNecesidad leche;
	
	@BeforeEach
	public void setup() throws Exception {
		laVarelita = new Supermercado ("La Varelita","Avenida San Martin 1859");
		elCruce = new Supermercado ("El Cruce","Avenida Acapulco 2500");
		harina = new ProductoNormal ("Harina",2500);
		fideos = new ProductoNormal ("Fideos", 1500,true); 
		carne = new Producto1EraNecesidad("Carne", 4000,0.9);
		leche = new Producto1EraNecesidad("Leche", 37000, 0.9);
		
		laVarelita.addProducto(carne);
		laVarelita.addProducto(fideos);
		laVarelita.addProducto(harina);
		
		
	}

	@Test
	void esProductoDePrecioCuidado() {
		assertTrue(fideos.esPrecioCuidado());
		assertFalse(harina.esPrecioCuidado());
	}
	
	@Test 
	void precioDelProducto () {
		assertEquals(2500.0,harina.getPrecio());
		assertEquals(3600.0,carne.getPrecio());
	}
	
	@Test
	void cantProductosEnMercado () {
		assertEquals(3, laVarelita.cantProductos());
		assertEquals(0, elCruce.cantProductos());
	}
	
	@Test
	void sumaTotalPreciosMercado () {
		assertEquals(7600.0, laVarelita.sumPreciosProductos());
	}
	
	@Test
	void mercadoSinProductos() {
		assertTrue(elCruce.getProductos().isEmpty());
	}
	

}

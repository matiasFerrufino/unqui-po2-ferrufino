package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoParte1 {
	Mercado mercadoCentral;
	Caja cajaUno;
	Producto harina1;
	Producto harina2;
	Producto leche;
	Producto carne;
	
	List<Producto> listaProductos;
	
	@BeforeEach 
	 public void setup() throws Exception {
		harina1 = new Cooperativa(2500);
		harina2 = new Cooperativa (2500);
		leche = new EmpresaTradicional(3000);
		carne = new EmpresaTradicional(10000);
		
		listaProductos = new ArrayList<>(Arrays.asList(harina1,harina2,leche,carne));
		
		mercadoCentral = new Mercado(listaProductos);
		cajaUno = new Caja(mercadoCentral);
		
	}

	@Test
	void montoAPagar() {
		assertEquals(0.0, cajaUno.montoAPagar());
		cajaUno.registrarProducto(leche);
		assertEquals(3000.0, cajaUno.montoAPagar());
	}
	
	@Test 
	void reduccionStock () {
		assertTrue(mercadoCentral.stock().contains(harina1));
		cajaUno.registrarProducto(harina1);
		assertFalse(mercadoCentral.stock().contains(harina1));
	}
	
	@Test 
	void descuentoDeProducto () {
		assertEquals(0.0, cajaUno.montoAPagar());
		cajaUno.registrarProducto(harina1);
		assertEquals(2250.0, cajaUno.montoAPagar());
	}
	
	

}

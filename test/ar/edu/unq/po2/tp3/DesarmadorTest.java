package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorTest {
	
	/*Instancio la clase sin el constructor*/
	private Counter counter;
	
	
	@BeforeEach
	public void setUp() throws Exception {
	/*Se crea el contador*/
	 counter = new Counter(List.of(123,433,455,789,22,23)); 
	
	}
	
	/*Realizacion de tests*/
	@Test
	public void numeroConMasDigitosPares() {
		assertEquals(22,counter.desarmador());
	}
	
	
	/*Devuelve el primero que encuentra en caso que no sea par ninguno*/
	@Test
	public void numeroSinDigitosImpares() {
		Counter counterSinPares = new Counter (List.of(355,33,99,97));
		assertEquals(355, counterSinPares.desarmador());
	}
	
	@Test
	public void listaVacia() {
		Counter counterVacio = new Counter(List.of()); 
	    assertThrows (IllegalArgumentException.class,()-> {counterVacio.desarmador();});
	    
	}
	
}
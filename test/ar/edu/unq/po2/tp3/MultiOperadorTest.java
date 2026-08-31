package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class MultiOperadorTest {

	
	
	/*Devuelve el primero que encuentra en caso que no sea par ninguno*/
	@Test
	public void sumaDeNumeros() {
		MultiOperador listaNumeros = new MultiOperador(List.of(2,-2,4));
		assertEquals(4, listaNumeros.sumarTodo());
	}
	
	@Test
	public void restaDeNumeros() {
	    MultiOperador listaNumeros = new MultiOperador(List.of(-5,-5,5));
	    assertEquals(-5, listaNumeros.restarTodo());
	    
	}
	
	@Test
	public void multiplicacionDeNumeros() {
	    MultiOperador listaNumeros = new MultiOperador(List.of(2,-5,-2));
	    assertEquals(20, listaNumeros.multiplicarTodo());
	    
	}
	
	
	@Test
	public void listaVacia () {
		MultiOperador listaVacia = new MultiOperador(List.of());
		assertThrows (IllegalArgumentException.class,()-> {listaVacia.sumarTodo();});
		
	}
}
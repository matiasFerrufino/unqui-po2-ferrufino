package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	/*Instancio la clase sin el constructor*/
	private Counter counter;
	
	
	@BeforeEach
	public void setUp() throws Exception {
	/*Se crea el contador*/
	 counter = new Counter(List.of(3, 2, 3, 3, 5,3,3,3,3,3)); 
	
	}
	
	
	/*Realizacion de tests*/
	@Test
	public void conteoDeImpares() {
		assertEquals(9,counter.countNumImpar());
	
	}
	
	@Test
	public void conteoDePares() {
		assertEquals(1,counter.countNumPar());
	
	}
	
	@Test
	public void conteoDeMultiploDeDos() {
		assertEquals(1,counter.countNumMultiploDe_(2));
	
	}
	
	

}

package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploTest {

	/*Instancio la clase sin el constructor*/
	private Counter counter;
	
	
	@BeforeEach
	public void setUp() throws Exception {
	/*Se crea el contador*/
	 counter = new Counter(List.of()); 
	
	}
	
	/*Realizacion de tests*/
	@Test
	public void encuentraUnMultiplo() {
		assertEquals(987,counter.multiploDe_YDe_(3,7));
	}
	
	
	/*Devuelve el primero que encuentra en caso que no sea par ninguno*/
	@Test
	public void noEncuentraUnMultiplo() {
		assertEquals(-1, counter.multiploDe_YDe_(2,501));
	}
	
	@Test
	public void ceroEnAmbosParametros() {
	    assertThrows (IllegalArgumentException.class,()-> {counter.multiploDe_YDe_(0,0);});
	    
	}
	
	
}

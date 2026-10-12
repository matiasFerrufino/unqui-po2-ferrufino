package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTest {
	
	@BeforeEach  
	PokerStatus pokerStatus;
	
	public void setup() throws Exception {
		pokerStatus = new PokerStatus();
	}

	@Test
	void esPoker() {
		assertTrue(pokerStatus.verificar("1P","1C","1D","1T","2T"));
	}
	
	@Test
	void noEsPoker() {
		assertFalse(pokerStatus.verificar("2P","1C","1D","1T","2T"));
	}

}

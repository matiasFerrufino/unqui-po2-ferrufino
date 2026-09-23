package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.IngresoHorasExtras;
import ar.edu.unq.po2.tp4.IngresoNormal;
import ar.edu.unq.po2.tp4.Trabajador;

class ImpuestosTest {
	Trabajador matias;
	IngresoNormal ingresoNormal;
	IngresoHorasExtras ingresoHorasExtras;
	
	
	@BeforeEach
	public void setup() throws Exception {
		matias = new Trabajador ();
		ingresoNormal = new IngresoNormal ("Junio", "Pago de mes", 2500);
		ingresoHorasExtras = new IngresoHorasExtras ("Septiembre", "Horas Extras", 3500, 20);
		
		matias.addIngreso(ingresoNormal);
		matias.addIngreso(ingresoHorasExtras);
	}

	@Test
	void totalPercibido() {
		assertEquals(6000.0, matias.getTotalPercibido());
	}
	
	@Test 
	void montoImponible() {
		assertEquals(2500.0, matias.getMontoImponible());
	}
	
	@Test 
	void impuestoAPagar() {
		assertEquals(50.0, matias.getImpuestoAPagar());
	}

}

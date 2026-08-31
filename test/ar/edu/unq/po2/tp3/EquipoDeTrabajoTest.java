package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {
	EquipoDeTrabajo equipo;
	Persona p1;
	Persona p2;
	Persona p3;
	Persona p4;
	Persona p5;
	
	@BeforeEach
	// 4. Instanciar un EquipoDeTrabajo, 5 Personas y agregarlas
	
	public void setup() throws Exception {
		equipo = new EquipoDeTrabajo("Desarrollo Backend");
		p1 = new Persona("Carlos","Perez", LocalDate.of(2000, 5, 15));
		p2 = new Persona("Ana","Gimenez", LocalDate.of(1995, 8, 22));
		p3 = new Persona("Luis","Enrique", LocalDate.of(1990, 11, 10));
		p4 = new Persona("Marta","Sanchez", LocalDate.of(2003, 3, 5));
		p5 = new Persona("Pedro","Pascal" ,LocalDate.of(1998, 1, 30));
		
		equipo.agregarIntegrante(p1);
	    equipo.agregarIntegrante(p2);
	    equipo.agregarIntegrante(p3);
	    equipo.agregarIntegrante(p4);
	    equipo.agregarIntegrante(p5);
	}
	

	// 5. Pedir el promedio de edad e imprimir el resultado devuelto
	@Test 
	public void promedioEdad () {
		double promedio = equipo.promedioDeEdad();
		System.out.println("El promedio de edad del equipo es: " + promedio);
	}
	
}

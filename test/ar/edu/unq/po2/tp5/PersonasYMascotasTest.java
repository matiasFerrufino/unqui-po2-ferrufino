package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonasYMascotasTest {
	Persona carlos;
	Persona jorge;
	Mascota raiden;
	Mascota dobby;
	List<Nombrable> listaDeNombres;
	List<String> listaStrings; 
	
	public List<String> listaDeNombres(List<Nombrable> unaLista){
		
		return unaLista.stream().map(n -> n.getNombre()).collect(Collectors.toList());
	}
	
	@BeforeEach
	
	
	public void setup () throws Exception {
		carlos = new Persona("Carlos",LocalDate.of(1995, 9, 10) );
		jorge = new Persona("Jorge",LocalDate.of(1990, 5, 15) );
		raiden = new Mascota ("Raiden", "Pastor Aleman");
		dobby = new Mascota ("Dobby", "Caniche Toy");
		
		listaDeNombres = new ArrayList<Nombrable>(List.of(carlos,jorge,raiden,dobby));
		
		
		
		
	}

	@Test
	void corroborarNombres() {
		assertTrue(this.listaDeNombres(listaDeNombres).contains("Carlos"));
		assertTrue(this.listaDeNombres(listaDeNombres).contains("Jorge"));
		assertTrue(this.listaDeNombres(listaDeNombres).contains("Raiden"));
		assertTrue(this.listaDeNombres(listaDeNombres).contains("Dobby"));
	}

}

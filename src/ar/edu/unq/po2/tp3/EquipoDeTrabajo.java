package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	String nombre;
	List<Persona> integrantes = new ArrayList<>();
	
	public EquipoDeTrabajo (String unNombre) {
		nombre = unNombre;
	}
	
	public void agregarIntegrante (Persona p) {
		integrantes.add(p);
	}
	
	public int sumaEdades() {
		int edadesSumadas = 0;
		for (Persona p: integrantes) {
			edadesSumadas += p.edad();
		}
		return edadesSumadas;
	}
	
	public int cantIntegrantes() {
		return integrantes.size();
	}
	
	public int promedioDeEdad() {
		return this.sumaEdades() / this.cantIntegrantes();
	}
	
	
	
	

}


package ar.edu.unq.po2.tp4;

public class Mascota implements Nombrable {
	private String nombre;
	private String raza;
	
	public Mascota(String n, String r) {
		nombre = n;
		raza = r;
	}
	
	public String getNombre() {
		return nombre;
	}
}

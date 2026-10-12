package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private List<Correo> correos = new ArrayList<>();
	
	public int contarCorreos() {
		return correos.size();
	}
	
	public void borrarCorreo(Correo unCorreo) {
		if (correos.contains(unCorreo)) {
			correos.remove(unCorreo);
		}
		else {
			throw new IllegalArgumentException("El correo que intentas eliminar no existe.");
		}
	}
	
	public void addCorreo(Correo unCorreo) {
		correos.add(unCorreo);
	}
}

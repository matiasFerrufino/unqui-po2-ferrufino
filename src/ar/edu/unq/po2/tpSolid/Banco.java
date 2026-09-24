package ar.edu.unq.po2.tpSolid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Banco {
	private List<SolicitudCredito> solicitudes = new ArrayList<>();
	private List<SolicitudCredito> solicitudesAprobadas = new ArrayList<>();
	private List <Cliente> clientes = new ArrayList<>();
	
	public void addCliente(Cliente unCliente) {
		clientes.add(unCliente);
	}
	
	public void registrarSolicitud (SolicitudCredito unaSolicitud) {
		solicitudes.add(unaSolicitud);
	}
	
	public void evaluarSolicitudes() {
		Stream <SolicitudCredito> solicitudesStream = solicitudes.stream();
		
		 solicitudesStream.forEach(s -> this.addSolicitudAprobada(s));
	}
	
	public void addSolicitudAprobada(SolicitudCredito unaSolicitud) {
		if (unaSolicitud.esAceptable()) {
			solicitudesAprobadas.add(unaSolicitud);
		}
	}

}

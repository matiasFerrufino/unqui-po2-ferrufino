package ar.edu.unq.po2.tp5;

public class Correo {
	private String asunto;
	private String destinatario;
	private String cuerpo;
	
	public Correo(String unAsunto, String unDestinatario, String unCuerpo) {
		asunto = unAsunto;
		destinatario = unDestinatario;
		cuerpo = unCuerpo;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	
	public String getCuerpo() {
		return cuerpo; 
	}
	
	

}

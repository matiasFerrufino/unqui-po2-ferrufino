package ar.edu.unq.po2.tpSolid;

public class ClienteEMail {
	
	 private Servidor servidor;
	 private String nombreUsuario;
	 private String passusuario;
	 private Carpeta inbox;
	 private Carpeta borrados;
	
	public ClienteEMail(ServidorPop unServidor, String nombreDeUsuario, String pass){
		servidor = unServidor;
		nombreUsuario = nombreDeUsuario;
		passusuario = pass;
		inbox = new Carpeta();
		borrados = new Carpeta();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		inbox.borrarCorreo(correo);
		borrados.addCorreo(correo);
	}
	
	public int contarBorrados(){
		return borrados.contarCorreos();
	}
	
	public int contarInbox(){
		return inbox.contarCorreos();
	}
	
	public void eliminarBorrado(Correo correo){
		borrados.borrarCorreo(correo);
	}
	
	public void recibirNuevos(){
		servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		servidor.enviar(correo);
	}

}

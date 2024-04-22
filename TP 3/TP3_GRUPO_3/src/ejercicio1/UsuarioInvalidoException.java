package ejercicio1;


public class UsuarioInvalidoException extends RuntimeException {
	
	private final String mensajeError = "Usuario invalido" ;
	
	
	@Override
	public String getMessage() {
		
		return mensajeError;
	}
	
	
	
}


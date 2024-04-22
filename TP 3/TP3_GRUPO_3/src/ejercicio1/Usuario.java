package ejercicio1;

public class Usuario {
	
	private final int id=0;   
	private String nombredeusuario;
	
	public Usuario() 
	{
		
	}
	

    public static boolean verificarUsuarioInvalido(String nombreUsuario) throws UsuarioInvalidoException 
    {
        Boolean hayNumero = false;
        Boolean hayMayuscula = false;
        Boolean hay10Caracters = false;

        if (nombreUsuario.length() > 9) {
        	 hay10Caracters = true;

        }
        
        for (char c : nombreUsuario.toCharArray()) {
            if (Character.isDigit(c)) {
                hayNumero = true;
            }
            if (Character.isUpperCase(c)) {
                hayMayuscula = true;
            }
        }

        if (!hayNumero || !hayMayuscula || !hay10Caracters) {
            UsuarioInvalidoException exc1 = new  UsuarioInvalidoException();
            throw exc1;
        }
        
        
        return hayNumero && hayMayuscula && hay10Caracters;
        
        
        
    }
		
}

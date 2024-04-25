package ejercicio1;

public class Usuario {
	
	private final int id=0;   
	private String nombredeusuario;
	
	public Usuario() 
	{
		
	}
		
    public String getNombredeusuario() {
		return nombredeusuario;
	}

	public void setNombredeusuario(String nombredeusuario) {
		this.nombredeusuario = nombredeusuario;
	}

	public int getId() {
		return id;
	}

	public static void verificarUsuarioInvalido(String nombreUsuario) throws UsuarioInvalidoException 
    {
        Boolean hayNumero = false;
        Boolean hayMayuscula = false;


        if (nombreUsuario.length() < 10)
        {
        	UsuarioInvalidoException exc = new UsuarioInvalidoException();
        	 throw exc;
        }
        
        for ( char c : nombreUsuario.toCharArray() ) 
        {
        	
            if ( Character.isDigit(c) )
            {
                hayNumero = true;
            }
            if ( Character.isUpperCase(c) )
            {
                hayMayuscula = true;
            }
        }

        if ( !hayNumero || !hayMayuscula )
        {
            UsuarioInvalidoException exc1 = new  UsuarioInvalidoException();
            throw exc1;
        }
          
    }	
	
}

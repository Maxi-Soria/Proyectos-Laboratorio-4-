package ejercicio1;
import java.io.BufferedReader;
import java.util.TreeSet;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
	
	
	private String ruta;
	
	public String getRuta()
	{
		return ruta;
	}

	public void setRuta(String ruta)
	{
		this.ruta = ruta;
	}
	
	public boolean crearArchivo(String ruta)
	{
		
		FileWriter escritura;
	
		try 
		{
			escritura = new FileWriter(ruta, true);
			escritura.write("");
			escritura.close();
			return true;
		}
		catch (IOException ex)
		{
			//ex.printStackTrace();
			System.err.println("No se pudo completar la operación debido a: \n" + ex.getMessage());

		}
		return false;
		
	}
	
	public boolean existeArchivo()
	{
		
		File archivo = new File(ruta);
		
		if( archivo.exists() )
		      return true;
		return false;
	}
	
	public void agregarRegistro(String registro) 
	{
		try 
		{
			FileWriter entrada  = new FileWriter(ruta, true);
			BufferedWriter miBuffer = new BufferedWriter(entrada);
			
			miBuffer.write(registro);
			miBuffer.close();
			entrada.close();
			
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void leerRegistro() 
	{
		
		FileReader entrada;
		
		try 
		{
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea = "";
			
			while(linea != null)
			{
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();
			
		}
		catch (IOException e)
		{
			System.out.println("No se encontro el archivo");
		}
		
	}
	
	public void mostrarOrdenado() {
	    TreeSet<String> listaOrdenada = new TreeSet<>((s1, s2) -> {
	        String nombreUsuario1 = s1.substring(s1.indexOf('-') + 1);
	        String nombreUsuario2 = s2.substring(s2.indexOf('-') + 1);
	        return nombreUsuario1.compareTo(nombreUsuario2);
	    });

	    TreeSet<String> usuariosInvalidos = new TreeSet<>();

	    try {
	        FileReader entrada = new FileReader(ruta);
	        BufferedReader miBuffer = new BufferedReader(entrada);

	        String linea;
	        while ((linea = miBuffer.readLine()) != null) {

	            if (linea.trim().isEmpty()) {
	                continue;
	            }

	            String user = obtenerusuario(linea);

	            try {
	                Usuario.verificarUsuarioInvalido(user);
	                listaOrdenada.add(linea);
	            } catch (UsuarioInvalidoException e) {
	            	 System.out.println("El usuario '" + user + "' no es válido.");
	            }
	        }

	        System.out.println("Lista de usuarios:");
	        for (String entradaOrdenada : listaOrdenada) {
	            System.out.println(entradaOrdenada);
	        }

	        if (!usuariosInvalidos.isEmpty()) {
	            System.out.println("\n Usuarios inválidos:");
	            for (String usuarioInvalido : usuariosInvalidos) {
	                System.out.println(usuarioInvalido);
	            }
	        }

	        miBuffer.close();
	        entrada.close();

	    } catch (IOException e) {
	        System.out.println("No se encontró el archivo");
	    }
	}
	
	public String obtenerusuario(String idUsuario) {
		int indiceGuion = idUsuario.indexOf('-');
		
		String user = idUsuario.substring(indiceGuion+1);
		return user;
	}
	
		
}
		
		
		
		
		
		
	
	

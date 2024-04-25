package ejercicio1;



public class Main {

	public static void main(String[] args) {
		
		Archivo archivo = new Archivo();
		archivo.setRuta("Usuarios.txt");
		
		
		try {
		
			if(archivo.existeArchivo()) {
				System.out.println(" Existe archivo \n");
		
			
			}else {
				System.out.println("\n No existe archivo \n");
				archivo.crearArchivo(archivo.getRuta());
			}
					
		} catch(RuntimeException e) {
			//e.getMessage();
		}
		
		archivo.mostrarOrdenado();
			
	}

}

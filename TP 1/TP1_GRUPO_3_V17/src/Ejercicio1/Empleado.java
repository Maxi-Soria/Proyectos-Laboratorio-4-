package Ejercicio1;

public class Empleado 
{
	   //atributo 
	
		private final int id;        //   modifiqu� el ID para que sea constante
		private String nombre;
		private int edad;	
		private static int contador = 1000;
		
		public Empleado()            //  creo el primer constructor sin par�metros
		{
			this.id = contador;
			contador ++;
			this.nombre = "Sin nombre";
			this.edad = 99;
		}
		
		
		public Empleado(String nombre, int edad)    //  Creo el constructor con par�metros
		{
			this.id = contador++;
			this.nombre = nombre;
			this.edad = edad;
		}

		//getters and setters
		
		public int getId()
		{
			return id;
		}
		
		public String getNombre()
		{
			return nombre;
		}
		
		public void setNombre(String nombre) 
		{
			this.nombre = nombre;
		}
		
		public int getEdad() 
		{
			return edad;
		}
		
		public void setEdad(int edad)
		{
			this.edad = edad;
		}
		
		// Creamos un m�todo static ( devuelve el pr�ximo Id a ser generado )
		
		public static int devuelveProximoId() 
		{
			return contador;
		}

		@Override
		public String toString()
		{
			return "Empleado id= " + id + ", nombre= " + nombre + ", edad= " + edad;
		}
	 	
}

package Ejercicio1;

public class Empleado 
{
	   //atributo 
	
		private final int id;        //   modifiqué el ID para que sea constante
		private String nombre;
		private int edad;	
		private static int contador = 1000;
		
		public Empleado()            //  creo el primer constructor sin parámetros
		{
			this.id = contador;
			contador ++;
			this.nombre = "Sin nombre";
			this.edad = 99;
		}
		
		
		public Empleado(String nombre, int edad)    //  Creo el constructor con parámetros
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
		
		// Creamos un método static ( devuelve el próximo Id a ser generado )
		
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

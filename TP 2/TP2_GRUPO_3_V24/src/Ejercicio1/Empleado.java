package Ejercicio1;

public class Empleado 
{  	
	
		private final int id;        
		private String nombre;
		private int edad;	
		private static int contador = 1000;
		
		public Empleado()         
		{
			this.id = contador;
			contador ++;
			this.nombre = "Sin nombre";
			this.edad = 99;
		}	
		
		public Empleado(String nombre, int edad)    
		{
			this.id = contador++;
			this.nombre = nombre;
			this.edad = edad;
		}
		
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

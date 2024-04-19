package Ejercicio1;

public class Principal {

	public static void main(String[] args) { // Incluimos el main en clase principal
		
		//creamos los empleados a travez de constructor
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado();
		
		Empleado empleado3 = new Empleado("Daniel Kloster", 45);
		Empleado empleado4 = new Empleado("Leonel Messi", 36);
		
		Empleado empleado5 = new Empleado();
		empleado5.setNombre("Angel Simon");
		empleado5.setEdad(35);
		
		Empleado[] vec = new Empleado[5];
		
		vec[0] = empleado1;
		vec[1] = empleado2;
		vec[2] = empleado3;
		vec[3] = empleado4;
		vec[4] = empleado5;
		
		//Mostramos dos de forma directa. 
		//(Usé println en vez de print para generar un salto de línea y que quede prolijo)
		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());
		
		//Usamos un ciclo
		int x;
		
		for(x=2;x<5;x++) {
			System.out.println(vec[x].toString());
		}
		
		//Devuelve próximo ID luego de los 5 empleados instanciados
		System.out.print("Próximo ID: " + Empleado.devuelveProximoId());
		
	}
}

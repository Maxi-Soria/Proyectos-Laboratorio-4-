package Ejercicio1;

import java.util.ArrayList;
import java.util.ListIterator;


public class MainEjercicio1_a {

	public static void main(String[] args) {
		
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		
		listaProfesores.add(new Profesor("Daniel", 52, "Docente", 25));
		listaProfesores.add(new Profesor("Daniela", 30, "Docente", 12));
		listaProfesores.add(new Profesor("Angel", 38, "Docente", 15));
		listaProfesores.add(new Profesor("Brian", 40, "Docente", 16));
		listaProfesores.add(new Profesor("Maxi", 36, "Docente", 10));
		
		
		ListIterator<Profesor> it = listaProfesores.listIterator();
		
		while(it.hasNext()) {
			Profesor registro = it.next();
			System.out.println(registro);
			
		}
		
	}

}

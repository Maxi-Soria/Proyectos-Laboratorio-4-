package Ejercicio1;
import java.util.TreeSet;
import java.util.Iterator;


public class MainEjercicio1_b {

	public static void main(String[] args) {
		
		TreeSet<Profesor> listaProfesores = new TreeSet<Profesor>();
		
		listaProfesores.add(new Profesor("Maxi",35,"Ayudante",15));
		listaProfesores.add(new Profesor("Gaston",30,"Docente",12));
		listaProfesores.add(new Profesor("Ariel",38,"Docente",11));
		listaProfesores.add(new Profesor("Gonzalo",35,"Docente",20));
		listaProfesores.add(new Profesor("Emmanuel",40,"Ayudante",6));
		
		System.out.println("Ordenados por mayor antiguedad");
		
	Iterator<Profesor> it = listaProfesores.iterator();
	
	while(it.hasNext()) {
		Profesor p = (Profesor) it.next();
		
		System.out.println(p.toString());
	}
	
	Profesor profesor1 = new Profesor("Thiago",20,"Docente",25);
	Profesor profesor2 = new Profesor("Thiago",20,"Docente",25);
	
	if(profesor1.equals(profesor2)) {
		System.out.println("Es el mismo profesor");
	}else {
		System.out.println("No es el mismo profesor");
	}
		
	}
		
}
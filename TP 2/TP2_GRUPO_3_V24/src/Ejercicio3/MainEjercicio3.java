package Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;


public class MainEjercicio3 {

	public static void main(String[] args) 
	{
			
			ArrayList<Edificio> lista = new ArrayList<Edificio>();
			
			lista.add(new Polideportivo("PoliGarín",155.5, 1));
			lista.add(new Polideportivo("PoliMalvinas", 142.7, 1));
			lista.add(new Polideportivo("POliAmor", 131.4, 2));
			lista.add(new EdificioOficinas(10, 500));
			lista.add(new EdificioOficinas(15, 600));
			
			ListIterator<Edificio> it = lista.listIterator();
			
			while(it.hasNext()) {
				Edificio registro = it.next();
				System.out.println(registro+"\n");
				
			}
			
	}
}

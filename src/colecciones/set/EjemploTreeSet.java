package colecciones.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import colecciones.modelo.Alumno;

public class EjemploTreeSet {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>((a, b) -> {
			return b.compareTo(a);
		});
		ts.add("Daniel");
		ts.add("Alexander");
		ts.add("Carlos");
		ts.add("Eurelio");
		ts.add("Barbosa");

		Set<Integer> numeros = new TreeSet<>((a, b) -> {
			return b.compareTo(a);
		});
		numeros.add(10);
		numeros.add(1);
		numeros.add(5);
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);

		System.out.println(ts);
		System.out.println(numeros);

//		OTRO EJEMPLO UTILIZANDO UNA CLASE ALUMNO
		Set<Alumno> al = new TreeSet<>();
		al.add(new Alumno(0, "Barbasa"));
		al.add(new Alumno(11, "Alexander"));
		al.add(new Alumno(18, "Daniel"));
		al.add(new Alumno(16, "Carlos"));
		al.add(new Alumno(12, "Eurelio"));

		System.out.println(al);

		// DIFERENTES FORMAS DE ITERAR UN SET SEA HASHSET O TREESET
		System.out.println("\nFor iterator:");
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Alumno alumno = (Alumno) iterator.next();
			System.out.println(alumno.getNota());
		}
		
		System.out.println("\nForeach:");
		for (Alumno alumno : al) {
			System.out.println(alumno.getNombre());
		}

	}

}

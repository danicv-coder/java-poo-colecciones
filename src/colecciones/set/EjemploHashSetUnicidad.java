package colecciones.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import colecciones.modelo.Alumno;

public class EjemploHashSetUnicidad {

	public static void main(String[] args) {

		Set<Alumno> al = new HashSet<>();
		al.add(new Alumno(13, "Barbasa"));
		al.add(new Alumno(11, "Alexander"));
		al.add(new Alumno(18, "Daniel"));
		al.add(new Alumno(16, "Carlos"));
		al.add(new Alumno(12, "Eurelio"));
		al.add(new Alumno(16, "Daniel"));
		List<Alumno> alum = new ArrayList<>(al);
		Collections.sort(alum);
		System.out.println(al);
		System.out.println(alum);
		System.out.println("");
// DIFERENTES FORMAS DE ITERAR UN SET SEA HASHSET O TREESET
		System.out.println("For clasico");
		for (int i = 0; i < alum.size(); i++) {
			System.out.println(alum.get(i));
		}
		System.out.println("\nFor iterator");
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Alumno alumno = (Alumno) iterator.next();
			System.out.println(alumno);
		}
		System.out.println("\nForeach");
		for (Alumno alumno : al) {
			System.out.println(alumno);
		}

	}

}

package colecciones.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import colecciones.modelo.Alumno;

public class EjemploListComparableComparator {

	public static void main(String[] args) {

		List<Alumno> al = new ArrayList<>();
		al.add(new Alumno(13, "Barbasa"));
		al.add(new Alumno(11, "Alexander"));
		al.add(new Alumno(18, "Daniel"));
		al.add(new Alumno(16, "Carlos"));
		al.add(new Alumno(12, "Eurelio"));
		al.add(new Alumno(16, "Daniel"));

//		Collections.sort(al, (a, b) -> {
//			return a.getNombre().compareTo(b.getNombre());
//		});
		// OTRA FORMA DE HACERLO
//		al.sort((a, b) ->{
//			return a.getNombre().compareTo(b.getNombre());
//		});
		// OTRA FORMA DE HACERLO
		al.sort(Comparator.comparing((Alumno a) -> a.getNota()));
		System.out.println(al);
		al.forEach(System.out::println);
	}

}

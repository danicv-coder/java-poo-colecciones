package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EjemploHashSet {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		hs.add("Daniel");
		hs.add("Alexader ");
		hs.add("Andres");
		hs.add("Juan");
		hs.add("Eurelio");
		hs.add("Jefferson");
		hs.add("Jefferson");

		List<String> list = new ArrayList<>(hs);
		Collections.sort(list);

		System.out.println(hs);
		System.out.println(list);

//	EJEMPLO DE ELEMENTOS DUPLICADO Y GUARDAR EN OTRO ARREGLO O SET

		String[] nombres = { "Daniel", "Alexander", "Andres", "Juan", "Fernando", "Daniel", "Juan" };
		Set<String> unico = new HashSet<>();
		Set<String> duplicados = new HashSet<>();

		for (String nombre : nombres) {
			if (!unico.add(nombre)) {
				System.out.println("Nombres duplicados: " + nombre);
				duplicados.add(nombre);
			}
		}
		unico.remove(duplicados);
		System.out.println("Lista de nombres: " + unico);
		System.out.println("Lista de nombres duplicados:" + duplicados);
	}

}

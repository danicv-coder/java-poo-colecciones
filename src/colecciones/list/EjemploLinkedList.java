package colecciones.list;

import java.util.LinkedList;
import java.util.List;

import colecciones.modelo.Alumno;

public class EjemploLinkedList {

	public static void main(String[] args) {

		LinkedList<Alumno> enlazda = new LinkedList<>();
		System.out.println(enlazda + ", size = " + enlazda.size());
		System.out.println("Esta vacia: " + enlazda.isEmpty());
		enlazda.add(new Alumno(13, "Barbasa"));
		enlazda.add(new Alumno(11, "Alexander"));
		enlazda.add(new Alumno(18, "Daniel"));
		enlazda.add(new Alumno(16, "Carlos"));
		enlazda.add(new Alumno(12, "Eurelio"));
		enlazda.add(new Alumno(16, "Daniel"));
		enlazda.set(5, new Alumno(4, "Owins"));

		System.out.println(enlazda + ", size = " + enlazda.size());

		enlazda.addFirst(new Alumno(19, "Thomas"));
		enlazda.addLast(new Alumno(14, "Jorge"));
		System.out.println(enlazda + ", size = " + enlazda.size());
		System.out.println("Primer elemento: " + enlazda.getFirst() + " utlimo elemento: " + enlazda.getLast());
		System.out.println("Primer elemento: " + enlazda.peekFirst() + " utlimo elemento: " + enlazda.peekLast());


	}

}

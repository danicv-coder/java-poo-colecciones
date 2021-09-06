package colecciones.list;

import java.util.ArrayList;
import java.util.List;

import colecciones.modelo.Alumno;

public class EjemploArrayList {

	public static void main(String[] args) {

		List<Alumno> al = new ArrayList<>();
		System.out.println(al + ", size = " + al.size());
		System.out.println("Esta vacia: " + al.isEmpty());
		al.add(new Alumno(13, "Barbasa"));
		al.add(new Alumno(11, "Alexander"));
		al.add(new Alumno(18, "Daniel"));
		al.add(new Alumno(16, "Carlos"));
		al.add(new Alumno(12, "Eurelio"));
		al.add(new Alumno(16, "Daniel"));
		al.set(5, new Alumno(4, "Owins"));

		al.remove(new Alumno(3, "Owins"));

		System.out.println(al + ", size = " + al.size());

	}

}

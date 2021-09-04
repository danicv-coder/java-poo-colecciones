package colecciones.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
	private int nota;
	private String nombre;

	public Alumno(int nota, String nombre) {
		super();
		this.nota = nota;
		this.nombre = nombre;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return nombre + "," + " nota: " + nota;
	}

	@Override
	public int compareTo(Alumno a) {

//		return this.nombre.compareTo(a.getNombre());

//	COMPARAR POR NOTA SI ES DE TIPO NO PRIMITIVO INT 
		if (this.nota > a.nota) {
			return 1;
		}

		else {
			return -1;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(nombre, other.nombre) && nota == other.nota;
	}

}

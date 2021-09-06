package map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EjemploHashMap {

	public static void main(String[] args) {
		// EL MAP FUNCIONA CON HASCORD Y EQUALS PARA SABER SI UNA CLAVE ESTA REPETIDA
		Map<String, String> persona = new HashMap<>();
		persona.put("nombre", "Daniel");
		persona.put("apellido", "Calderon");
		persona.put("apellidoPaterno", "Calderon");
		persona.put("email", "Daniel.calderon.e.v@gmail.com");
		System.out.println("Persona =" + persona);

		// METODOS DE UN MAP.""

		// **** Eliminar por clave ****
		String valorApellidoPaterno = persona.remove("apellidoPaterno");
		System.out.println("Eliminando apellido paterno =" + persona);

		// **** Obtener por clave ****
		String persona1 = persona.get("nombre");
		System.out.println(persona1);

		// **** Saber si existe un valor asociativo en un map mediante la clave ****
		boolean b2 = persona.containsKey("apellidoPaterno");
		System.out.println("Existe el apellidoPaterno = " + b2);

		// **** Saber si existe un valor asociativo en un map mediante la clave ****
		b2 = persona.containsValue("Calderon");
		System.out.println("Existe el valor Calderon = " + b2);

		// **** Obtener todos los valores de un map ****
		Collection<String> valores = persona.values();
		for (String val : valores) {
			System.out.println(" ");
			System.out.println(val);
		}

		// **** Obtener todos los keys(claves) de un map ****

		Set<String> clave = persona.keySet();
		for (String c : clave) {
			System.out.println("Claves: " + c);
		}

		// **** Obtener el map completo ****
		System.out.println(" ");
		for (Entry<String, String> pares : persona.entrySet()) {
			System.out.println(pares.getKey() + " => " + pares.getValue());
		}

		// **** Obtener el map completo otra forma ****
		System.out.println(" ");
		persona.forEach((llave, valor) -> {
			System.out.println(llave + " =>" + valor);
		});

		// **** modificar el valor manteniendo la clave ****
		System.out.println(" ");
		persona.replace("nombre", "Andrés");
		System.out.println("Persona =" + persona);

		// **** modificar el valor manteniendo la clave y agregando el valor viejo y nuevo ****
		System.out.println(" ");
		persona.replace("nombre", "Andrés", "Daniel");
		System.out.println("Persona =" + persona);
	}

}

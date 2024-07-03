package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		// Mapa que relacione dni (clave) y persona (valor).
		Map<String, String> personas = new HashMap<>();
		
		personas.put("12345678D", "Javi");
		personas.put("987654321V", "Álvaro");
		personas.put("12345678L", "Manuel");
		personas.put("987654321R", "Víctor");
		
		// Preguntamos al usuario un DNI y le decimos el nombre de la persona.
		System.out.print("Introduzca un DNI: ");
		String dni = entrada.nextLine();
		
		
		if(personas.containsKey(dni)) {
		System.out.println("El nombre es " + personas.get(dni));
		} else {
			System.out.println("DNI no encontrado.");
		}
		
		// Eliminamos a la persona cuyo DNI hemos leído.
		personas.remove(dni);
	
		// Ver en forma de tabla la información del mapa.
		System.out.println("Contenido del mapa:");
		for (String clave : personas.keySet()) {
			System.out.println(clave + "\t" + personas.get(clave));
		}
		
		// Lista de nombres en el mapa.
		System.out.println("\nNombres guardados en el mapa:");
		for (String nombre : personas.values()) {
			System.out.println(nombre);
		}
		
	}
	
}

package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String frase = "";
		
		System.out.println("Introduce una frase: ");
		frase = entrada.nextLine();
		frase = frase.trim();

		int posEspacio = 0;
		int posEspacioSiguiente = frase.indexOf(" ");

		// Contamos cuántas palabras hay (para crear luego un array de 
		// ese tamaño.
		
		int numPalabras = 0;
		boolean leyendoPalabra = false;

		for (int i = 0; i < frase.length(); i++) {

			// Si en i hay un carácter que no es espacio, lo indicamos
			// poniendo leyendoPalabra a true. 
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
				// Si estamos leyendo la primera palabra y encontramos
				// un espacio, significa que acabamos de llegar al final
				// de la primera palabra.
				if (numPalabras == 0) {
					numPalabras++;
				}
				
				// Si encontramos un espacio y estábamos leyendo una palabra,
				// significa que acabamos de leer una nueva palabra.
			} else if (frase.charAt(i) == ' ' && leyendoPalabra == true) {
				leyendoPalabra = false;
				numPalabras++;
			}

		}
		
		System.out.println("Hay " + numPalabras + " palabras.");
		
		// Creamos el array de palabras y guardamos una en cada posición.
		
		String[] palabras = new String[numPalabras];
		int posicion = 0;

		while (posEspacioSiguiente != -1) {

			// Guardamos la palabra que hay entre los dos espacios.
			palabras[posicion] = 
					frase.substring(posEspacio, posEspacioSiguiente);

			// Actualizamos posEspacio que pasa a ser el inicio de 
			// la nueva búsqueda.
			posEspacio = posEspacioSiguiente + 1;

			// Buscamos el siguiente espacio.
			posEspacioSiguiente = frase.indexOf(' ', posEspacio);
			
			posicion++;
		}
		
		// Guardamos la última palabra en la última posición.
		palabras[posicion] = frase.substring(posEspacio);
		
		System.out.println(Arrays.toString(palabras));

	}

}
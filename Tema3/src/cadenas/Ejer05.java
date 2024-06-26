package cadenas;

import java.util.Scanner;

public class Ejer05 {

	// Arreglar para que no cuente los espacios extra como palabras.

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te las cuento:");
		String frase = entrada.nextLine();

		frase = frase.trim();

		boolean leyendoPalabra = false;
		int numPalabras = 1;

		if (frase.equals("")) {
			System.out.println("La frase está vacía.");
		}
		
		for (int i = 0; i < frase.length(); i++) {

			// Detectamos el inicio de palabra.
			if (frase.charAt(i) != ' ') {
				leyendoPalabra = true;
			} else if (frase.charAt(i) == ' ' && leyendoPalabra) {
				numPalabras++;
				leyendoPalabra = false;
			}

		}

		System.out.println("En esta frase hay " + (numPalabras) + " palabras");

	}

}

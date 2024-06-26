package cadenas;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = entrada.nextLine();

		int numPalabras = 1;
		int inicio = frase.indexOf(" ");

		while (inicio != -1) {

			// Guardamos la palabra que hay entre los dos espacios.
			numPalabras++;

			// Buscamos el siguiente espacio.
			inicio = frase.indexOf(' ', inicio + 1);
		}

		System.out.print(numPalabras);

	}

}
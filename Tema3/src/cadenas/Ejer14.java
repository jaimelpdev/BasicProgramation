package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] palabras = new String[5];

		int posMin = 0;
		String aux;

		System.out.println("Escribe 5 palabras:");

		for (int i = 0; i < palabras.length; i++) {
			System.out.print("Palabra " + (i + 1) + ": ");
			palabras[i] = entrada.nextLine();
		}

		// Ordenamos el array
		for (int i = 0; i < palabras.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < palabras.length; j++) {
				if (palabras[j].compareTo(palabras[posMin]) < 0) {
					posMin = j;
				}

			}

			aux = palabras[i];
			palabras[i] = palabras[posMin];
			palabras[posMin] = aux;

		}

		System.out.println(Arrays.toString(palabras));

	}

}

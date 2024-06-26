package cadenas;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] mascotas = new String[5];

		int posMin = 0;

		System.out.println("Escribe 5 palabras:");

		for (int i = 0; i < mascotas.length; i++) {
			System.out.print("Palabra " + (i + 1) + ": ");
			mascotas[i] = entrada.nextLine();
		}

		// Ordenamos el array
		for (int i = 0; i < mascotas.length; i++) {
			if (mascotas[i].compareTo(mascotas[posMin]) < 0) {
				posMin = i;
			}

		}

		System.out.println("La primera palabra alfabéticamente es: " + mascotas[posMin]);

	}

}

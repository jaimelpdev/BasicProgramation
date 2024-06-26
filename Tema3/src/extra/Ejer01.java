package extra;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Palabras capicúa (palíndromos) ***");
		System.out.println("Escribe una palabra y te diré si es capicúa:");
		String palabra = entrada.nextLine();

		if (esCapicua(palabra)) {
			System.out.println("¡Es capicúa!");
		} else {
			System.out.println("No es capicúa.");
		}

	}

	static boolean esCapicua(String palabra) {
		palabra = palabra.toLowerCase();

		int izq = 0, der = palabra.length() - 1;

		while (der > izq) {
			if (palabra.charAt(izq) != palabra.charAt(der)) {
				return false;
			}
			izq++;
			der--;
		}

		// Otra manera de hacerlo es:

//		for (int i = 0; i < palabra.length() / 2; i++) {
//
//			if (palabra.charAt(i) != palabra.charAt(palabra.length() - 1 - i)) {
//				return false;
//			}
//
//		}

		return true;

	}

}

package ejerciciosRecursividad;

import java.util.Scanner;

public class Ejer13b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te diré si es un palíndromo:");
		String frase = entrada.nextLine();
		
		frase = quitarEspacios(frase);
		
		int inicio = 0;
		int fin = frase.length() - 1;

		if (esPalindromo(frase, inicio, fin)) {
			System.out.println("\"" + frase + "\"" + " es palíndromo");
		} else {
			System.out.println("\"" + frase + "\"" + " no es palíndromo");
		}

	}

	private static String quitarEspacios(String frase) {
		
		String fraseSinEspacios = frase.replace(" ", "");

		return fraseSinEspacios;

	}

	private static boolean esPalindromo(String frase, int inicio, int fin) {
		// Caso base
		if (inicio == fin || inicio == fin + 1) {
			return true;
		}

		// Caso recursivo
		if (frase.charAt(inicio) != frase.charAt(fin)) {
			return false;
		}

		return esPalindromo(frase, inicio + 1, fin - 1);

	}

}

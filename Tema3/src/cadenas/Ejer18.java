package cadenas;

import java.util.Scanner;

public class Ejer18 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = entrada.nextLine();

		String palabras[] = frase.split(" ");
		String primeraMayus = "";

		for (int i = 0; i < palabras.length; i++) {
			// Pasamos la primera letra de cada palabra a mayúculas y el resto de la palabra
			// a minúsculas.
			primeraMayus = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
			System.out.print(primeraMayus + " ");
		}

	}

}
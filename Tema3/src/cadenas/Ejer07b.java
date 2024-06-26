package cadenas;

import java.util.Scanner;

// Variación en la que modificamos la frase sustituyendo las palabrotas por asteriscos.

public class Ejer07b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palabrotas[] = { "sinvergüenza", "maleducado", "analfabeto", "botarate", "mendrugo", "bribón" };

		System.out.println("Escribe una frase y te diré si contiene palabras malsonantes:");
		String frase = entrada.nextLine();

		boolean palabrotaEncontrada = false;

		for (int i = 0; i < palabrotas.length; i++) {
			if (frase.indexOf(palabrotas[i]) != -1) {
				palabrotaEncontrada = true;
				frase = frase.replace(palabrotas[i], "***");
			}

		}

		if (palabrotaEncontrada) {
			System.out.println("Esta frase no contiene palabras malsonantes.");
		} else {
			System.out.println("Esta frase no contiene palabras malsonantes.");
		}

		System.out.println("Su frase censurada: \n" + frase);

	}

}

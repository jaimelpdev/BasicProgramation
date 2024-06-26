package cadenas;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String palabrotas[] = { "sinvergüenza", "maleducado", "analfabeto", "botarate", "mendrugo", "bribón" };

		System.out.println("Escribe una frase y te diré si contiene palabras malsonantes:");
		String frase = entrada.nextLine();

		boolean palabrotaEncontrada = false;

		for (int i = 0; i < palabrotas.length; i++) {
			if (frase.indexOf(palabrotas[i]) != -1) {
				palabrotaEncontrada = true;
				break;
			}

		}

		if (palabrotaEncontrada) {
			System.out.println("Esta frase contiene palabras malsonantes.");
		} else {
			System.out.println("Esta frase no contiene palabras malsonantes.");
		}

	}

}

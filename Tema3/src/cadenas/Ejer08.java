package cadenas;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te muestro la primera palabra:");
		String frase = entrada.nextLine();

		for (int i = 0; i < frase.length(); i++) {

			// Detectamos el inicio de palabra.
			if (frase.charAt(i) == ' ') {
				break;
			}

			System.out.print(frase.charAt(i));

		}

	}

}

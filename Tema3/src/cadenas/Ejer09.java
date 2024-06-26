package cadenas;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te muestro la frase sin la primera palabra:");
		String frase = entrada.nextLine();

		int espacio = frase.indexOf(" ");

		for (int i = espacio + 1; i < frase.length(); i++) {
			System.out.print(frase.charAt(i));
		}

	}

}

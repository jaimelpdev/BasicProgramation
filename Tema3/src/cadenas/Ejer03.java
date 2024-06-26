package cadenas;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te la escribo al revés:");
		String frase = entrada.nextLine();

		for (int i = frase.length() - 1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}

	}

}

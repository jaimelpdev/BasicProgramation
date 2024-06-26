package extra;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Acortador de texto ***");
		System.out.println("\nEscriba una frase y la acortaré de manera que no exceda los 20 caracteres:");
		String frase = entrada.nextLine();

		System.out.println("\nFrase recortada:");
		System.out.println(recortar(frase));

	}

	static String recortar(String frase) {
		if (frase.length() > 20) {
			return frase.substring(0, 17) + "...";
		}
		return frase;
	}

}

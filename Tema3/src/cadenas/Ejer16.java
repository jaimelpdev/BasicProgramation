package cadenas;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase y te genero el acrónimo:");
		String frase = entrada.nextLine();

		String[] palabras = frase.split(" ");

		String acronimo = "";

		for (int i = 0; i < palabras.length; i++) {
			acronimo = acronimo + palabras[i].charAt(0);
		}

		acronimo = acronimo.toUpperCase();

		System.out.println("Acrónimo: " + acronimo);

	}

}
package cadenas;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una frase:");
		String frase = entrada.nextLine();

		int posEspacio = 0;
		int posEspacioSiguiente = frase.indexOf(" ", 0);

		while (posEspacioSiguiente != -1) {
			System.out.println(frase.substring(posEspacio, posEspacioSiguiente));
			posEspacio = posEspacioSiguiente + 1;

			posEspacioSiguiente = frase.indexOf(" ", posEspacio);
		}

	}

}

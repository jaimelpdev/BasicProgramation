package hoja1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String test[] = new String[5];

		System.out.println("¿Que quieres preguntar?");
		test[0] = entrada.nextLine();

		for (int i = 1; i < test.length; i++) {
			System.out.print("Opción " + i + ": ");
			test[i] = entrada.nextLine();
		}

		char letra = 'a';
		System.out.println("\n" + test[0]);
		for (int i = 1; i < test.length; i++) {
			System.out.println(letra + ") " + test[i]);
			letra++;
		}

	}

}

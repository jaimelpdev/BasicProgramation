package ejemplos;

import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		// Rellenar un array desde la terminal.

		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[4];

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + i + ": ");
			nombres[i] = entrada.nextLine();
		}

		System.out.println("\nTus nombres:");
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + " ");
		}

	}

}

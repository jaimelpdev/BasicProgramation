package hoja2;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nombres = new String[10];
		boolean nombreEncontrado = false;

		for (int i = 0; i < nombres.length; i++) {
			System.out.print("Nombre " + (i + 1) + ": ");
			nombres[i] = entrada.nextLine();

			if (nombres[i].equalsIgnoreCase("nadie")) {
				break;
			}

		}

		for (int i = 0; i < nombres.length; i++) {
			if (nombres[i] == null) {
				break;
			} else if (nombres[i].equalsIgnoreCase("Calderón")) {
				nombreEncontrado = true;
			}

		}

		if (nombreEncontrado) {
			System.out.println("de la Barca.");

		} else {
			System.out.println("Nombre no encontrado.");
		}

	}

}
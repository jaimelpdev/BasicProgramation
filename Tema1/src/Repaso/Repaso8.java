package Repaso;

import java.util.Scanner;

public class Repaso8 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int SECRETO = 5;
		int respuesta;

		System.out.print("Escribe un número del 1 al 10: ");
		respuesta = entrada.nextInt();

		while (respuesta != SECRETO) {
			System.out.println("Vuelve a intentarlo\n");
			System.out.print("Escribe un número del 1 al 10: ");
			respuesta = entrada.nextInt();
		}

		if (respuesta == SECRETO) {
			System.out.println("\n¡Enhorabuena, has adivinado el número secreto!");
		}

	}

}
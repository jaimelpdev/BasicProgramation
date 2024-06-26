package hoja2;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		double estaturas[] = new double[10];

		int altos = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < estaturas.length; i++) {
			System.out.print("Persona " + (i + 1) + ": ");
			estaturas[i] = entrada.nextDouble();

			if (estaturas[i] > 1.9) {
				altos++;
			}
		}

		if (altos >= 1) {
			System.out.println(altos + " personas" + " miden más de 1,90m.");
		} else {
			System.out.println("No hay nadie que mida más de 1,90m.");
		}

	}

}

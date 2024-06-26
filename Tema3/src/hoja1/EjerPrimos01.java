package hoja1;

import java.util.Scanner;

public class EjerPrimos01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		int i = 2;
		boolean esPrimo = true;

		System.out.println("Escribe un número y te diré si es primo o compuesto");

		System.out.print("Número: ");
		num = entrada.nextInt();

		if (num < 1) {
			esPrimo = false;
		}

		while (i <= num / 2) {
			if (num % i == 0) {
				esPrimo = false;
				break;
			}

			i++;

		}

		if (esPrimo) {
			System.out.println("Es primo");
		} else {
			System.out.println("Es compuesto");
		}

	}

}

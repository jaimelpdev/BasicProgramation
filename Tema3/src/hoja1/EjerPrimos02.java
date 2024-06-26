package hoja1;

import java.util.Scanner;

public class EjerPrimos02 {

	// Programa que muestre en pantalla los números primos que haya desde 2 hasta
	// 1000.
	public static void main(String[] args) {

		int num = 2;
		int i = 2;
		boolean esPrimo = true;

		while (num <= 1000) {
			// Restablezco la variable boolean para que vuelva a ser true, cada vez que
			// vuelva a empezar el bucle
			esPrimo = true;

			// Restablezco la variable i para que vuelva a ser 2, cada vez que vuelva a
			// empezar el bucle
			i = 2;

			while (i <= num / 2) {
				if (num % i == 0) {
					esPrimo = false;
					break;
				}

				i++;

			}

			if (esPrimo) {
				System.out.println(num);

				num++;

			}

		}

	}

}
package hoja2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double temps[] = new double[8];

		int posMin = 0;
		double aux = 0;

		for (int i = 0; i < temps.length; i++) {
			System.out.print("Hora" + (i + 1) + ": ");
			temps[i] = entrada.nextDouble();
		}

		for (int i = 0; i < temps.length; i++) {
			posMin = i;

			for (int j = i + 1; j < temps.length; j++) {

				if (temps[j] < temps[posMin]) {
					posMin = j;
				}

			}

			aux = temps[i];
			temps[i] = temps[posMin];
			temps[posMin] = aux;

		}

		System.out.println(Arrays.toString(temps));
		System.out.println(temps[0]);
		System.out.println(temps[temps.length - 1]);

	}

}

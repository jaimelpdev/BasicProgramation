package hoja2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		int edades[] = new int[10];

		Scanner entrada = new Scanner(System.in);

		int posMin = 0;
		int aux;

		for (int i = 0; i < edades.length; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			edades[i] = entrada.nextInt();
		}

		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < edades.length; j++) {
				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}

			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}

		System.out.print(Arrays.toString(edades));

	}

}

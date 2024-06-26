package hoja2;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int numAtomicos[] = { 8, 2, 10, 20, 12, 71, 15, 23 };

		int posMin;
		int aux;

		for (int i = 0; i < numAtomicos.length - 1; i++) {

			posMin = i;

			for (int j = i + 1; j < numAtomicos.length; j++) {

				if (numAtomicos[j] < numAtomicos[posMin]) {
					posMin = j;
				}

			}

			aux = numAtomicos[i];
			numAtomicos[i] = numAtomicos[posMin];
			numAtomicos[posMin] = aux;

			System.out.print(numAtomicos[i] + " ");

		}

		System.out.println();

		System.out.println(Arrays.toString(numAtomicos));

		System.out.println("Mínimo: " + numAtomicos[0]);
		System.out.println("Máximo: " + numAtomicos[numAtomicos.length - 1]);

	}

}

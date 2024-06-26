package ejercicios;

import java.util.Arrays;

public class Ejer13 {

	public static void main(String[] args) {

		int edades[] = { 26, 23, 34, 8, 2, 61, 4 };

		int[] edadesOrdenadas = numerosOrdenados(edades);
		
		System.out.println(Arrays.toString(edadesOrdenadas));

	}

	static int[] numerosOrdenados(int[] edades) {

		int posMin = 0;

		for (int i = 0; i < edades.length - 1; i++) {

			posMin = i;
			int aux;

			for (int j = i + 1; j < edades.length; j++) {

				if (edades[j] < edades[posMin]) {
					posMin = j;
				}

			}

			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}

		return edades;

	}

}
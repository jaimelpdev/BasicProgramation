package ejercicios;

import java.util.Arrays;

public class Ejer12 {

	public static void main(String[] args) {

		int numeros[] = { 26, 23, 34, 8, 2, 61, 4 };

		numerosOrdenados(numeros);

	}

	static void numerosOrdenados(int[] numeros) {

		int posMin = 0;

		for (int i = 0; i < numeros.length - 1; i++) {

			posMin = i;
			int aux;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;

		}

		System.out.println(Arrays.toString(numeros));

	}

}
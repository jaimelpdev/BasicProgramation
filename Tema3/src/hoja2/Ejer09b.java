package hoja2;

import java.util.Arrays;

public class Ejer09b {

	public static void main(String[] args) {

		int precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int posMax;
		int aux;

		System.out.println(Arrays.toString(precios));

		for (int i = 0; i < precios.length - 1; i++) {
			posMax = i;

			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] > precios[posMax]) {
					posMax = j;
				}

			}

			aux = precios[i];
			precios[i] = precios[posMax];
			precios[posMax] = aux;

			System.out.println(Arrays.toString(precios));

		}

	}

}

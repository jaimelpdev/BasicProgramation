package ejercicios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		int numeros[] = new int[5];

		pedirNums(numeros);
		ordenar(numeros);
		mostrar(numeros);

	}

	static void pedirNums(int numeros[]) {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Num " + (i + 1) + ": ");
			numeros[i] = entrada.nextInt();
		}

	}

	static void ordenar(int numeros[]) {

		int posMin = 0;
		int aux;

		for (int i = 0; i < numeros.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < numeros.length; j++) {

				if (numeros[j] < numeros[posMin]) {
					posMin = j;
				}

			}

			aux = numeros[i];
			numeros[i] = numeros[posMin];
			numeros[posMin] = aux;
		}

	}

	static void mostrar(int[] numeros) {
		System.out.println(Arrays.toString(numeros));
	}

}

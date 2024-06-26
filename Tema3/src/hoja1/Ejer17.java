package hoja1;

import java.util.Scanner;

public class Ejer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[10];
		double suma = 0;
		int j = 0;

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Producto " + (i + 1) + ": ");
			precios[i] = entrada.nextDouble();
			suma += precios[i];

			if (precios[i] > 10) {
				j++;
			}

		}

		System.out.println("Total: " + suma);
		System.out.println(j + " productos cuestan más de 10€.");

	}

}

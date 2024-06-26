package hoja1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[10];

		for (int i = 0; i < precios.length; i++) {
			System.out.print("Producto " + (i + 1) + ": ");
			precios[i] = entrada.nextDouble();
		}

		System.out.println("\n**** PRECIOS POR PANTALLA ****");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Producto " + (i + 1) + ": " + precios[i] + "€");
		}

	}

}

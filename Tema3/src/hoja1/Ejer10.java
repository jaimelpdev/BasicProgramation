package hoja1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double compra[] = new double[100];

		for (int i = 0; i < compra.length; i++) {
			System.out.print("Producto " + (i + 1) + ": ");
			compra[i] = entrada.nextDouble();

			if (compra[i] == 0) {
				break;
			}

		}

		System.out.println("\n**** Precios mostrados por pantalla ****");

		for (int i = 0; i < compra.length; i++) {
			if (compra[i] == 0) {
				break;
			}
			
			System.out.println("Producto " + (i + 1) + ": " + compra[i]);

		}

	}

}

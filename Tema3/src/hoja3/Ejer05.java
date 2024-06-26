package hoja3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[50];
		final double TOTAL_PARA_DESCUENTO = 50;
		double suma = 0;

		System.out.println("Caja registradora");
		System.out.println("=======================");

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Precio " + i + ":");
			precios[i] = entrada.nextDouble();

			if (precios[i] <= 0) {
				break;
			} else {
				if (suma > TOTAL_PARA_DESCUENTO) {
					precios[i] *= 0.9;
				}
				suma += precios[i];
			}

		}

		System.out.println("\nTicket de la compra");

		for (int i = 0; i < precios.length; i++) {
			if (precios[i] <= 0) {
				break;
			}

			System.out.println(precios[i]);
		}

		System.out.println("\nTotal a pagar: " + suma + " €.");
		System.out.println("Gracias por la compra.");

	}

}

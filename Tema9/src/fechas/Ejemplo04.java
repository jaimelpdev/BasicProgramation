package fechas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		LocalDate[] fechas = new LocalDate[5];

		// Pedir por terminal las cinco fechas y guardarlas en el array.
		for (int i = 0; i < fechas.length; i++) {
			System.out.print("Fecha " + (i + 1) + ": ");
			fechas[i] = LocalDate.parse(entrada.nextLine());
		}

		System.out.println("\nLista de fechas:");
		for (int i = 0; i < fechas.length; i++) {
			System.out.println("Fecha " + (i + 1) + ": " + fechas[i]);
		}

		// Indicar la fecha más antigua.
		int posMin = 0;

		LocalDate aux;

		for (int i = 0; i < fechas.length - 1; i++) {
			posMin = i;

			for (int j = i + 1; j < fechas.length; j++) {
				if (fechas[j].isBefore(fechas[posMin])) {
					posMin = j;
				}

			}

			// Ordenar las fechas de más antigua a más reciente.
			aux = fechas[i];
			fechas[i] = fechas[posMin];
			fechas[posMin] = aux;

		}

		// Mostrar las fechas ordenadas.
		System.out.println("\nLista de fechas ordenadas:");
		for (int i = 0; i < fechas.length; i++) {
			System.out.println("Fecha " + (i + 1) + ": " + fechas[i]);
		}

		System.out.println("La fecha más antigua es: " + fechas[0]);

		// Ordenar las fechas de más antigua a más reciente.
		for (int i = 0; i < fechas.length; i++) {

		}

	}

}

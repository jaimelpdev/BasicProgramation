package hoja2;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float[] productos = new float[10];
		boolean preciosCorrectos = true;
		float suma = 0;

		for (int i = 0; i < productos.length; i++) {
			System.out.print("Precio " + i + ": ");
			productos[i] = entrada.nextFloat();
		}

		for (int i = 0; i < productos.length; i++) {
			if (productos[i] < 0) {
				preciosCorrectos = false;
				System.out.println(
						"Se ha encontrado un valor no válido en la posición " + i + ". El programa terminará.");
				break;

			}

			suma = suma + productos[i];

		}

		if (preciosCorrectos) {
			System.out.println("Valor total de la compra: " + suma);
		}

	}

}
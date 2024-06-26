package hoja2;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[] votos = new int[6];
		int votosMin = 0;
		int votosMax = 0;

		// Leemos los votos de 6 partidos y los almacenamos en el array.
		for (int i = 0; i < votos.length; i++) {
			System.out.print("Número de votos en el partido " + i + ":");
			votos[i] = entrada.nextInt();
		}

		// Recorremos el array buscando las posiciones del mínimo y del máximo valor,
		for (int i = 0; i < votos.length; i++) {
			if (votos[i] < votos[votosMin]) {
				votosMin = i;
			} else if (votos[i] > votos[votosMax]) {
				votosMax = i;
			}
		}

		// Mostramos los resultados.
		System.out.println(
				"El partido menos votado es el de la posición " + votosMin + " con " + votos[votosMin] + " votos.");
		System.out.println(
				"El partido más votado es el de la posición " + votosMax + " con " + votos[votosMax] + " votos.");

	}

}

package hoja2;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer22 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String notas[][] = new String[3][4];

		double notaEval = 0;

		System.out.println("Introducción de notas");
		System.out.println("=====================================");

		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nombre: ");
			notas[i][0] = entrada.nextLine();
			System.out.print("Exámenes: ");
			notas[i][1] = entrada.nextLine();
			System.out.print("Trabajos: ");
			notas[i][2] = entrada.nextLine();
			System.out.print("Actitud: ");
			notas[i][3] = entrada.nextLine();

		}

		System.out.println("Nota de evaluación");
		System.out.println("================");

		for (int fila = 0; fila < notas.length; fila++) {
			
			notaEval = (50 * Double.parseDouble(notas[fila][1])
					+ 40 * Double.parseDouble(notas[fila][2]) + 10 * Double.parseDouble(notas[fila][3])) / 100;
			System.out.println(notas[fila][0] + ": " + notaEval);
		}

	}

}

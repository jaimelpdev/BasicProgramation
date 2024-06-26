package hoja2;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nominas[][] = new String[4][3];

		double sum = 0;
		int posMin = 0;

		for (int i = 0; i < nominas.length; i++) {
			System.out.print("Apellidos: ");
			nominas[i][0] = entrada.nextLine();
			System.out.print("Nombre: ");
			nominas[i][1] = entrada.nextLine();
			System.out.print("Sueldo: ");
			nominas[i][2] = entrada.nextLine();

			System.out.println();
		}

		System.out.println("Apellidos\tNombre\t\tSueldo");

		for (int fila = 0; fila < nominas.length; fila++) {

			for (int col = 0; col < nominas[0].length; col++) {
				System.out.print(nominas[fila][col] + "\t\t");
			}

			System.out.println();

			sum += Double.parseDouble(nominas[fila][2]);

			if (Double.parseDouble(nominas[fila][2]) < Double.parseDouble(nominas[posMin][2])) {
				posMin = fila;
			}

		}

		System.out.println("\nSalario total: " + sum + " €.");
		System.out.println("El salario más bajo corresponde a " + nominas[posMin][1] + " " + nominas[posMin][0]
				+ " con " + nominas[posMin][2] + " €.");

	}

}

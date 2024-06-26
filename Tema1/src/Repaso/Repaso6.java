package Repaso;

import java.util.Scanner;

public class Repaso6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int mes;

		System.out.print("Mes: ");
		mes = entrada.nextInt();

		if (mes >= 1 && mes <= 12) {
			System.out.println("Mes correcto.");
		} else {
			System.out.println("Mes no válido.");
		}

	}

}

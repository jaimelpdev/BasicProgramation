package ejercicios;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escrbe un número y te doy su cuadrado:");
		double num = entrada.nextDouble();

		System.out.println("El cuadrado de " + num + " es " + cuadrado(num));

	}

	static double cuadrado(double num) {

		return num * num;

	}

}

package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escrbe un número y te doy su cuadrado:");
		double num = entrada.nextDouble();

		System.out.println("El cubo de " + num + " es " + cubo(num));

	}

	static double cubo(double num) {

		return num * num * num;

	}

}

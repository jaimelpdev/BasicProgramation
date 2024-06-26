package ejercicios;

import java.util.Scanner;

public class Ejer08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe los coeficientes para la ecuación:");

		System.out.print("Coeficiente a: ");
		double a = entrada.nextDouble();

		System.out.print("Coeficiente b: ");
		double b = entrada.nextDouble();

		System.out.print("Coeficiente c: ");
		double c = entrada.nextDouble();

		System.out.println("\nSoluciones:");
		calcularEcuacion(a, b, c);
	}

	public static void calcularEcuacion(double a, double b, double c) {
		double calculo = b * b - 4 * a * c;

		if (calculo < 0) {
			System.out.println("No hay solución.");
		} else {
			double x1 = (-b + Math.pow(calculo, 0.5)) / (2 * a);
			double x2 = (-b - Math.pow(calculo, 0.5)) / (2 * a);

			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
	}
}

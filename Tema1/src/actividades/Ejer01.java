package actividades;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1, num2;

		System.out.println("Escoge 2 números");
		System.out.print("Número1: ");
		num1 = entrada.nextInt();
		System.out.print("Número2: ");
		num2 = entrada.nextInt();

		System.out.println("El resultado de la multiplicación es: " + num1 * num2);

	}

}

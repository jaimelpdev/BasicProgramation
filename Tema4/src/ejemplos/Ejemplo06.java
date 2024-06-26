package ejemplos;

import java.util.Scanner;

public class Ejemplo06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;

		System.out.print("Tabla de multiplicar del: ");
		num = entrada.nextInt();

		tablaMultiplicar(num);

	}

	// Muestra la tabla de multiplicar del número que le pases.
	static void tablaMultiplicar(int num) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(num + " x " + i + " = " + num * i);

		}

	}

}

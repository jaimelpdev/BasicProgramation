package actividades;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Escribe 2 números para sacar el resto de la división");
		System.out.print("Número1: ");
		num1 = entrada.nextInt();
		System.out.print("Número2: ");
		num2 = entrada.nextInt();
		
		System.out.println("El resto de la división es " + num1 % num2);
		
	}

}

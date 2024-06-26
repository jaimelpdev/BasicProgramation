package cadenas;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe una palabra y te digo cuántas letras tiene:");
		String palabra = entrada.nextLine();

		int longitud = palabra.length();

		System.out.println("Esta palabra tiene " + longitud + " letras.");

	}

}

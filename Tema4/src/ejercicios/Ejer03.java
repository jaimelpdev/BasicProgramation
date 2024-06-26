package ejercicios;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		String nombre = "";

		System.out.println("Encantado " + pedirNombre(nombre) + ".");

	}

	static String pedirNombre(String nombre) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		nombre = entrada.nextLine();

		return nombre;

	}

}

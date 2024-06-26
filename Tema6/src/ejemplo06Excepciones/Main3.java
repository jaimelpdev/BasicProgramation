package ejemplo06Excepciones;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		try {
			dividirPor20();
		} catch (NumberFormatException nfe) {
			System.out.println("¡Tiernes que escribir un número entero!");
		} catch (ArithmeticException ae) {
			System.out.println("¡No se puede dividir por cero!");
		} catch (Exception e) {
			System.out.println("Se ha producido un error inesperado. El programa se cerrará.");
			System.out.println(e.toString());
		}

//		try {
//			dividirPor20();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	static void dividirPor20() throws Exception {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Programa para dividir 20 entre un nº");

		System.out.println("Escribe un nº entero: ");

		String numero = entrada.nextLine();

		int num = Integer.parseInt(numero);

		System.out.println("La división de 20 entre " + num + " es " + 20 / num);

	}

}

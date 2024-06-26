package Repaso;

import java.util.Scanner;

public class Repaso9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final String PALABRA = "computer";
		String respuesta;
		
		System.out.println("¿Cómo se dice ordenador en inglés?");
		respuesta = entrada.nextLine();
		
		while(true) {
			System.out.println("Sigue intentándolo");
			break;
		}
		
		if(respuesta.equalsIgnoreCase(PALABRA)) {
			System.out.println("Enhorabuena");
		} else {
			System.out.println("Mal");
		}
		
	}
	
}

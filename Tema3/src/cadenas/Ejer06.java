package cadenas;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una frase:");
		String frase = entrada.nextLine();
		
		System.out.print("Letra 1: ");
		String letra1 = entrada.next();
		
		System.out.print("Letra 2: ");
		String letra2 = entrada.next();
		
		String nuevaFrase = frase.replace(letra1, letra2);
		
		System.out.println(nuevaFrase);
		
	}

}

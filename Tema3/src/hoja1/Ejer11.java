package hoja1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String ordenes[] = new String[1000];

		for (int i = 0; i < ordenes.length; i++) {
			System.out.print("Orden " + (i + 1) + ": ");
			ordenes[i] = entrada.nextLine();

			if (ordenes[i].equalsIgnoreCase("ejecutar")) {
				break;
			}

		}

		System.out.println("\n**** ÓRDENES POR PANTALLA ****");
		
		for (int i = 0; i < ordenes.length; i++) {
			if (ordenes[i].equalsIgnoreCase("ejecutar")) {
				break;
			}
			
			System.out.println("Orden " + (i + 1) + ": " + ordenes[i]);
		}
		
	}

}
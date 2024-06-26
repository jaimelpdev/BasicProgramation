package hoja2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nominas[][] = new String[4][3];
		int sum = 0;
		
		for (int i = 0; i < nominas.length; i++) {
				System.out.print("Apellidos: ");
				nominas[i][0] = entrada.nextLine(); 
				System.out.print("Nombre: ");
				nominas[i][1] = entrada.nextLine(); 
				System.out.print("Sueldo: ");
				nominas[i][2] = entrada.nextLine(); 
			
				System.out.println();
		}

		System.out.println("Apellidos\tNombre\t\tSueldo");

		
		for (int fila = 0; fila < nominas.length; fila++) {
			
			for (int col = 0; col < nominas[0].length; col++) {
				System.out.print(nominas[fila][col] + "\t\t");
			}
			
			System.out.println();
			
			sum += Integer.parseInt(nominas[fila][2]);
			
		}
		
		System.out.println("\nSalario total: " + sum + " €.");
		
	}

}

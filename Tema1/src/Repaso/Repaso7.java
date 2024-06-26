package Repaso;

import java.util.Scanner;

public class Repaso7 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double precio, total;
		
		int cantidad;
		
		System.out.print("Precio: ");
		precio = entrada.nextDouble();
		
		System.out.print("Unidades: ");
		cantidad = entrada.nextInt();
		
		total = precio * cantidad;
		
		if (total > 75) {
			total *= 0.15;
		} else {
			total *= 0.05;
		}
		
		System.out.println("Total de compra: " + total);
		
	}

}

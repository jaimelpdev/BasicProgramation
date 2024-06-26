package actividades;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		double precio;
		int cantidad;
		
		System.out.print("Producto: ");
		nombre = entrada.nextLine();
		
		System.out.print("Precio: ");
		precio = entrada.nextDouble();
		
		System.out.print("Unidades: ");
		cantidad = entrada.nextInt();
		
		System.out.println("Precio final: " + precio * cantidad + "€");
		
	}

}

package actividades;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		double precio, descuento;

		double cantidadDescontada;
		double precioFinal;

		System.out.print("Producto: ");
		nombre = entrada.nextLine();

		System.out.print("Precio: ");
		precio = entrada.nextDouble();

		System.out.print("Descuento: ");
		descuento = entrada.nextDouble();

		cantidadDescontada = ((descuento * precio) / 100);
		precioFinal = precio - cantidadDescontada;

		System.out.println("Precio final: " + precioFinal);
	}

}

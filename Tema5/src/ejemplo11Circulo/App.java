package ejemplo11Circulo;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Circulo circulo1 = new Circulo(0, 0, 15);

		System.out.println("El radio del círculo 1 es " + circulo1.getRadio());
		System.out.println("El área del círculo 1 es " + circulo1.area());
		System.out.println("Perímetro del círculo 1 es " + circulo1.perimetro());

		// Creamos un nuevo círculo y le prguntamos al usuario sus propiedades.
		Circulo circulo2 = new Circulo();
		System.out.println("\nPosición x del círculo:");
		circulo2.setX(entrada.nextDouble());
		System.out.println("Posición y del círculo:");
		circulo2.setY(entrada.nextDouble());
		System.out.println("Radio del círculo:");
		circulo2.setRadio(entrada.nextDouble());

		System.out.println("\nEl área del círculo 2 es " + circulo2.area());
		System.out.println("Perímetro del círculo 2 es " + circulo2.perimetro());

	}

}

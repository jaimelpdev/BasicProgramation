package inicio;

import java.util.Scanner;

import geometria.Cilindro;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Cilindro cilindro1 = new Cilindro();

		int altura, radio;

		System.out.println("Cilindro 1:");
		System.out.print("Altura: ");
		cilindro1.setAltura(entrada.nextInt());

		System.out.print("Radio: ");
		cilindro1.setRadio(entrada.nextInt());

		System.out.println("\nEl área del cilindro 1 es " + cilindro1.getArea());
		System.out.println("El volumen del cilindro 1 es " + cilindro1.getVolumen());

		System.out.println("\nCilindro 2:");
		System.out.print("Altura: ");
		altura = entrada.nextInt();

		System.out.print("Radio: ");
		radio = entrada.nextInt();

		Cilindro cilindro2 = new Cilindro(altura, radio);
		System.out.println("\nEl área del cilindro 2 es " + cilindro2.getArea());
		System.out.println("El volumen del cilindro 2 es " + cilindro2.getVolumen());
		System.out.println(cilindro2.toString());

	}

}

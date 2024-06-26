package Repaso;
import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double precio;
		
		System.out.print("Precio: ");
		precio = entrada.nextDouble();
		
		if (precio > 80) {
			precio *= 0.1;
		} else if (precio < 5) {
			precio += 2;
		}
		
		System.out.println("Precio final: " + precio + "€");
		
	}

}

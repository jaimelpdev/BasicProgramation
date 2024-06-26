package Repaso;
import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = (int) (Math.random() * 10 + 1), respuesta, i = +1;

		System.out.println(num);

		System.out.print("Escribe un número entre el 1 y el 10: ");
		respuesta = entrada.nextInt();

		while (respuesta != num) {

			System.out.print("Escribe un número entre el 1 y el 10: ");
			respuesta = entrada.nextInt();
			i++;

			if (respuesta == num) {
				System.out.println("\n¡Lo has adivinado, el número aleatorio es: " + num + "!");

				break;
			}

		}

		System.out.println("Lo has logrado en " + i + " intentos.");

		if (i == 1) {
			System.out.println("¡Recibes 10 puntos!");
		} else if (i == 2) {
			System.out.println("¡Recibes 5 puntos!");
		} else if (i == 3) {
			System.out.println("¡Recibes 2 puntos!");
		} else {
			System.out.println("¡Recibes 0 puntos!");
		}

	}

}

package Repaso;
import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num1;
		int num2;

		int resultado, correcto;

		while (true) {
			num1 = (int) (Math.random() * 100 + 1);
			num2 = (int) (Math.random() * 100 + 1);
			correcto = num1 + num2;
			
			System.out.print(num1 + " + " + num2 + " = ");
			resultado = entrada.nextInt();

			if (resultado == num1 + num2) {
				System.out.println("Has acertado.\n");
			} else {
				System.out.println("Te has equivocado, el resultado correcto es " + correcto + ".\n");
			}

		}

	}

}

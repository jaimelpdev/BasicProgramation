package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Datos de unidades:");
		System.out.print("Kilometros: ");
		System.out.println(Conversor.millas(entrada.nextDouble()) + " millas");
		System.out.print("Milibares: ");
		System.out.println(Conversor.atmosferas(entrada.nextDouble()) + " atmosferas");
		System.out.print("Calorias: ");
		System.out.println(Conversor.julios(entrada.nextDouble()) + " julios");

	}

}

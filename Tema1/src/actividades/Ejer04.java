package actividades;

import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String nombre;
		int nota1, nota2, nota3;

		System.out.print("Alumno: ");
		nombre = entrada.nextLine();
		System.out.print("1ªEvaluación: ");
		nota1 = entrada.nextInt();
		System.out.print("2ªEvaluación: ");
		nota2 = entrada.nextInt();
		System.out.print("3ªEvaluación: ");
		nota3 = entrada.nextInt();

		System.out.println("La media es de " + ((nota1 + nota2 + nota3) / 3));

	}

}

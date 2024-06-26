import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cómo te llamas?");
		String nombre = entrada.nextLine();

		System.out.println("\n¿Cuántos años tienes?");
		int edad = entrada.nextInt();

		System.out.println("Te llamas " + nombre + " y " + "tienes " + edad + " años.");

	}

}

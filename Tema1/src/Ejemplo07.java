
public class Ejemplo07 {

	public static void main(String[] args) {

		int a = 20, b = 7;

		// Operaciones aritméticas con enteros.

		int suma = a + b;
		int resta = a - b;
		int producto = a * b;
		int division = a / b;
		int modulo = a % b;

		System.out.println("Suma: " + suma);
		System.out.println("Resta: " + resta);
		System.out.println("Producto: " + producto);
		System.out.println("División: " + division);
		System.out.println("Módulo: " + modulo);

		// Operadores relacionales.
		boolean resultado = (a == b);
		System.out.println("\n" + resultado);

		resultado = (a != b);
		System.out.println(resultado);

		resultado = (a > b);
		System.out.println(resultado);

		int c = 10, d = 10;

		resultado = (c > d);
		System.out.println(resultado);

		resultado = (c >= 10);
		System.out.println(resultado);

	}

}

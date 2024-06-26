package ejerciciosRecursividad;

public class Ejer08 {

	public static void main(String[] args) {

		int n = 456;

		System.out.println(sumar(n));

	}

	private static int sumar(int n) {
		if (n == 0) {
			return n;
		} else {
			return n % 10 + sumar(n / 10);
		}
	}

}

package ejerciciosRecursividad;

public class Ejer07 {

	public static void main(String[] args) {

		int n = 456;

		System.out.println(invertir(n));

	}

	private static String invertir(int n) {
		if (n < 10) {
			return String.valueOf(n);
		} else {
			return n % 10 + invertir(n / 10);
		}
	}

}

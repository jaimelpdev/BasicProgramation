package ejerciciosRecursividad;

public class Ejer01 {

	public static void main(String[] args) {
		int n = 8;

		System.out.println(transforma(n));
	}

	private static String transforma(int n) {
		if (n > 1) {
			return transforma(n / 2) + n % 2;
		} else if (n == 1 || n == 0) {
			return "" + n;
		}

		return "ERROR";
	}

}


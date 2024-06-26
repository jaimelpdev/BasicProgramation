package ejerciciosRecursividad;

public class Ejer03 {

	public static void main(String[] args) {

		int n = 42;

		System.out.println("El número " + n + " en hexadecimal es " + transforma(n));
		
	}

	private static String transforma(int n) {
		if (n > 15) {
			return transforma(n / 16) + aHex(n % 16);
		} else if (n >= 0 && n <= 15) {
			return "" + aHex(n);
		}
			return "ERROR";
	}

	private static String aHex(int n) {
		String[] cifrasHexadecimales = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E",
				"F" };

		return cifrasHexadecimales[n];
	}
}

package ejerciciosRecursividad;

public class Ejer12 {

	public static void main(String[] args) {

		char[] frase = { 'A', 'L', 'L', 'I', 'V', 'E', 'S', 'S', 'E', 'V', 'I', 'L', 'L', 'A' };
		int inicio = 0;
		int fin = frase.length - 1;

		System.out.println(esPalindromo(frase, inicio, fin));

	}

	private static boolean esPalindromo(char[] frase, int inicio, int fin) {
		// Caso base
		if (inicio >= fin) {
			return true;
		}

		// Caso recursivo
		if (frase[inicio] != frase[fin]) {
			return false;
		}
		
		return esPalindromo(frase, inicio + 1, fin - 1);

	}

}

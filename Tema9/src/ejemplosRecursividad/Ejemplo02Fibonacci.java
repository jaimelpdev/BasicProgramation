package ejemplosRecursividad;

public class Ejemplo02Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(5));

	}

	private static int fibonacci(int n) {

		if (n > 1) {
			// Caso recursivo.
			System.out.println("fibonacci(" + n + ")");
			return fibonacci(n - 1) + fibonacci(n - 2);
		} else {
			// Caso base (n=0 ó n=1).
			return 1;
		}

	}

}

package ejerciciosRecursividad;

public class Ejer11 {

	public static void main(String[] args) {

		double numeros[] = { 7, 3, 9, 21.2, 1, 4 };

		System.out.println("El número más grande es " + maximo(numeros, numeros.length));

	}

	private static double maximo(double[] numeros, int numElementos) {
		double max;

		// Caso base
		if (numElementos == 1) {
			return numeros[0];
		}

		// Caso recursivo
		return Math.max(maximo(numeros, numElementos - 1), numeros[numElementos - 1]);

	}

	private static int mayor(int a, int b) {
		return a > b ? a : b;
	}
	
}

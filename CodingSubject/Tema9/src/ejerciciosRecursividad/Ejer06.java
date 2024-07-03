package ejerciciosRecursividad;

public class Ejer06 {

	public static void main(String[] args) {

		int[] numeros = { 8, 3, 5, 2, 6 };

		int min = encontrarMinimoArray(numeros, numeros.length);

		System.out.println("El mínimo del array es: " + min);

	}

	public static int encontrarMinimoArray(int[] numeros, int numElementos) {
		int min;

		if (numElementos == 1) {
			min = numeros[0];
//		} else {
//			min = encontrarMinimoArray(numeros, n - 1);
//		}
//
//		if (n == 1 || numeros[n - 1] < min) {
//			return numeros[n - 1];
//		} else {
//			return min;
		}

		return Math.min(encontrarMinimoArray(numeros, numElementos - 1), numeros[numElementos - 1]);

	}
	
	// En vez de este método prodríamos usar Math.min
		private static int minimo(int a, int b) {
			return a < b ? a : b;
		}

}
  
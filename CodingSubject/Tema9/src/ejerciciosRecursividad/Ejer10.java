package ejerciciosRecursividad;

import java.util.ArrayList;

public class Ejer10 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(6);
		lista.add(2);

		int n = lista.size();
		int resultado = multiplicar(lista, n);
		System.out.println("La multiplicación de los elementos es: " + resultado);

	}

	private static int multiplicar(ArrayList<Integer> lista, int n) {

		// Caso base
		if (n == 0) {
			return 1;
		} else {
			// Caso recursivo
			return lista.get(n - 1) * multiplicar(lista, n - 1);
		}

	}

}

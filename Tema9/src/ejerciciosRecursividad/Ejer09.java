package ejerciciosRecursividad;

import java.util.ArrayList;

public class Ejer09 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(20);
		lista.add(15);
		lista.add(6);
		lista.add(2);
		lista.add(8);

		int n = lista.size();
		int resultado = sumar(lista, n);
		System.out.println("La suma de los elementos es: " + resultado);

	}

	private static int sumar(ArrayList<Integer> lista, int n) {

		if (n == 0) {
			return 0;
		} else {
			return lista.get(n - 1) + sumar(lista, n - 1);
		}

	}

}

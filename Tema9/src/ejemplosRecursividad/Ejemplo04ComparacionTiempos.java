package ejemplosRecursividad;

public class Ejemplo04ComparacionTiempos {

	public static void main(String[] args) {

		int[] edades = new int[100000000];

		for (int i = 0; i < edades.length; i++) {
			edades[i] = i * 10;
		}

		final int X = (int) (Math.random() * 1000000); // Número que buscaremos
		int pos = busquedaBinaria(X, edades);

		System.out.println("--- Búsqueda binaria ---");
		if (pos != -1) {
			System.out.println("El número " + X + " en la posición " + pos);
		} else {
			System.out.println("No se ha encontrado el número de manera " + X + "\n");
		}

		pos = busquedaSecuencial(X, edades);

		System.out.println("--- Búsqueda secuencial ---");
		if (pos != -1) {
			System.out.println("El número " + X + " en la posición " + pos);
		} else {
			System.out.println("No se ha encontrado el número de manera " + X);
		}

	}

	private static int busquedaBinaria(int x, int[] numeros) {
		// Instante en que empezamos a medir el tiempo. Esta función nos devuelve el
		// tiempo en nanoSegundos que ha pasado desde el 1 de enero de 1970.
		long tiempoInicio = System.nanoTime();

		// Instante en que termina el método
		long tiempoFin;

		int i = 0; // Extremo izquierdo de búsqueda
		int f = numeros.length - 1; // Extremo derecho de búsqueda
		int m; // Punto medio entre i y f

		while (f >= i) {
			// Calculamos la posición en medio de i y f.
			m = (i + f) / 2;

			// Comparamos el valor en m con el valor buscado.
			if (x == numeros[m]) {
				// Hemos encontrado el valor buscado.
				tiempoFin = System.nanoTime();
				System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ns");

				return m;
			} else if (x < numeros[m]) {
				f = m - 1;
			} else {
				i = m + 1;
			}

		}

		// Hemos encontrado el valor buscado.
		tiempoFin = System.nanoTime();
		System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ns");
		return -1;

	}

	private static int busquedaSecuencial(int x, int[] numeros) {
		// Instante en que empezamos a medir el tiempo. Esta función nos devuelve el
		// tiempo en nanoSegundos que ha pasado desde el 1 de enero de 1970.
		long tiempoInicio = System.nanoTime();

		// Instante en que termina el método
		long tiempoFin;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == x) {
				// Hemos encontrado el valor buscado.
				tiempoFin = System.nanoTime();
				System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ns");

				return i;
			}
		}

		// Hemos encontrado el valor buscado.
		tiempoFin = System.nanoTime();
		System.out.println("Tiempo de ejecución: " + (tiempoFin - tiempoInicio) + " ns");
		return -1;
	}

}

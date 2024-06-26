package ejemplos;

public class Ejemplo08 {

	// Ejemplo de búsqueda de mínimo y máximo en un array.

	public static void main(String[] args) throws InterruptedException {

		// Array cuyo mínimo queremos averiguar.
		int[] edades = { 17, 16, 20, 18, 14, 22 };

		// Suponemos que el mínimo está en la posición 0.
		int posMin = 0;
		int posMax = 0;

		// Recorremos el array y vamos comparando cada posición con la que apunta
		// posMin.
		for (int i = 1; i < edades.length; i++) {
			System.out.println("Comprobando posición " + i);

			// Si encontramos una posición i donde haya un número menor que en posMin, esa
			// será la nueva posMin.
			if (edades[i] < edades[posMin]) {
				System.out.println("Cambiando posMin a " + i);
				posMin = i;

				// Sino, si encontramos una posición i donde haya un número mayor que en posMax,
				// esa
				// será la nueva posMax.
			} else if (edades[i] > edades[posMin]) {
				System.out.println("Cambiando posMax a " + i);
				posMax = i;
			}

			// Timeout de la consola.
			Thread.sleep(1000);

		}

		// Mostramos el resultado.
		System.out.println(
				"El valor más pequeño del array es " + edades[posMin] + ", y está en la posición " + posMin + ".");
		System.out.println(
				"El valor más grande del array es " + edades[posMax] + ", y está en la posición " + posMax + ".");

	}

}

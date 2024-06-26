package ejemplos;

public class Ejemplo14 {

	public static void main(String[] args) {

		String[][] alturas = { { "MAnuel", "1.75" }, { "Rosa", "1.70" }, { "María", "1.65" }, { "Jorge", "1.72" } };

		float suma = 0;

		// REcorremos las filas.
		for (int fila = 0; fila < alturas.length; fila++) {

			// Sumamos lo que haya en la columna 1 de la fila.
			suma += Float.parseFloat(alturas[fila][1]);

		}

		System.out.println("ALtura media: " + suma / alturas.length + " metros.");

		// Altura mínima.
		int posMin = 0;

		for (int fila = 0; fila < alturas.length; fila++) {

			if (Float.parseFloat(alturas[fila][1]) < Float.parseFloat(alturas[posMin][1])) {
				posMin = fila;
			}
			
		}

		System.out.println("La altura mínima es " + alturas[posMin][1] + " metros que corresponde a " + alturas[posMin][0] + ".");
		
	}

}
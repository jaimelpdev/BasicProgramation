package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {

		// Declaramos un array de Strings.
		String[] nombres = { "Ramón", "Agustín", "Margarita", "Tatiana", "Ahmad", "Juan" };

		System.out.println("Nombres de la primera fila:");
		// Recorremos el array mediante un bucle.
		for (int i = 0; i < nombres.length; i++) {
			System.out.print(nombres[i] + " ");
		}
		
	}

}

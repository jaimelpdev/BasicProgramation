package ejemplos;

public class Ejemplo01 {

	public static void main(String[] args) {

		// Llamamos al método mayordomo().
		System.out.println("Llamando al mayordomo...");
		mayordomo();
		System.out.println("Tráigame unos turrones.");

		// Volvemos a llamar al método mayordomo().
		mayordomo();
		mayordomo();

	}

	// Definimos el método mayordomo().
	// Este método no devuelve nada y no toma ningún argumento.
	static void mayordomo() {
		System.out.println("¿Qué desea, señor?");
	}

}

package ejemplos;

public class Ejemplo03 {

	public static void main(String[] args) {

		System.out.println("Sumando 12 y 15:");
		sumar(12, 15);

	}

	// El método sumar() recibe dos argumento, a y b, de tipo entero.
	// Muestra la suma de ambos números.
	// No devuelve nada.
	static void sumar(int a, int b) {
		System.out.println(a + b);
	}

}

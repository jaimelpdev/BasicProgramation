package ejemplos;

public class Ejemplo05 {

	public static void main(String[] args) {

		int suma = sumar(12, 15);

		System.out.println("La suma de 12 y 15 es " + suma);

	}

	// El método sumar() recibe dos argumento, a y b, de tipo entero.
	// devuelve la suma de ambos números.
	static int sumar(int a, int b) {
		return a + b;
	}

}

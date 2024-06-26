package ejemplos;

public class Ejemplo08 {

	public static void main(String[] args) {

		double base = 20;
		double altura = 5;

		System.out.println("El área de un triangulo de base " + base + " y altura " + altura + " es "
				+ areaTriangulo(base, altura));

	}

	// Devuelve el área de un triángulo con los argumentos de base y altura
	// recibidos.
	static double areaTriangulo(double base, double altura) {

		double area = (base * altura) / 2;

		return area;

	}

}

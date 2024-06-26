package ejemplos;

public class Ejemplo03 {

	public static void main(String[] args) {

		// Creamos un array con 10 posiciones de tipo double.
		double[] precios = new double[1000];

		// Damos algunos valores al array.
		precios[0] = 10;
		precios[1] = 65;
		
		System.out.println("Longitud del array: " + precios.length);

		// Vamos a recorrer todo el array mediante un bucle.
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}
		
	}

}

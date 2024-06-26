package ejemplos;

import java.util.Arrays;

// Intercambiar los valores de dos variables.
public class Ejemplo09 {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;
		int aux = 0;

		// b valga 10 y a valga 25
		aux = a;
		a = b;
		b = aux;

		System.out.println("A: " + a + " B: " + b);

		System.out.println();

		// Lo mismo, pero ahora intercambiaremos dos posiciones de un array.
		String[] mascotas = { "Perro", "Gato", "Hamster", "Ardilla", "Conejo" };

		System.out.println(Arrays.toString(mascotas));
		
		// Intercambiamos la posición 1 (Gato) por 3 (Ardilla).
		String aux2;
		aux2 = mascotas[1];
		mascotas[1] = mascotas[3];
		mascotas[3] = aux2;

		System.out.println(Arrays.toString(mascotas));

	}

}

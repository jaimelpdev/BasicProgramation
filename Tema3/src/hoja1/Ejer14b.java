package hoja1;

public class Ejer14b {

	public static void main(String[] args) {

		// Modifica el programa para que, al comprobar si un número es primo, se divida
		// sólo entre los primos que ya se han encontrado (y que ya están en el array).

		// Por ejemplo, para comprobar si 11 es primo, bastaría dividirlo entre 2,3,5,7.

		int primos[] = new int[100];

		int numPrimos = 0;
		boolean primo;

		int i = 2;
		while (numPrimos < primos.length) {

			primo = true;

			// Esta condición comprueba lo que dice el encunciado del ejercicio.
			for (int j = 0; j < numPrimos && primos[j] * primos[j] <= i; j++) {

				// Con la modificación en la condición del bucle hay que cambiar la verificación
				// de por primos[j].
				if (i % primos[j] == 0) {
					primo = false;
					break;
				}

			}

			if (primo) {
				primos[numPrimos] = i;

				System.out.println(primos[numPrimos]);

				numPrimos++;
			}

			i++;

		}

	}

}

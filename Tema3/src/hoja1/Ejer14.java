package hoja1;

// Programa que muestre en pantalla los 100 primeros números primos.

public class Ejer14 {

	public static void main(String[] args) {

		int primos[] = new int[100];

		int numPrimos = 0;
		boolean primo;

		int i = 2;
		while (numPrimos < 100) {

			primo = true;
			for (int j = 2; j <= i / 2; j++) {

				if (i % j == 0) {
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
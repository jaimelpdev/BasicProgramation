package hoja1;

// Programa que muestre en pantalla los 100 primeros números primos.

public class EjerPrimos03 {

	public static void main(String[] args) {

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
				System.out.println((numPrimos + 1) + ") " + i);
				numPrimos++;
			}

			i++;

		}

	}

}
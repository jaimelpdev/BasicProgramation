package hoja1;

public class Ejer16 {

	public static void main(String[] args) {

		double temps[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double suma = 0;
		double media = 0;
		int j = 0;

		for (int i = 0; i < temps.length; i++) {
			suma += temps[i];
			media = suma / temps.length;

			if (temps[i] > 12) {
				j++;
			}

		}

		System.out.println(media + " ºC");
		System.out.println(j + " temperaturas están por encima de 12ºC");

	}

}

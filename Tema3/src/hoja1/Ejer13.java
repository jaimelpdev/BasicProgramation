package hoja1;

public class Ejer13 {

	public static void main(String[] args) {

		int potencias[] = new int[20];

		for (int i = 0; i < potencias.length; i++) {

			potencias[i] = (int) (Math.pow(2, i));

		}

		int i = 0;

		while (i < potencias.length) {
			System.out.println(potencias[i]);
			i++;
		}

	}

}

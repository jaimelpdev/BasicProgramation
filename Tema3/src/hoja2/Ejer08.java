package hoja2;

public class Ejer08 {

	public static void main(String[] args) {

		int humedades[] = { 45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50,
				45 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < humedades.length; i++) {
			if (humedades[i] < humedades[posMin]) {
				posMin = i;
			} else if (humedades[i] > humedades[posMax]) {
				posMax = i;

			}

		}

		System.out.println("La humedad máxima ha sido " + humedades[posMax] + "% a las " + posMax + "H.");

		System.out.println("La humedad mínima ha sido " + humedades[posMin] + "% a las " + posMin + "H.");

	}

}
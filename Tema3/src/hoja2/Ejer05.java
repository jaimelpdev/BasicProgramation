package hoja2;

import java.util.Iterator;

public class Ejer05 {

	public static void main(String[] args) {

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			} else if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;
			}
		}

		System.out.println("La temperatura mínima es " + temperaturas[posMin] + " y está en la posición " + posMin);
		System.out.println("La temperatura máxima es " + temperaturas[posMax] + " y está en la posición " + posMax);
		
	}

}

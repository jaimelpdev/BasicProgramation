package hoja1;

public class Ejer05 {

	public static void main(String[] args) {

		double notas[] = new double[5];
		int i = 0;

		notas[0] = 7;
		notas[1] = 5;
		notas[2] = 10;
		notas[3] = 8;
		notas[4] = 10;

		while (i < notas.length) {
			System.out.println("Nota " + (i + 1) + ": " + notas[i]);
			i++;
		}

	}

}

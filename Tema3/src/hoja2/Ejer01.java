package hoja2;

public class Ejer01 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };

		boolean encontrado = false;
		final int EDAD = 35;
		int i;

		for (i = 0; i < edades.length; i++) {
			if (edades[i] == EDAD) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			System.out.println("La edad " + EDAD + " aparece en la posición " + i + ".");
		} else {
			System.out.println("La edad " + EDAD + " no aparece en ninguna posición.");
		}

	}

}

package ejercicios;

public class Ejer11 {

	public static void main(String[] args) {

		System.out.println(anyoBisiesto(2021));

	}

	static boolean anyoBisiesto(int anyo) {

		boolean esBisiesto = false;

		if (anyo % 4 == 0 && anyo % 100 != 0 || anyo % 100 == 0 && anyo % 400 == 0) {
			esBisiesto = true;
		}

		return esBisiesto;

	}

}

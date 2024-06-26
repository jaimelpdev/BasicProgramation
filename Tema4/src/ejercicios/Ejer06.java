package ejercicios;

public class Ejer06 {

	public static void main(String[] args) {

		int centigrados = 9;

		System.out.println("Aquí hacen " + fahrenheit(centigrados) + "ºF");

	}

	static int fahrenheit(int centigrados) {

		return centigrados * 9 / 5 + 32;

	}

}

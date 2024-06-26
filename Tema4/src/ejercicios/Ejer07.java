package ejercicios;

public class Ejer07 {

	public static void main(String[] args) {

		int fahrenheit = 47;

		System.out.println("Aquí hacen " + celsius(fahrenheit) + "ºC");

	}

	static int celsius(int fahrenheit) {

		return (fahrenheit - 32) * 5 / 9;

	}

}

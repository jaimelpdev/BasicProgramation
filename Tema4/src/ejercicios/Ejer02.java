package ejercicios;

public class Ejer02 {

	public static void main(String[] args) {

		String nombre = "Jaime";
		int edad = 20;

		System.out.println(persona(nombre, edad));

	}

	static String persona(String nombre, int edad) {

		String frase = "Hola, " + nombre + " no parece que tengas " + edad + " años.";

		return frase;

	}

}

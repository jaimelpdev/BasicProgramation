package ejercicios;

public class Ejer01 {

	public static void main(String[] args) {

		String nombre = "Jaime";
		int edad = 20;

		persona(nombre, edad);

	}

	static void persona(String nombre, int edad) {

		System.out.println("Hola, " + nombre + " no parece que tengas " + edad + " años.");

	}

}

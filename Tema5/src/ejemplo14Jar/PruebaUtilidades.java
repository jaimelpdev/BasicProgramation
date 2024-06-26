package ejemplo14Jar;

import utilidades.Consola;

public class PruebaUtilidades {

	public static void main(String[] args) {

		System.out.println("¿Cuántos años tienes?");
		int edad = Consola.leerInt();

		System.out.println("Tienes " + edad + " años.");

	}

}

package extra;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** Separador de nombre y extensión de archivos ***\n");

		System.out.println("Escribe un nombre de archivo con su extensión:");
		String nombreCompleto = entrada.nextLine();

		System.out.println("\nNombre: " + nombreArchivo(nombreCompleto));
		System.out.println("Extensión: " + extensionArchivo(nombreCompleto));

	}

	static String nombreArchivo(String nombreCompleto) {
		int punto = nombreCompleto.lastIndexOf(".");

		return nombreCompleto.substring(0, punto);
	}

	static String extensionArchivo(String nombreCompleto) {
		int punto = nombreCompleto.lastIndexOf(".");

		return nombreCompleto.substring(punto + 1);
	}

}

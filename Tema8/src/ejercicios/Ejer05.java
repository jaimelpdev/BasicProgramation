package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 0;

		System.out.println("Nombre del archivo:");
		String nombreArchivo = "ficheros/" + entrada.nextLine();

		System.out.println("\nPalabra a contar:");
		String palabra = entrada.nextLine();

		try {
			BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));

			String linea = br.readLine();

			while (linea != null) {
				i = i + numApariciones(linea, palabra);
				
				linea = br.readLine();
			}

			System.out.println(palabra + " ha aparecido " + i + " veces.");

			br.close();
		} catch (IOException e) {
			System.out.println("Se ha producido un error de lectura.");
		}

	}

	private static int numApariciones(String linea, String palabra) {
		int i = 0;

		int index = linea.indexOf(palabra);

		while (index != -1) {
			i++;
			index = linea.indexOf(palabra, index + palabra.length());
		}

		return i;

	}

}

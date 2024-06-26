package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejer03 {

	public static void main(String[] args) {

		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));
			String linea = buffer.readLine();
			
			while(linea != null) {
				String[] datos = linea.split(",");
				
					System.out.println("Apellidos: " + datos[0]);
					System.out.println("Nombre: " + datos[1]);
					System.out.println("Teléfono: " + datos[2]);
					System.out.println("------");
					
					linea = buffer.readLine();
			}

			buffer.close();
		} catch (IOException e) {
			System.out.println("Error de E/S.");
		}

	}

}

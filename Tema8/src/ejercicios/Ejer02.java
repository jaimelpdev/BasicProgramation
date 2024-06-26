package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		final String NOMBRE_ARCHIVO = "ficheros/contactos.txt";
		String nombre, apellidos, telf;
		
		try {

			FileWriter archivo = new FileWriter(NOMBRE_ARCHIVO, true);

			BufferedWriter buffer = new BufferedWriter(archivo);

			for (int i = 0; i < 3; i++) {
				System.out.println("PERSONA " + (i + 1) + ":");
				System.out.print("Apellidos: ");
				apellidos = entrada.nextLine();
				System.out.print("Nombre: ");
				nombre = entrada.nextLine();
				System.out.print("Telefono: ");
				telf = entrada.nextLine();
		
				buffer.write(apellidos + ", " + nombre + ", " + telf + "\n");
			}

			buffer.close();
 
		} catch (IOException e) {
			System.out.println("Error de escritura en disco.");
		}

	}

}

package ejercicios;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		final String NOMBRE_ARCHIVO = "ficheros/index.html";
		
		System.out.print("Título de la página: ");
		String titulo = entrada.nextLine();
		System.out.print("Encabezado de la página: ");
		String encabezado = entrada.nextLine();
		System.out.println("Contenido de la página:");
		String contenido = entrada.nextLine();
		
		
		try {			
			BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

			bw.write("<!DOCTYPE html>\n"
					+ "<html lang=\"es\">\n"
					+ "<head>\n"
					+ "    <meta charset=\"UTF-8\">\n"
					+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
					+ "    <title>" + titulo + "</title>\n"
					+ "</head>\n"
					+ "<body>\n"
					+ "<header>\n"
					+ "<h1>" + encabezado + "</h1>\n"
					+ "</header>\n"
					+ "<section>\n"
					+ "<p>" + contenido + "</p>\n"
					+ "</section>\n"
					+ "</body>"
					+ "</html>");

			bw.close();
		} catch (IOException e) {
			System.out.println("Se ha producido un error de E/S");
		}

		System.out.println("Se ha creado la página en tu carpeta personal. De nada.");

	}

}

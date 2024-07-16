package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	private static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		java.util.Scanner entrada = new java.util.Scanner(System.in);

		// Leemos los datos de los autores del libro.
		Autor autor1 = leerAutor();
		System.out.println("\nDatos del autor: \n" + autor1.toString());

		Autor autor2 = leerAutor();
		System.out.println("\nDatos del autor: \n" + autor2.toString());

		// Leemos los datos de un libro (suponemos que del autor anterior) y los
		// guardamos en un objeto Libro.
		System.out.println("\n******* ALTA DE LIBRO *******");

		System.out.print("Título: ");
		String titulo = entrada.nextLine();

		System.out.print("ISBN: ");
		String isbn = entrada.nextLine();

		System.out.print("Año actual: ");
		int anyo = entrada.nextInt();

		// Creo un array con los autores del libro.
		Autor[] autores = { autor1, autor2 };

		Libro libro1 = new Libro(titulo, isbn, autores);
		Libro.setAnyoActual(anyo);

		System.out.println("\nDatos del libro: \n" + libro1.toString());

		System.out.println(libro1.muestraAutores());

	}

	// Leemos los datos de un autor y los guardamos en un objeto de la clase Autor.
	private static Autor leerAutor() {

		System.out.println("******* ALTA DE AUTOR *******");

		System.out.print("Nombre del autor: ");
		String nombre = entrada.nextLine();

		System.out.print("Email del autor: ");
		String email = entrada.nextLine();

		System.out.print("Año de nacimiento del autor: ");
		int anyo = entrada.nextInt();

		// Limpiamos el buffer de entrada para evitar que se salte la siguiente lectura.
		entrada.nextLine();

		return new Autor(nombre, email, anyo);

	}

}
package ejemplo07Visibilidad;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos de la clase Coche.
	private String matricula;
	String marca;
	public String modelo;
	String averia;
	int kilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	Coche(String matricula, String marca, String modelo, String averia, int kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.kilometros = kilometros;
	}

	// Constructor explícito que tome la matrícula, marca, modelo y deje el resto de
	// datos por defecto.
	Coche(String matricula, String marca, String modelo) {
		this(matricula, marca, modelo, null, 0);
	}

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde
	// la terminal.
	void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("INTRODUCCIÓN DE DATOS DEL COCHE");
		System.out.print("Matricula: ");
		matricula = entrada.nextLine();
		System.out.print("Marca: ");
		marca = entrada.nextLine();
		System.out.print("Modelo: ");
		modelo = entrada.nextLine();
		System.out.print("Averia: ");
		averia = entrada.nextLine();
		System.out.println("Kilometros: ");
		kilometros = entrada.nextInt();
	}

	// Muestra todas las propiedades del objeto.
	void mostrar() {

		System.out.println("\nDATOS DEL COCHE");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Averia: " + averia);
		System.out.println("Kilometros: " + kilometros);

	}

}

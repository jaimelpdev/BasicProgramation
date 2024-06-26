package ejemplo02Coche;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos de la clase Coche.
	String matricula, marca, modelo, averia;
	int kilometros;

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

		System.out.println("DATOS DEL COCHE");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Averia: " + averia);
		System.out.println("Kilometros: " + kilometros);

	}

}

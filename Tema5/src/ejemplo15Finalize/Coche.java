package ejemplo15Finalize;

import java.util.Scanner;

public class Coche {

	// Propiedades o atributos de la clase Coche.
	private String matricula, marca, modelo, averia;
	private int kilometros;

	// Constructor explícito que tome los cinco valores de los atributos.
	public Coche(String matricula, String marca, String modelo, String averia, int kilometros) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.averia = averia;
		this.kilometros = kilometros;
	}

	// Constructor explícito que tome la matrícula, marca, modelo y deje el resto de
	// datos por defecto.
	public Coche(String matricula, String marca, String modelo) {
		this(matricula, marca, modelo, null, 0);
	}

	// leeDatos() pregunta al usuario los valores de las propiedades y los lee desde
	// la terminal.
	public void leeDatos() {
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
	public void mostrar() {

		System.out.println("\nDATOS DEL COCHE");
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Averia: " + averia);
		System.out.println("Kilometros: " + kilometros);

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("ELIMINANDO OBJETO DE LA MEMORIA");
	}

	// METODOS DE ACCESO

	// Método que nos permite leer el atributo matricula.
	public String getMatricula() {
		return matricula;
	}

	// Método que nos permite dar un valor al atributo matricula.
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	// Método que nos permite leer el atributo marca.
	public String getMarca() {
		return marca;
	}

	// Método que nos permite dar un valor al atributo marca.
	public void setmarca(String marca) {
		this.marca = marca;
	}

	// Método que nos permite leer el atributo modelo.
	public String getModelo() {
		return matricula;
	}

	// Método que nos permite dar un valor al atributo modelo.
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// Método que nos permite leer el atributo averia.
	public String getAveria() {
		return averia;
	}

	// Método que nos permite dar un valor al atributo averia.
	public void setAveria(String averia) {
		this.averia = averia;
	}

	// Método que nos permite leer el atributo kilometros.
	public int getKilometros() {
		return kilometros;
	}

	// Método que nos permite dar un valor al atributo kilometros.
	public void setKilometros(int kilometros) {
		// Comprobamos que los kilometros no sean un número negativo.
		if (kilometros < 0) {
			return;
		}

		this.kilometros = kilometros;
	}

}

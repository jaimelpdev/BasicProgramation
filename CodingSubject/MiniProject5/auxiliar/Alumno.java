package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;
	private String apellidos, nombre;
	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public String toString() {
		return "\n(" + numExpediente + ") " + nombre + " " + apellidos + "\nGrupo:" + grupo.toString();
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Número de expediente: ");
		numExpediente = entrada.nextInt();
		entrada.nextLine();

		System.out.print("Nombre: ");
		nombre = entrada.nextLine();

		System.out.print("Apellidos: ");
		apellidos = entrada.nextLine();

		System.out.println("Grupo: ");
		grupo = new Grupo();
		grupo.leeDatos();
	}

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}

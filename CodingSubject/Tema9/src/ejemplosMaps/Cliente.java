package ejemplosMaps;

import java.util.Objects;

public class Cliente {

	private String apellidos, nombre, dni;

	public Cliente(String apellidos, String nombre, String dni) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellidos, dni, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) obj;

		if (apellidos.equals(cliente.apellidos) && nombre.equals(cliente.nombre) && dni.equals(dni)) {
			return true;
		}

		return false;

		// Objects.equals(apellidos, cliente.apellidos) && Objects.equals(dni,
		// cliente.dni)
		// && Objects.equals(nombre, cliente.nombre);
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos + " " + " (" + dni + ")";
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}

package ejemplosListas;

public class Cliente {

	private String apellidos, nombre, dni;

	public Cliente(String apellidos, String nombre, String dni) {
		super();
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return nombre + " " + apellidos;
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

		if (dni.equals(((Cliente) obj).getDni()) && nombre.equals(((Cliente) obj).getNombre())
				&& apellidos.equals(((Cliente) obj).getApellidos())) {
			return true;
		}

		return false;
	}

	private String getApellidos() {
		return apellidos;
	}

	private String getNombre() {
		return nombre;
	}

	private String getDni() {
		return dni;
	}

}

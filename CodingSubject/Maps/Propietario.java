package Maps;

public class Propietario {

	private String dni, nombre, apellidos;

	public Propietario(String dni, String nombre, String apellidos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellidos + " " + " (" + dni + ")";
	}
	
}

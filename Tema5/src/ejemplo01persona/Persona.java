package ejemplo01persona;

public class Persona {

	// Propiedades o atributos de la clase:
	String apellidos, nombre, dni, fechaNacimiento;

	// Métodos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
	}

	// tieneDni() devuelve true si la persona tiene DNI y false si no lo tiene.
	boolean tieneDni() {
		if (dni != null) {
			return true;
		}
		return false;
	}

	// anyoNacimiento() devuelve el año de nacimiento (suponiendo que la fecha está
	// en formato dd/mm/aaaa).
	String anyoNacimiento() {
		if (fechaNacimiento == null) {
			return null;
		}
		return fechaNacimiento.substring(6);
	}

}

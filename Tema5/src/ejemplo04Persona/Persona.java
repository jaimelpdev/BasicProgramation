package ejemplo04Persona;

public class Persona {

	// Propiedades o atributos de la clase:
	String apellidos, nombre, dni, fechaNacimiento;

	// MÉTODOS.

	// Constructor implícito de la clase.
	Persona() {

	}

	// Constructor explícito. Nos permite meter argumentos.
	// this se refiere al objeto que estamos creando.
	// this.apellidos se refiere al atributo apellidos, por ejemplo.
	Persona(String apellidos, String nombre, String dni, String fechaNacimiento) {
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Constructor explícito. Le pasamos los apellidos y el nombre de la persona.
	// y dejamos los otros datos con valores por defecto.
	Persona(String apellidos, String nombre) {

		// Podemos llamar al constructor anterior usando la palabra clave "this".
		this(apellidos, nombre, "Sin DNI", null);
	}

	// Constructor expílicito. Le pasamos el dni y dejamos el resto de atributos con
	// valor null.
	Persona(String dni) {
		this.dni = dni;

		// Lo mismo podría hacerse con this(null, null, dni, null);
	}

	// tieneDni() devuelve true si la persona tiene DNI y false si no lo tiene.
	boolean tieneDni() {
		if (dni == null || dni.equals("Sin DNI")) {
			return false;
		}
		return true;
	}

	// Muestra en la terminal todos los valores de los atributos.
	void mostrar() {
		System.out.println("\nNombre completo: " + apellidos + ", " + nombre + ".");
		System.out.println("DNI: " + dni + ".");
		System.out.println("Fecha de nacimiento: " + fechaNacimiento + ".");
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

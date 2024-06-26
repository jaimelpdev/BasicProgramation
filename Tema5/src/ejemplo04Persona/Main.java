package ejemplo04Persona;

public class Main {

	public static void main(String[] args) {

		// Declaramos la variable persona1, de tipo Persona, y le asignamos un objeto de
		// tipo Persona. Usamos el constructor y así evitamos asignar valor a cada
		// atributo por separado.
		Persona persona1 = new Persona("Sánchez", "Mario", "22100100T", "10/10/1980");

		// Queremos mostrar algunos datos de persona1.
		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");
		System.out.println("Nació el " + persona1.fechaNacimiento);

		// Podemos cambiar cualquier propiedad.
		persona1.apellidos = "Sánchez Pérez";

		System.out.println("Nuestra persona se llama " + persona1.nombre + " " + persona1.apellidos + ".");

		// Podemos crear tantos objetos Persona como necesitemos.
		Persona persona2;
		persona2 = new Persona("Martínez López", "María");

		System.out.println("\nNuestra persona 2 se llama " + persona2.nombre + " " + persona2.apellidos + ".");

		// Al crear persona2 no le dimos un valor a fechaNacimiento, por lo que será
		// null.
		System.out.println(persona2.nombre + " nació el " + persona2.fechaNacimiento);

		// Creamos otras 3 personas.
		Persona persona3 = new Persona("Gómez", "Alberto", "12345678K", "05/03/1984");
		Persona persona4 = new Persona("Marcos", "Manuel");
		Persona persona5 = new Persona("47327195F");

		persona3.mostrar();
		persona4.mostrar();
		persona5.mostrar();

		// Para que la siguiente instrucción funcione es necesario haber escrito el
		// constructor implícito, ya que éste desaparece en el momento que creamos a
		// mano un constructor explícito.
		Persona persona6 = new Persona();

	}

}

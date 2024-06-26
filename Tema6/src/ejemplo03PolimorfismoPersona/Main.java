package ejemplo03PolimorfismoPersona;

public class Main {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Pérez Ortiz", "Rubén", "20100100R", "9012-1211-1732-1230");
		cliente1.mostrar();

		Directivo directivo1 = new Directivo("Rodríguez", "Miguel", "10200200R", 51, 200);
		directivo1.mostrar();

		// Ejemplos de polimorfismo

		// A p1, que es de tipo Persona le puedo asignar un objeto de tipo Cliente, ya
		// que Cliente es un tipo de persona (hereda de persona).
		Persona p1 = cliente1;

		// A p1, que es de tipo Persona le puedo asignar un objeto de tipo Directivo, ya
		// que Directivo es un tipo de Empleado (hereda de Empleado), que a su vez, es
		// un tipo de Persona (hereda de Persona).
		Persona p2 = directivo1;

		// Si llamamos al método mostrar() de p1, se ejecuta el de Cliente.
		p1.mostrar();

		// Si llamamos al método mostrar() de p2, se ejecuta el de Directivo.
		p2.mostrar();

		// Sólo se puede llamar a métodos de p1 o p2 si existen en la clase padre
		// (Persona).

		// Un objeto de tipo Persona no necesariamente puede asignarse a una variable
		// Cliente.
		// No cualquier Persona es un Cliente.
		Persona p3 = new Persona();
		// Cliente cliente2 = p3; No se puede

		// Podemos asignar a una variable de tipo Cliente otra variable de tipo
		// Persona, haciendo un cast a Cliente, Siempre que sepamos que la variable de
		// tipo Persona apunta a un objeto Cliente.
		Cliente cliente3 = (Cliente) p1;

		// Lo siguiente dará error, ya que p2 está apuntando a un objeto de
		// tipoDirectivo, no de tipo Cliente.
		// Cliente cliente4 = (Cliente) p2;

		// Podemos crear un array de tipo Persona y guardar ahí tanto Clientes, como
		// Empleados, como Directivos.
		Persona personas[] = new Persona[10];

		personas[0] = cliente1;
		personas[1] = directivo1;
		personas[2] = new Empleado("Jiménez", "Pedro", "87654321L", 5);

		Empleado empleado1 = (Empleado) personas[2];

	}

}
package Project1;

public class Main {

	public static void main(String[] args) {
		// No se pueden crear objetos de una clase que es abstracta, solo se pueden
		// crear objetos de sus hijos.
		// Medio me1 = new Medio();

		Mp3 mp1 = new Mp3("Hola que tal", 140, "La Unión", "Pop", 1);
		Ogg o1 = new Ogg("Buenas tardes", 180, "Que Tal", "Pop", 2);

		Medio m1 = mp1;

		m1.reproducir();
		((Mp3) m1).guardar();

		Guardable g1 = o1;

	}

}

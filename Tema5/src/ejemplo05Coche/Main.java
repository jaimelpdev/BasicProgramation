package ejemplo05Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche3 = new Coche("1234ABC", "Honda", "Civic Type R", "Fallo motor", 163000);
		Coche coche4 = new Coche("4321FIE", "Toyota", "GT86");

		coche3.mostrar();
		coche4.mostrar();

	}

}

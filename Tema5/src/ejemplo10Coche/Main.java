package ejemplo10Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche3 = new Coche("1234ABC", "Honda", "Civic Type R", "Fallo motor", 163000);
		Coche coche4 = new Coche("4321FIE", "Toyota", "GT86");

		coche3.mostrar();
		coche4.mostrar();

		coche3.setAveria("Cambio de aceite");

		// Hemos puesto en el setter una restricción de forma que solo se guarde un
		// valor positivo.
		coche3.setKilometros(-100);

		// Vemos que coche 2 sigue con los mismos kilometros.
		coche3.mostrar();

	}

}

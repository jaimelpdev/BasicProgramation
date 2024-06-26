package ejemplo02Coche;

public class Main {

	public static void main(String[] args) {

		Coche coche1 = new Coche();

		coche1.matricula = "1234ABC";
		coche1.marca = "Nissan";
		coche1.modelo = "Silvia";
		coche1.averia = "Mal funcionamiento del turbo";
		coche1.kilometros = 480000;

		Coche coche2 = new Coche();
		coche2.leeDatos();
		System.out.println();
		coche2.mostrar();

	}

}

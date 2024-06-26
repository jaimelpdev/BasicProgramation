package ejemplo15Finalize;

public class Main {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			Coche coche = new Coche("1234ABC", "Seat", "Ibiza");
			coche = null;
		}

		System.gc();

		System.out.println("FIN");

	}

}

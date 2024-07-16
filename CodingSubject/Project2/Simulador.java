package Project2;

public class Simulador {

	public static void main(String[] args) {

		// Componente componente1 = new Componente(120, 40);
		Condensador condensador1 = new Condensador(80, 20, 4);

		Diodo d1 = new Diodo(0, 0, 0);
		d1.leeDatos();

		Led l1 = new Led(10, 5, 20, "Verde");

		Componente componente2 = d1;
		Diodo d2 = l1;

	}

}

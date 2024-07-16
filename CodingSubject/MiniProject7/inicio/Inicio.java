package inicio;

import electrodomesticos.Lavadora;
import electrodomesticos.Motor;
import electrodomesticos.Taller;

public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(1, "Mitsubishi", "M1");
		Lavadora lavadora1 = new Lavadora(1, motor1, "Samsung", 379, 20);
		Motor motor2 = new Motor(2, "Tesla", "T1");
		Lavadora lavadora2 = new Lavadora(2, motor2, "Bosh", 293, 20);

		Taller taller = new Taller();

		taller.addLavadora(lavadora1);
		taller.addLavadora(lavadora2);
		taller.listaLavadoras();

		taller.borraLavadora(1);
		taller.listaLavadoras();

		int id = 2;

		if (taller.buscaLavadora(id) == -1) {
			System.out.println("No se ha encontrado la lavadora con el id " + id + ".");
		} else {
			System.out.println("Se ha encontrado la lavadora con el id " + id + " y está en la posición "
					+ taller.buscaLavadora(id) + ".");
		}

	}

}

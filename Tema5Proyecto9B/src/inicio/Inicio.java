package inicio;

import electrodomesticos.Lavadora;
import electrodomesticos.Motor;
import electrodomesticos.Taller;

public class Inicio {

	public static void main(String[] args) {

		Motor motor1 = new Motor(1, "Mitsubishi", "V1");
		Lavadora l1 = new Lavadora(1, motor1, "Samsung", 200);
		Lavadora l2 = new Lavadora(2, motor1, "Bosh", 275);
		Taller t1 = new Taller();

		t1.addLavadora(l1);
		t1.addLavadora(l2);
		t1.listaLavadoras();

		t1.borraLavadora(1);
		t1.listaLavadoras();

		System.out.println(t1.buscaLavadora(2));

	}

}

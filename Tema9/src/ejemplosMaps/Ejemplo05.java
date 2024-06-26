package ejemplosMaps;

import java.util.HashMap;
import java.util.Map;

public class Ejemplo05 {

	public static void main(String[] args) {

		Map<Mascota, Propietario> duenyos = new HashMap<>();

		Mascota mascota1 = new Mascota(1, "Pipo", "Perro");
		Mascota mascota2 = new Mascota(2, "Boby", "Gato");
		Mascota mascota3 = new Mascota(3, "Federico", "Canario");

		Propietario propietario1 = new Propietario("12345678L", "Lucas", "Martínez");
		Propietario propietario2 = new Propietario("12345678V", "Hugo", "Rodríguez");
		Propietario propietario3 = new Propietario("87654321E", "Marcos", "Giménez");

		duenyos.put(mascota1, propietario1);
		duenyos.put(mascota2, propietario2);
		duenyos.put(mascota3, propietario3);

		for (Mascota mascota : duenyos.keySet()) {
			System.out.println(mascota.toString() + "\n" + duenyos.get(mascota).toString());
		}

	}

}

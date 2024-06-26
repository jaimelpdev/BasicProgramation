package hoja2;

public class Ejer07 {

	public static void main(String[] args) {

		String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		int[] espectadores = { 2000000, 2500000, 3100000, 3000000, 1200000, 1800000, 2050000 };

		int especMin = 0, especMax = 0;

		for (int i = 0; i < espectadores.length; i++) {
			if (espectadores[i] < espectadores[especMin]) {
				especMin = i;
			} else if (espectadores[i] > espectadores[especMax]) {
				especMax = i;
			}

		}

		System.out.println("La audiencia mínima fué el " + dias[especMin] + " con " + espectadores[especMin] + ".");
		System.out.println(
				"La audiencia máxima fué el " + dias[especMax] + " en la posición " + espectadores[especMax] + ".");

	}

}

package ejercicios;

public class Ejer14 {

	public static void main(String[] args) {

		String[] planetas = { "Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno",
				"Plutón" };

		System.out.println(buscar(planetas, "Tierra"));

	}

	static int buscar(String[] planetas, String nomPlaneta) {
		for (int i = 0; i < planetas.length; i++) {
			if (nomPlaneta.equals(planetas[i])) {
				return i;
			}
		}

		return -1;
	}

}

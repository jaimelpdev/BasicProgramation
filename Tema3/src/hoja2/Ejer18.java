package hoja2;

public class Ejer18 {

	public static void main(String[] args) {

		String calificaciones[][] = { { "Jose Luis Martínez", "7" }, { "Antonia Ruiz", "9" },
				{ "Marcos Ramírez", "10" }, { "Juana Herranz", "4" }, { "Alberto López", "7" } };

		double suma = 0;
		double media = 0;
		int posMin = 0;
		int posMax = 0;

		for (int fila = 0; fila < calificaciones.length; fila++) {

			if (Double.parseDouble(calificaciones[fila][1]) < Double.parseDouble(calificaciones[posMin][1])) {
				posMin = fila;
			} else if (Double.parseDouble(calificaciones[fila][1]) > Double.parseDouble(calificaciones[posMax][1])) {
				posMax = fila;
			}

			for (int col = 0; col < calificaciones[0].length; col++) {
				System.out.print(calificaciones[fila][col] + "\t");
			}

			System.out.println();

		}

		for (int fila = 0; fila < calificaciones.length; fila++) {
			suma += Double.parseDouble(calificaciones[fila][1]);
		}

		media = suma / calificaciones.length;

		System.out.println("La nota media de este curso es " + media);
		System.out.println(calificaciones[posMin][0] + " tiene la nota más baja, un " + calificaciones[posMin][1]);
		System.out.println(calificaciones[posMax][0] + " tiene la nota más alta, un " + calificaciones[posMax][1]);

	}

}

package ejemplos;

public class Ejemplo12 {

	public static void main(String[] args) {

		// Actividad: Escribe una tabla con edades y alturas de un grupo de personas. La
		// tabla se llamará datos(al menos 4 filas).
		double datos[][] = { { 12, 1.70 }, { 14, 1.68 }, { 13, 1.42 }, { 17, 1.92 } };

		System.out.println("Edad\tAltura");

		for (int fila = 0; fila < datos.length; fila++) {

			for (int col = 0; col < datos[0].length; col++) {
				System.out.print(datos[fila][col] + "\t");
			}

			System.out.println();

		}

	}

}

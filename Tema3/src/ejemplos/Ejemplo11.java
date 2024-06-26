package ejemplos;

public class Ejemplo11 {

	public static void main(String[] args) {

		double[][] medidas = { 
				{ 8.5, 1010, 40 }, 
				{ 14.2, 1021, 35 }, 
				{ 11, 1022, 45 }, 
				{ 7, 1023, 50 }
			};
			// Mostramos la celda en la fila 0, columna 0.
			System.out.println(medidas[0][0]);

			// Mostramos la celda en la fila 0, columna 2.
			System.out.println(medidas[0][2]);
			// Mostramos la celda en la fila 3, columna 2.
			System.out.println(medidas[3][2]);

			System.out.println();

			// Recorremos la primera fila. Para eso dejamos la fila en 0 y hacemos que la
			// columna vaya tomando los valores 0, 1 y 2.
			// El número de columnas es siempre medidas[0].length.
			for (int col = 0; col < medidas[0].length; col++) {
				System.out.print(medidas[0][col] + " ");
			}

			System.out.println();

			// Recorremos la primera columna. PAra eso dejamos la columna en 0 y hacemos que
			// la fila vaya tomando los valores 0, 1, 2 y 3.
			for (int fila = 0; fila < medidas.length; fila++) {
				System.out.println(medidas[fila][0]);
			}

			System.out.println("\nTemp\tPresión\tHumedad");

			// Podemos recorrer tanto las filas como las columnas para mostrar la tabla
			// entera.
			for (int fila = 0; fila < medidas.length; fila++) {

				// Mostramos la fila indicada por la variable fila.
				for (int col = 0; col < medidas[0].length; col++) {
					System.out.print(medidas[fila][col] + "\t");
				}

				System.out.println();

			}

			// Si la tabla tiene pocas columnas, no pasa nada si el bucle interno lo
			// cambiamos por un print.
			System.out.println("\nTemp\tPresión\tHumedad");

			// Podemos recorrer tanto las filas como las columnas para mostrar la tabla
			// entera.
			for (int fila = 0; fila < medidas.length; fila++) {

				// Mostramos la fila indicada por la variable fila.
				System.out.println(medidas[fila][0] + "\t" + medidas[fila][1] + "\t" + medidas[fila][2]);
			}

			System.out.println();

		}

	}

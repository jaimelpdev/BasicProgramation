package hoja2;

public class Ejer15 {

	public static void main(String[] args) {

		String[][] productos = { 
				{ "Tablet Samsung", "120" }, 
				{ "Móvil Sony", "115" }, 
				{ "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } 
				};

		double sum = 0;
		int posMin = 0;
		int posMax = 0;

		System.out.println("Artículos");
		System.out.println("============================");

		for (int fila = 0; fila < productos.length; fila++) {
			posMin = fila;
			for (int col = 0; col < productos[0].length; col++) {
				System.out.print(productos[fila][col] + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (int fila = 0; fila < productos.length; fila++) {
			sum += Double.parseDouble(productos[fila][1]);
			posMin = fila;
			
			if (Double.parseDouble(productos[fila][1]) < Double.parseDouble(productos[posMin][1])) {
				posMin = fila;
			} else if (Double.parseDouble(productos[fila][1]) > Double.parseDouble(productos[posMax][1])) {
				posMax = fila;
			}

		}

		System.out.println("Total: " + sum + " €");
		System.out.println("El precio más alto es " + productos[posMax][1] + " €.");
		System.out.println("El precio más bajo es " + productos[posMin][1] + " €.");

	}

}

package Project3;

public class Cuenta {

	private final String ENCABEZADO_CUENTA = "CAFETERÍA SON FERRER\nC/Cóndor, 9\nSon Ferrer, Calvià\n-----------------------------------\n";
	String[][] articulos;
	private int numArticulos;
	private final int MAX_ARTICULOS;

	// Método constructor de la clase, lo hemos hecho explicito para inicializar el
	// array.
	public Cuenta(int maxArticulos) {
		this.MAX_ARTICULOS = maxArticulos;
		articulos = new String[MAX_ARTICULOS][3];
		numArticulos = 0;
	}

	// Método para añadir un artículo siempre que haya espacio en el array.
	public void addArticulo(String nombre, String precio, String unidades) {
		if (hayEspacio()) {
			articulos[numArticulos][0] = nombre;
			articulos[numArticulos][1] = precio;
			articulos[numArticulos][2] = unidades;
			numArticulos++;
		}
	}

	// Método para asegurarse que en el array articulos queda espacio para un
	// artículo más, este método será usado en addArticulo().
	public boolean hayEspacio() {
		return numArticulos < articulos.length;
	}

	// Método para mostrar toda la información de todos los artículos.
	public String listadoArticulos() {
		String encabezadoArticulos = String.format("%-25s %4s %8s %8s", "DESCRIPCIÓN", "UDS.", "PRE./UD.", "TOTAL(€)");
		String decoracionEncabezado = String.format("%-25s %4s %8s %8s", "-------------------------", "----",
				"--------", "--------");
		String listaArticulos = ENCABEZADO_CUENTA + "\n" + encabezadoArticulos + "\n" + decoracionEncabezado;

		for (int i = 0; i < articulos.length; i++) {
			if (articulos[i] != null && articulos[i][0] != null && !articulos[i][1].isEmpty()
					&& !articulos[i][2].isEmpty()) {
				double precio = Double.parseDouble(articulos[i][1]);
				double unidades = Double.parseDouble(articulos[i][2]);
				String infoArticulo = String.format("\n%-25s %4s %8s %8s", articulos[i][0], unidades, precio,
						precio * unidades);
				listaArticulos += infoArticulo;
			}
		}

		return listaArticulos;
	}

	// Método para mostrar los precios de la compra.
	public String totales() {
		double totalSinIva = 0.00;

		for (int i = 0; i < numArticulos; i++) {
			// Verificamos que el campo de unidades no está vacío.
			if (!articulos[i][2].isEmpty()) {
				totalSinIva += Double.parseDouble(articulos[i][1]) * Double.parseDouble(articulos[i][2]);
			}
		}

		double iva = totalSinIva * 0.10;
		double aPagar = totalSinIva + iva;

		return String.format("A PAGAR\n-----------------------------------\n\t* Total: " + redondear(totalSinIva)
				+ " €\n\t* IVA: " + redondear(iva) + " €\n\t* A pagar: " + redondear(aPagar) + " €");
	}

	// Método para que el programa vuelva a su estado habitual.
	public void resetear() {
		this.articulos = new String[MAX_ARTICULOS][3];
		this.numArticulos = 0;
	}

	// Método privado para redondear números, para ser usado en el método totales().
	private double redondear(double numero) {
		return Math.round(numero * 100.0) / 100.0;
	}

}

package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor[] autores = new Autor[5];
	private static int anyoActual;

	public Libro(String titulo, String isbn, Autor[] autores) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
	}

	public Libro(String titulo) {
		this.titulo = titulo;
		// this(titulo, null, null);
	}

	public String toString() {
		if (autores.length == 1) {
			return "Título: " + titulo + ", ISBN: " + isbn + ", Autor: " + autores[0].getNombre() + ", Año actual: "
					+ anyoActual;
		}

		return "Título: " + titulo + ", ISBN: " + isbn + ", Autor: varios autores, Año actual: " + anyoActual;
	}

	public String muestraAutores() {
		String autoresMostrar = "";
		for (int i = 0; i < autores.length; i++) {
			autoresMostrar = autoresMostrar + "- " + autores[i].toString() + "\n";
		}
		return autoresMostrar;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public static void setAnyoActual(int anyoActual) {
		// anyoActual es estático y vale lo mismo en cualquier objeto Libro.
		// Si usamos this.anyoActual daría la impresión de que podemos modificar
		// el atributo de forma distinta para objetos distintos.
		// Por eso, usamos el nombre de la clase: Libro.anyoActual.
		Libro.anyoActual = anyoActual;
	}

}
package biblioteca;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private static int anyoActual;

	public Libro(String titulo, String isbn, Autor autor) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
	}

	public Libro(String titulo) {
		this.titulo = titulo;
		// this(titulo, null, null);
	}

	public String toString() {
		return "Título: " + titulo + ", ISBN: " + isbn + ", Autor: " + autor.getNombre() + ", Año actual: " + anyoActual;
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

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
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
package practica01;

public class Video extends Medio {

	public Video(String nombre, double duracion) {
		super(nombre, duracion);
	}

	private String director, idioma;

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo...");
	}

}

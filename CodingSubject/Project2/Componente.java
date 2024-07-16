package Project2;

public abstract class Componente {

	private double IntensidadMaxima, longitud;

	public Componente(double intensidadMaxima, double longitud) {
		IntensidadMaxima = intensidadMaxima;
		this.longitud = longitud;
	}

	public abstract void conectar();

	public void setIntensidadMaxima(double intensidadMaxima) {
		IntensidadMaxima = intensidadMaxima;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}

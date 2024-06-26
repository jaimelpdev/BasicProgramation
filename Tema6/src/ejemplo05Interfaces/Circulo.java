package ejemplo05Interfaces;

public class Circulo implements Figura2D, Mostrable {

	private int radio;
	
	public Circulo(int radio) {
		this.radio = radio;
	}

	@Override
	public double perimetro() {
		return Math.PI * radio * radio;
	}

	@Override
	public double area() {
		return 2 * Math.PI * radio;
	}

	@Override
	public void mostrar() {
		System.out.println("Círculo de radio " + radio + ".");
	}

}

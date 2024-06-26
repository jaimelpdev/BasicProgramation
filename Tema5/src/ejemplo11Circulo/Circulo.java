package ejemplo11Circulo;

public class Circulo {

	// Constante PI
	final double PI = 3.141593;

	// Cordenadas x, y del círculo.
	private double x, y;

	// Radio del círculo
	private double radio;

	// Constructor implícito.
	public Circulo() {

	}

	// Constructor explícito, que recibe los valores de todos los atributos.
	public Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	// Constructor explícito que recibe sólo el valor del radio.
	public Circulo(double radio) {
		this.radio = radio;

		// También se podría hacer this(0, 0, radio);
	}

	// Devuelve el área del círculo.
	public double area() {
		return PI * radio * radio;
	}

	public double perimetro() {
		return 2 * PI * radio;
	}

	// MÉTODOS DE ACCESO

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

}

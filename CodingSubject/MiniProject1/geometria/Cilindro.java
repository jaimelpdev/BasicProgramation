package geometria;

public class Cilindro {

	private int altura, radio;

	static private final double PI = 3.141593;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public double getArea() {
		return 2 * PI * radio * altura + 2 * PI * radio * radio;
	}

	public double getVolumen() {
		return PI * radio * radio * altura;
	}

	public String toString() {
		return "La altura del cilindro es " + altura + " y el radio " + radio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getPI() {
		return PI;
	}

}

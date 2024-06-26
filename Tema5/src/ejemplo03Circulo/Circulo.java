package ejemplo03Circulo;

public class Circulo {

	// Constante PI
	final double PI = 3.141593;

	// Cordenadas x, y del círculo.
	double x, y;

	// Radio del círculo
	double radio;

	// Constructor implícito.
	Circulo() {

	}

	// Constructor explícito, que recibe los valores de todos los atributos.
	Circulo(double x, double y, double radio) {
		this.x = x;
		this.y = y;
		this.radio = radio;
	}

	// Devuelve el área del círculo.
	double area() {
		return PI * radio * radio;
	}

	double perimetro() {
		return 2 * PI * radio;
	}

}

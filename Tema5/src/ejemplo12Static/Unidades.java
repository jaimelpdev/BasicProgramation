package ejemplo12Static;

public class Unidades {

	// Los atributos son estáticos. Ésto hace que tengan el mismo valor para
	// cualquier objeto de la clase Unidades.
	public static double PI = 3.141592;

	// Factor de conversión de kilómetros a metros.
	static double kilometros = 1000;

	// Factor de conversión de centilitros a litros.
	static double centilitros = 0.01;

	// El siguiente método es estático. Eso significa que podemos llamarlo desde el
	// nombre de la clase, sin necesidad de crear un objeto previamente.
	public static double areaCirculo(double radio) {
		return PI * radio * radio;
	}

}

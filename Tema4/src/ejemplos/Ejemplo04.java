package ejemplos;

public class Ejemplo04 {

	public static void main(String[] args) {

		System.out.println("El doble de 15 es " + doblar(15));

		int doble = doblar(20);

		System.out.println("El doble de 20 es " + doblar(20));

	}

	// El método doblar() recibe un argumento, num, de tipo entero.
	// devuelve el resultado de multiplicar num por 2.
	static int doblar(int num) {
		return 2 * num;
	}

}

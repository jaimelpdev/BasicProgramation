package ejerciciosRecursividad;

public class Ejer05 {

	public static void main(String[] args) {
		int n = 7;
		System.out.println("La suma de los números enteros entre 1 y " + n + " es " + suma(n));
	}

	private static int suma(int num) {
		if (num == 1) {
			return 1;
		}

		return num + suma(num - 1);

	}

}

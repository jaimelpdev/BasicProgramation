
public class Ejemplo10 {

	public static void main(String[] args) {

		// Conversiones implícitas.
		byte num = 100;
		short num2 = num;

		// Conversiones explícitas.
		short num3 = 100;
		byte num4 = (byte) num3;

		System.out.println("Todo bien " + num4);

		// Más conversiones implícitas.
		long num5 = 10000;
		float num6 = num5;

		float num7 = 5000;
		double num8 = num7;

		System.out.println(num8);

		// Más conversiones explícitas.
		double num9 = 500;
		float num10 = (float) num9;
		
		System.out.println(num10);

	}

}

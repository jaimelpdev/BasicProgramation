package hoja1;

public class Ejer15 {

	public static void main(String[] args) {

		double temps[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6 };

		double suma = 0;
		double media = 0;
		
		for (int i = 0; i < temps.length; i++) {
			suma += temps[i];
			media = suma / temps.length;
		}
		
		System.out.println(media + " ºC");
		
	}

}

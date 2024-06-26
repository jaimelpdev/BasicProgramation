package cadenas;

import java.util.Scanner;

public class Ejer02 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String contrasenya;
		
		System.out.print("Contraseña: ");
		contrasenya = entrada.nextLine();
		
		if(contrasenya.length() >= 6 && contrasenya.length() <= 12) {
			System.out.println("La contraseña es correcta, contiene " + contrasenya.length() + " carácteres.");
		} else {
			System.out.println("La contraseña es incorrecta, contiene " + contrasenya.length() + " carácteres.");
		}
		
	}

}

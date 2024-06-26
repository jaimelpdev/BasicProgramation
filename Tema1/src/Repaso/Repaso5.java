package Repaso;
import java.util.Scanner;

public class Repaso5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int contrasena;
		
		System.out.print("Contraseña: ");
		contrasena = entrada.nextInt();
		
		if(contrasena == 1234) {
			System.out.println("Acceso concedido.");
		} else {
			System.out.println("Acceso denegado.");
		}
		
	}

}

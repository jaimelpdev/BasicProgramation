package Repaso;
import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int temperatura;
		
		System.out.print("Temperatura: ");
		temperatura = entrada.nextInt();
		
		if (temperatura > 120) {
			System.out.println("TEMPERATURA DEL REACTOR CRÍTICA. ¡CORRED, INSENSATOS!");
		}
		
	}

}

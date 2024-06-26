package ejemplo13CuentaBancaria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Saldo en la cuenta:");
		CuentaBancaria cuenta1 = new CuentaBancaria(entrada.nextInt());

		System.out.println("Dinero que quiere ingresar:");
		int cantidad = entrada.nextInt();

		System.out.println("Comisión:");
		int comision = entrada.nextInt();

		cuenta1.depositar(cantidad, comision);
		System.out.println(cuenta1.obtenerSaldo());

		System.out.println();

		System.out.println("Dinero que quiere retirar:");
		cantidad = entrada.nextInt();

		if (cuenta1.retirar(cantidad)) {
			System.out.println(cuenta1.obtenerSaldo());
		} else {
			System.out.println("No se ha podido realizar la operación.");
		}

	}

}

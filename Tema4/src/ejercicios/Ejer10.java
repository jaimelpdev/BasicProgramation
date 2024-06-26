package ejercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Mes del año (número): ");
		int mes = entrada.nextInt();

		guardarMes(mes);

	}

	static void guardarMes(int mes) {

		String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		if (mes > 12 || mes < 1) {
			return;
		}

		System.out.println(meses[mes - 1]);

	}

}

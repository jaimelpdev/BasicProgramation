package hoja1;

import java.util.Iterator;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {

		String matriculas[] = new String[100];

		for (int i = 0; i < matriculas.length; i++) {
			matriculas[i] = "sinmatricula";
		}

		for (int i = 0; i < matriculas.length; i++) {
			System.out.println("Matricula " + (i + 1) + ": " + matriculas[i]);
		}

	}

}

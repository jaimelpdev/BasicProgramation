package practica02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Diodo extends Componente {

	private double tensionInversa;

	public Diodo(double intensidadMaxima, double longitud, double tensionInversa) {
		super(intensidadMaxima, longitud);
		this.tensionInversa = tensionInversa;
	}

	@Override
	public void conectar() {
		System.out.println("Componente conectado");
	}

	public void leeDatos() {
		Scanner entrada = new Scanner(System.in);

		try {
			System.out.print("- Intensidad Máxima: ");
			double intensidadMaxima = entrada.nextDouble();
			System.out.print("- Longitud: ");
			double longitud = entrada.nextDouble();
			System.out.print("- Tensión inversa: ");
			tensionInversa = entrada.nextDouble();

			setIntensidadMaxima(intensidadMaxima);
			setLongitud(longitud);
			this.tensionInversa = tensionInversa;
		} catch (InputMismatchException ime) {
			System.out.println("Entrada incorrecta");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		} finally {
			System.out.println("Fin de lectura de datos");
		}

	}

}

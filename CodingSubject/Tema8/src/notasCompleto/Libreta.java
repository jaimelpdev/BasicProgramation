package notasCompleto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Libreta {

	private final String NOMBRE_ARCHIVO = "ficheros/notas.txt";
	private final int MAX_NOTAS = 1000;

	private Nota[] notas;
	private int numNotas;

	public Libreta() {
		notas = new Nota[MAX_NOTAS];
		numNotas = 0;
		leerNotas();
	}

	public void addNota(Nota nota) {

		/*
		 * TODO: Añadir después de la última nota del array la nota que se nos pasa como
		 * parámetro. Utilizar el valor de la variable numNotas. Actualizar después el
		 * valor de numNotas. En caso de que hayamos llegado al máximo de notas, no
		 * hacer nada.
		 */
		if (numNotas < MAX_NOTAS) {
			notas[numNotas] = nota;
			numNotas++;
		}

	}

	public void setNota(int posicion, Nota nota) {

		notas[posicion] = nota;

	}

	public Nota getNota(int posicion) {

		return notas[posicion];

	}

	public void delNota(int posicion) {

		/*
		 * TODO: Eliminar el elemento del array notas[] que ocupa la posición indicada.
		 * Para ello, mueve hacia arriba todos los elementos que vengan a continuación
		 * una posición, y actualiza la variable numNotas.
		 */
		for (int i = 0; i < numNotas - 1; i++) {
			notas[i] = notas[i + 1];
		}

		numNotas--;

	}

	public void leerNotas() {

		/*
		 * TODO: Leer todas las filas del archivo, y rellenar el array notas[]. Si no se
		 * encuentra el archivo, hacer que se muestre el mensaje indicado en el
		 * enunciado de la práctica. Si se produce otro tipo de excepción, mostrar un
		 * JOptionPane explicándolo.
		 * 
		 * La información de cada nota está guardada en dos líneas de texto, una para el
		 * título y otra para la descripción. Puedes usar el método split() para separar
		 * los datos de los comentarios del archivo.
		 */

		File archivo = new File(NOMBRE_ARCHIVO);
		try {
			BufferedReader br = new BufferedReader(new FileReader(archivo));
			String linea;
			String titulo = null;
			String descripcion = null;

			while ((linea = br.readLine()) != null) {
				if (linea.contains("TITULO")) {
					titulo = linea.substring(linea.indexOf('=') + 1);
				} else if (linea.contains("DESCRIPCION")) {
					descripcion = linea.substring(linea.indexOf('=') + 1);
				}

				if (titulo != null && descripcion != null) {
					if (numNotas < MAX_NOTAS) {
						notas[numNotas] = new Nota(titulo, descripcion);
						numNotas++;
						titulo = null;
						descripcion = null;
					} else {
						JOptionPane.showMessageDialog(null, "Se han alcanzado el máximo de notas permitidas.");
						break;
					}
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,
					"No se ha podido encontrar un archvo válido de tareas.\nSe creará uno nuevo automáticamente.",
					"Archivo de tareas no encontrado", JOptionPane.WARNING_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"No se ha podido encontrar un archvo válido de tareas.\nSe creará uno nuevo automáticamente.",
					"Archivo de tareas no encontrado", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void guardarNotas() {

		/*
		 * TODO: Guardar las notas del array notas[] en el archivo "notas.txt". El
		 * formato en que se guardarán debe ser el que aparece en el enunciado de la
		 * práctica. Si se produce una excepción, se mostrará el error que aparece en el
		 * enunciado.
		 */
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));

			for (int i = 0; i < numNotas; i++) {
				Nota nota = notas[i];
				bw.write("TITULO=" + nota.getTitulo() + "\nDESCRIPCION=" + nota.getDescripcion() + "\n");
			}

			bw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo de tareas.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se ha podido guardar el archivo de tareas.", "Error de E/S",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public boolean hayEspacio() {
		if (numNotas < MAX_NOTAS) {
			return true;
		}
		return false;
	}

	public int getNumNotas() {
		return numNotas;
	}

}

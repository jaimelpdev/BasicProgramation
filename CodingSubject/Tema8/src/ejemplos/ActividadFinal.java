package ejemplos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class ActividadFinal extends JFrame {

	JTextArea txtArchivo;

	public ActividadFinal() {
		super("Lector");
		setSize(700, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new GridLayout(1, 1));
		setLocationRelativeTo(null);

		JMenuBar barraDeMenu = new JMenuBar();
		JMenu menuArchivo = new JMenu("Archivo");
		JMenuItem itemAbrir = new JMenuItem("Abrir");

		menuArchivo.add(itemAbrir);
		barraDeMenu.add(menuArchivo);

		txtArchivo = new JTextArea();

		setJMenuBar(barraDeMenu);
		add(txtArchivo);

		itemAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				elegirArchivo();
			}
		});

		setVisible(true);
	}

	private void elegirArchivo() {
		JFileChooser eleccion = new JFileChooser();
		int resultado = eleccion.showOpenDialog(null);

		if (resultado == eleccion.CANCEL_OPTION) {
			return;
		}

		File nombreArchivo = eleccion.getSelectedFile();
		txtArchivo.setText("");

		try {
			BufferedReader buffer = new BufferedReader(new FileReader(nombreArchivo.toString()));
			String linea = buffer.readLine();

			while (linea != null) {
				txtArchivo.append(linea + "\n");
				linea = buffer.readLine();
			}

			buffer.close();
		} catch (IOException e) {
			System.out.println("Se ha producido un error de E/S.");
		}

	}

	public static void main(String[] args) {
		new ActividadFinal();
	}

}

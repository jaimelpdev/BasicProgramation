package ejemplos1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo04JComboBox extends JFrame {

	public Ejemplo04JComboBox() {

		super("Provincias");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		try {
			// Aplicamos el tema (look and feel) del sistema.
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			// ESta instrucción asegura que el tema se aplique correctamente a toda la
			// interfaz de usuario.
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			System.out.println("Error al cambiar el Look and Feel.");
		}

		JLabel lblProvincia = new JLabel("Selecciona tu provincia preferida:");
		JComboBox<String> cmbProvincias = new JComboBox<>();
		cmbProvincias.addItem("Islas Baleares");
		cmbProvincias.addItem("Alicante");
		cmbProvincias.addItem("Murcia");
		cmbProvincias.addItem("Valencia");
		cmbProvincias.addItem("Jaen");
		cmbProvincias.addItem("Albacete");

		cmbProvincias.setPreferredSize(new Dimension(300, 20));

		JLabel lblDescripcion = new JLabel("¿Por qué es tu provincia favorita?");

		JTextArea txtDescripcion = new JTextArea();

		// Hacemos que las líneas de texto no sobrepasen el ancho de JTextArea.
		txtDescripcion.setLineWrap(true);

		// Hacemos que al saltar de línea automáticamente no se corten las palabras.
		txtDescripcion.setWrapStyleWord(true);
		JScrollPane scrPanel = new JScrollPane(txtDescripcion);
		scrPanel.setPreferredSize(new Dimension(300, 80));

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setPreferredSize(new Dimension(150, 35));

		add(lblProvincia);
		add(cmbProvincias);
		add(lblDescripcion);
		add(scrPanel);
		add(btnGuardar);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo04JComboBox ventana = new Ejemplo04JComboBox();

	}

}



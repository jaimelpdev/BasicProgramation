package ejercicios;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejer06 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblRutaArchivo;
	private JMenuItem itemOpenFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer06 frame = new Ejer06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejer06() {
		super("Gestionar archivos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar barraDeMenu = new JMenuBar();
		setJMenuBar(barraDeMenu);

		JMenu menuFile = new JMenu("File");
		barraDeMenu.add(menuFile);

		itemOpenFile = new JMenuItem("Open File");
		itemOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirArchivo(e);
			}
		});
		menuFile.add(itemOpenFile);

		JMenuItem itemSave = new JMenuItem("Save");
		itemSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirArchivo(e);
			}
		});
		menuFile.add(itemSave);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblRutaArchivo = new JLabel("Selecciona un archivo");
		lblRutaArchivo.setBounds(12, 59, 414, 15);
		lblRutaArchivo.setPreferredSize(new Dimension(getWidth(), 30));
		contentPane.add(lblRutaArchivo);
	}

	public void abrirArchivo(ActionEvent e) {
		JFileChooser eleccion = new JFileChooser();
		int resultado;

		if (e.getSource() == itemOpenFile) {
			resultado = eleccion.showOpenDialog(null);
		} else {
			resultado = eleccion.showSaveDialog(null);
		}

		if (resultado == eleccion.CANCEL_OPTION) {
			return;
		}

		File nombreArchivo = eleccion.getSelectedFile();

		lblRutaArchivo.setText(nombreArchivo.toString());
	}

}

package eval3Prac2Enunciado;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

/**
 * Clase Principal que maneja la ventana principal de la aplicación.
 */
public class Principal extends JFrame {

	private List<Alumno> alumnos;
	JList<Alumno> lstAlumnos;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAsignatura;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Principal() {

		setTitle("Boletín App");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 441);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			JOptionPane.showMessageDialog(this, "Error al cambiar el look and feel de la aplicación.", "Boletín App",
					JOptionPane.ERROR_MESSAGE);
		}

		JLabel lblAsignatura = new JLabel("Asignatura");
		lblAsignatura.setBounds(10, 10, 100, 13);
		contentPane.add(lblAsignatura);

		txtAsignatura = new JTextField();
		txtAsignatura.setBounds(10, 33, 164, 19);
		contentPane.add(txtAsignatura);
		txtAsignatura.setColumns(10);

		JLabel lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.setBounds(10, 62, 60, 13);
		contentPane.add(lblAlumnos);

		JScrollPane panelAlumnos = new JScrollPane();
		panelAlumnos.setBounds(10, 85, 508, 278);
		contentPane.add(panelAlumnos);

		DefaultListModel<Alumno> modelo = new DefaultListModel<>();
		lstAlumnos = new JList<>(modelo);
		lstAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					abrirFichaAlumno(lstAlumnos);
				}
			}
		});
		panelAlumnos.setViewportView(lstAlumnos);

		alumnos = new ArrayList<>();

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarBoletin("ficheros/boletin.txt");
			}
		});
		btnGuardar.setBounds(142, 373, 115, 21);
		contentPane.add(btnGuardar);

		JButton btnImportarAlumnos = new JButton("Importar alumnos");
		btnImportarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				alumnos = importarAlumnos("ficheros/alumnos.txt");
				mostrarAlumnos(modelo);
			}
		});
		btnImportarAlumnos.setBounds(10, 373, 115, 21);
		contentPane.add(btnImportarAlumnos);

	}

	/**
	 * Importa alumnos desde un archivo específico.
	 * 
	 * @param rutaArchivo Ruta del archivo desde el cual se importarán los alumnos.
	 * @return Lista de alumnos importados.
	 */
	public ArrayList<Alumno> importarAlumnos(String rutaArchivo) {
		ArrayList<Alumno> alumnosImportados = new ArrayList<Alumno>();
		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String grupo = br.readLine();

			// He colocado otro readLine para que se salte la línea en blanco después del
			// nombre del grupo.
			br.readLine();

			String linea = br.readLine();
			while (linea != null) {
				alumnosImportados.add(new Alumno(linea, -1));
				linea = br.readLine();
			}

			JOptionPane.showMessageDialog(null, "Se van a importar los alumnos de " + grupo + ".", "Boletín App", JOptionPane.INFORMATION_MESSAGE);

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al abrir el archivo.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al leer el archivo.", "ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		return alumnosImportados;
	}

	/**
	 * Muestra los alumnos en el modelo de lista.
	 * 
	 * @param modelo Modelo de lista en el cual se mostrarán los alumnos.
	 */
	public void mostrarAlumnos(DefaultListModel<Alumno> modelo) {
		modelo.clear();

		for (Alumno alumno : alumnos) {
			modelo.addElement(alumno);
		}
	}

	/**
	 * Abre la ventana de ficha de un alumno.
	 * 
	 * @param lstAlumnos Lista de alumnos de la cual se seleccionará el alumno.
	 */
	public void abrirFichaAlumno(JList<Alumno> lstAlumnos) {
		Alumno alumno = lstAlumnos.getSelectedValue();

		VentanaNota ventanaNota = new VentanaNota(alumno, new Callback() {

			@Override
			public void actualizarVentana(int nota) {
				alumno.setNota(nota);
				mostrarAlumnos((DefaultListModel<Alumno>) lstAlumnos.getModel());
			}
		});
		ventanaNota.setLocationRelativeTo(this);
		ventanaNota.setCallback(new Callback() {

			@Override
			public void actualizarVentana(int nota) {
				alumno.setNota(nota);
				mostrarAlumnos((DefaultListModel<Alumno>) lstAlumnos.getModel());
			}
		});
	}

	/**
	 * Guarda el boletín en un archivo específico.
	 * 
	 * @param rutaArchivo Ruta del archivo donde se guardará el boletín.
	 */
	public void guardarBoletin(String rutaArchivo) {
		if (txtAsignatura.getText().isEmpty() || alumnos.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Asignatura o alumnos no pueden estar vacíos.", "Error",
					JOptionPane.ERROR_MESSAGE);
			return;
		}

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
			bw.write("asignatura=" + txtAsignatura.getText());
			bw.newLine();
			bw.write("nombre=" + LocalDate.now().toString());
			bw.newLine();
			bw.newLine();

			for (Alumno alumno : alumnos) {
				bw.write("nombre=" + alumno.getNombre());
				bw.newLine();
				bw.write("nota=" + alumno.getNota());
				bw.newLine();
			}
			JOptionPane.showMessageDialog(null, "Se han guardado las notas de " + txtAsignatura.getText() + ".",
					"Boletín App", JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error al guardar el archivo: ", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}

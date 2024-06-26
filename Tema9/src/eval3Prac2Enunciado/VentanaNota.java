package eval3Prac2Enunciado;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Clase VentanaNota que maneja la ventana secundaria para ingresar o actualizar la nota de un alumno.
 */
public class VentanaNota extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAlumno;
	private JLabel lblNota;
	private JTextField txtNota;
	private JButton btnAceptar;
	private Callback callback;
	private Alumno alumno;

	/**
	 * Constructor de la clase VentanaNota.
	 * 
	 * @param alumno   El alumno del cual se actualizará la nota.
	 * @param callback El callback para actualizar la ventana principal.
	 */
	public VentanaNota(Alumno alumno, Callback callback) {
		this.alumno = alumno;
		this.callback = callback;

		setTitle("Evaluación");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}

		setBounds(100, 100, 272, 186);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlumno = new JLabel("Alumno");
		lblAlumno.setBounds(10, 10, 68, 13);
		contentPane.add(lblAlumno);

		txtAlumno = new JTextField();
		txtAlumno.setEditable(false);
		txtAlumno.setBounds(10, 33, 238, 19);
		contentPane.add(txtAlumno);
		txtAlumno.setColumns(10);

		lblNota = new JLabel("Nota");
		lblNota.setBounds(10, 62, 68, 13);
		contentPane.add(lblNota);

		txtNota = new JTextField();
		txtNota.setColumns(10);
		txtNota.setBounds(10, 85, 238, 19);
		contentPane.add(txtNota);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				devolverNota();
			}
		});
		btnAceptar.setBounds(10, 114, 85, 21);
		contentPane.add(btnAceptar);

		setAlumno(alumno);

		// Configuraciones propias.
		this.getRootPane().setDefaultButton(btnAceptar);
		setVisible(true);
		txtNota.requestFocus();

	}

	public void setAlumno(Alumno alumno) {
		txtAlumno.setText(alumno.getNombre().toUpperCase());
	}

	public void setCallback(Callback callback) {
		this.callback = callback;
	}

	/**
	 * Método qué devuelve la nota ingresada, si es válida.
	 */	
	private void devolverNota() {
		try {
			int nota = Integer.parseInt(txtNota.getText());
			if (nota < 0 || nota > 10) {
				JOptionPane.showMessageDialog(this, "Nota invalida. Debe insertar una nota entre 0 y 10.", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
			callback.actualizarVentana(nota);
			// Cierro la ventana después de actualizar la nota.
			dispose();

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Nota invalida. Debe insertar una nota entre 0 y 10.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}

}

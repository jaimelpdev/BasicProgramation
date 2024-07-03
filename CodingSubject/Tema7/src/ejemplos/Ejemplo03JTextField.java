package ejemplos;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ejemplo03JTextField extends JFrame {

	public Ejemplo03JTextField() {

		super("DAtos personales");
		setSize(260, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblNombre = new JLabel("Nombre:");
		JTextField txtNombre = new JTextField(20);

		JLabel lblEdad = new JLabel("Edad:");
		JTextField txtEdad = new JTextField(20);

		JLabel lblSatisfaccion = new JLabel("¿Estás satisfecho con el programa?");
		
		JRadioButton rdbSatisfecho = new JRadioButton("Satisfecho", true);
		JRadioButton rdbNoSatisfecho = new JRadioButton("No satisfecho");
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rdbSatisfecho);
		grupo.add(rdbNoSatisfecho);
		
		JCheckBox chkAceptacion = new JCheckBox("He leído y acepto los términos.", true);
		JCheckBox chkPublicidad = new JCheckBox("Acepto recibir publicidad.");

		JButton btnGuardar = new JButton("Guardar");

		add(lblNombre);
		add(txtNombre);
		add(lblEdad);
		add(txtEdad);
		add(lblSatisfaccion);
		add(rdbSatisfecho);
		add(rdbNoSatisfecho);
		add(chkAceptacion);
		add(chkPublicidad);

		add(btnGuardar);

		setVisible(true);

	}

	public static void main(String[] args) {

		Ejemplo03JTextField ventana = new Ejemplo03JTextField();

	}

}

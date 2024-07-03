package hoja4;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer02 extends JFrame implements ItemListener {

	private JComboBox<String> cmbCurso;
	JLabel lblPreferencia;
	
	public Ejer02() {
		super("Matrícula");
		setSize(250,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JTextField txtApellidos = new JTextField(20);
		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(20);
		
		JLabel lblcurso = new JLabel("Curso");
		cmbCurso = new JComboBox<>();
		
		cmbCurso.addItem("Selecciona un curso");
		cmbCurso.addItem("1ºESO");
		cmbCurso.addItem("2ºESO");
		cmbCurso.addItem("3ºESO");
		cmbCurso.addItem("4ºESO");
		
		cmbCurso.addItemListener(this);
		
		lblPreferencia = new JLabel("Curso:");
		
		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblcurso);
		add(cmbCurso);
		add(lblPreferencia);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejer02();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String seleccionado = (String) cmbCurso.getSelectedItem();
		
		if(!seleccionado.equals("Selecciona un curso")) {
			lblPreferencia.setText("Curso: " + seleccionado);
		} else {
			lblPreferencia.setText("Curso:");
		}
		
	}
	
}

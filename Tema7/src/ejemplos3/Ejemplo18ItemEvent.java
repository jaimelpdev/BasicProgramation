package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo18ItemEvent extends JFrame {

	private JComboBox<String> cmbAsignaturas;
	private JLabel lblPreferida;

	public Ejemplo18ItemEvent() {
		super("Asignaturas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel lblAsignaturas = new JLabel("Elige tu asignatura favorita:");
		cmbAsignaturas = new JComboBox<>();
		cmbAsignaturas.addItem("Selecciona una");
		cmbAsignaturas.addItem("Programación");
		cmbAsignaturas.addItem("Bases de datos");
		cmbAsignaturas.addItem("Entornos de desarrollo");
		cmbAsignaturas.addItem("Formación y orientacion laboral");
		cmbAsignaturas.addItem("Sistemas informáticos");
		cmbAsignaturas.addItem("Lenguajes de marcas");

		cmbAsignaturas.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String seleccionado = (String) cmbAsignaturas.getSelectedItem();
				
				if(!seleccionado.equals("Selecciona una")) {
				lblPreferida.setText("Has seleccionado " + seleccionado);
				} else {
					lblPreferida.setText("");
				}

//				int seleccionado = cmbAsignaturas.getSelectedIndex();
		//
//				if (seleccionado == 0) {
//					lblPreferida.setText("");
//				} else {
//					String cadena = (String) cmbAsignaturas.getSelectedItem();
//					lblPreferida.setText("Has seleccionado " + cadena);
//				}

			}
		});

		lblPreferida = new JLabel();

		add(lblAsignaturas);
		add(cmbAsignaturas);
		add(lblPreferida);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo18ItemEvent();
	}

}

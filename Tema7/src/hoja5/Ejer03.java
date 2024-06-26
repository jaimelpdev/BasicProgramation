package hoja5;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejer03 extends JFrame implements ActionListener {

	private JTextField txtOperandoA, txtOperandoB, txtResultado;
	private JComboBox<String> cmbOperaciones;

	public Ejer03() {
		super("Operaciones");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);
		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblOperandoA = new JLabel("Operando A");
		txtOperandoA = new JTextField();
		txtOperandoA.setPreferredSize(new Dimension(120, 20));

		JLabel lblOperandoB = new JLabel("Operando B");
		txtOperandoB = new JTextField();
		txtOperandoB.setPreferredSize(new Dimension(120, 20));

		JLabel lblOperacion = new JLabel("Operación");
		cmbOperaciones = new JComboBox<>();
		cmbOperaciones.addItem("Suma");
		cmbOperaciones.addItem("Resta");
		cmbOperaciones.addItem("Multiplicación");
		cmbOperaciones.addItem("División");
		cmbOperaciones.addActionListener(this);;

		JLabel lblResultado = new JLabel("Resultado");
		txtResultado = new JTextField();
		txtResultado.setPreferredSize(new Dimension(120, 20));

		add(lblOperandoA);
		add(txtOperandoA);
		add(lblOperandoB);
		add(txtOperandoB);
		add(lblOperacion);
		add(cmbOperaciones);
		add(lblResultado);
		add(txtResultado);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int num1 = Integer.parseInt(txtOperandoA.getText());
			int num2 = Integer.parseInt(txtOperandoB.getText());
			int resultado = 0;

			if (cmbOperaciones.getSelectedItem().equals("Suma")) {
				resultado = num1 + num2;
			} else if (cmbOperaciones.getSelectedItem().equals("Resta")) {
				resultado = num1 - num2;
			} else if (cmbOperaciones.getSelectedItem().equals("Multiplicación")) {
				resultado = num1 * num2;
			} else if (cmbOperaciones.getSelectedItem().equals("División")) {
				resultado = num1 / num2;
			}
			
			txtResultado.setText(String.valueOf(resultado));

		} catch (Exception e2) {
			System.out.println("ERROR");
		}		
	}

}

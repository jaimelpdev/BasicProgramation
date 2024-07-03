package hoja3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejer03 extends JFrame {

	public Ejer03() {
		super("Parámetros críticos");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setValue(20);
		prgCombustible.setStringPainted(true);
		prgCombustible.setPreferredSize(new Dimension(170, 25));
		prgCombustible.setForeground(Color.RED);
		JLabel lblCombustible = new JLabel("Combustible");

		add(prgCombustible);
		add(lblCombustible);

		JProgressBar prgMotor1 = new JProgressBar(0, 100);
		prgMotor1.setValue(75);
		prgMotor1.setStringPainted(true);
		prgMotor1.setPreferredSize(new Dimension(170, 25));
		prgMotor1.setForeground(new Color(8, 158, 43));
		JLabel lblMotor1 = new JLabel("Presión motor 1");

		add(prgMotor1);
		add(lblMotor1);

		JProgressBar prgMotor2 = new JProgressBar(0, 100);
		prgMotor2.setValue(75);
		prgMotor2.setStringPainted(true);
		prgMotor2.setPreferredSize(new Dimension(170, 25));
		prgMotor2.setForeground(new Color(8, 158, 43));
		JLabel lblMotor2 = new JLabel("Presión motor 2");

		add(prgMotor2);
		add(lblMotor2);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer03();
	}

}

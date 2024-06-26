package ejemplos1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejemplo11JProgressBar extends JFrame {

	public Ejemplo11JProgressBar() {
		super("Energía");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel lblNivelEnergia = new JLabel("Nivel de enegría");

		JProgressBar prgNivelEnergia = new JProgressBar(0, 100);
		prgNivelEnergia.setValue(80);
		prgNivelEnergia.setStringPainted(true);
		prgNivelEnergia.setPreferredSize(new Dimension(300, 30));
		prgNivelEnergia.setForeground(Color.RED);
		prgNivelEnergia.setBackground(Color.WHITE);

		add(lblNivelEnergia);
		add(prgNivelEnergia);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo11JProgressBar();
	}

}

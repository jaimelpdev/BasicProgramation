package hoja3;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import ejemplos1.Ejemplo10JList;

public class Ejer02 extends JFrame {

	public Ejer02() {
		super("Selección de modelo");
		setSize(300, 220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		String[] modelos = { "Nissan", "Peugeot", "Volkswagen", "Mazda", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar",
				"Lamborghini" };
		JList<String> lstModelo = new JList<>(modelos);

		JScrollPane scrModelo = new JScrollPane(lstModelo);
		scrModelo.setPreferredSize(new Dimension(120, 150));

		JLabel lblModelo = new JLabel("Modelo?");

		add(scrModelo);
		add(lblModelo);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer02();
	}

}

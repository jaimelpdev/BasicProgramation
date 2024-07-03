package borde;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BordesLinea extends JFrame {
	public static void main(String[] args) {
		new BordesLinea();
	}

	public BordesLinea() {
		super("Bordes");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		// PANEL SUPERIOR
		JPanel panelSuperior = new JPanel();
		panelSuperior.setPreferredSize(new Dimension(370, 120));

		panelSuperior.setBorder(BorderFactory.createLineBorder(Color.RED));
		// PANEL INFERIOR
		JPanel panelInferior = new JPanel();
		panelInferior.setPreferredSize(new Dimension(370, 120));

		panelInferior.setBorder(BorderFactory.createLineBorder(Color.GREEN));
		// VENTANA COMPLETA
		add(panelSuperior);
		add(panelInferior);
		setVisible(true);
	}
}
package hoja4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class Ejer01Repaso extends JFrame implements ActionListener {

	private JButton btn1, btn2, btn3, btn4;
	private JLabel lblImagen;

	public Ejer01Repaso() {
		super("Fotogramas");
		setSize(1100, 730);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("ERROR");
		}
		
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JPanel panelBotones = new JPanel(new FlowLayout());
		btn1 = new JButton("Black rain");
		btn1.addActionListener(this);
		btn2 = new JButton("El caso Winslow");
		btn2.addActionListener(this);
		btn3 = new JButton("Asalto al distrito 13");
		btn3.addActionListener(this);
		btn4 = new JButton("Blade runner");
		btn4.addActionListener(this);

		panelBotones.add(btn1);
		panelBotones.add(btn2);
		panelBotones.add(btn3);
		panelBotones.add(btn4);

		JPanel panelCentral = new JPanel(new FlowLayout());
		lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon("pelis/imagen1.jpg"));
		panelCentral.add(lblImagen);

		add(panelBotones, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer01Repaso();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btnImagen = (JButton) e.getSource();
		
		if (btnImagen == btn1) {
			lblImagen.setIcon(new ImageIcon("pelis/imagen1.jpg"));
		} else if (btnImagen == btn2) {
			lblImagen.setIcon(new ImageIcon("pelis/imagen2.jpeg"));
		} else if (btnImagen == btn3) {
			lblImagen.setIcon(new ImageIcon("pelis/imagen3.jpg"));
		} else if (btnImagen == btn4) {
			lblImagen.setIcon(new ImageIcon("pelis/imagen4.jpg"));
		}
	}

}

package hoja4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Paleta");
		setSize(250, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JLabel lblRojo = new JLabel("Rojo");
		JSlider sldRojo = new JSlider(0, 255, 250);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		sldRojo.setPreferredSize(new Dimension(220, 50));

		JLabel lblVerde = new JLabel("Verde");
		JSlider sldVerde = new JSlider(0, 255, 200);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		sldVerde.setPreferredSize(new Dimension(220, 50));

		JLabel lblAzul = new JLabel("Azul");
		JSlider sldAzul = new JSlider(0, 255, 50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);
		sldAzul.setPreferredSize(new Dimension(220, 50));

		JButton btnColor = new JButton();
		btnColor.setBackground(Color.ORANGE);
		btnColor.setPreferredSize(new Dimension(110, 30));

		JTextField txtHexadecimal = new JTextField("#FFC833");
		txtHexadecimal.setPreferredSize(new Dimension(80, 20));

		btnColor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int red, green, blue;

				red = sldRojo.getValue();
				green = sldVerde.getValue();
				blue = sldAzul.getValue();

				btnColor.setBackground(new Color(red, green, blue));
				txtHexadecimal.setText(hexadecimal(red, green, blue));
			}
		});

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		add(txtHexadecimal);

		setVisible(true);
	}

	private String hexadecimal(int red, int green, int blue) {
		return String.format("#%02X%02X%02X", red, green, blue);
	}
	
	public static void main(String[] args) {
		new Ejer04();
	}

}

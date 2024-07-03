package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Ejer02 extends JFrame {

	public Ejer02() {
		
		super("Termostato");
		setSize(300, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
				
		JSlider sldTemperatura = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		
		sldTemperatura.setMinorTickSpacing(1);
		sldTemperatura.setMajorTickSpacing(5);
		sldTemperatura.setPaintLabels(true);
		sldTemperatura.setPaintTicks(true);
		
		sldTemperatura.setPreferredSize(new Dimension(50, 200));
		
		JLabel lblTemperatura = new JLabel("Temperatura (ºC)");
		
		add(sldTemperatura);
		add(lblTemperatura);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Ejer02 ventana = new Ejer02();
	}
	
}

package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Ejer01 extends JFrame {

	public Ejer01() {
		
		super("Velocidad de crucero");
		setSize(280, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		
		JSlider sldvelocidad = new JSlider(JSlider.HORIZONTAL, 10, 120, 90);
		
		sldvelocidad.setMinorTickSpacing(5);
		sldvelocidad.setMajorTickSpacing(20);
		sldvelocidad.setPaintLabels(true);
		sldvelocidad.setPaintTicks(true);
		
		sldvelocidad.setPreferredSize(new Dimension(270, 50));
		
		add(sldvelocidad);
		
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		Ejer01 ventana = new Ejer01();
	}
	
}

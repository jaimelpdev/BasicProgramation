package ejemplos;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo08ImageIcon extends JFrame {

	public Ejemplo08ImageIcon() {
	
	super("Botones con imagenes");
	
	setSize(400, 300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	
	setLayout(new FlowLayout());
	
	ImageIcon imgReproductor = new ImageIcon("iconos/39.png");
	JButton btnReproductor = new JButton("Reproducir", imgReproductor);
	
	ImageIcon imgCheck = new ImageIcon("iconos/94.png");
	JButton btnCheck = new JButton("Hecho", imgCheck);
	
	add(btnReproductor);
	add(btnCheck);
	
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		Ejemplo08ImageIcon ventana = new Ejemplo08ImageIcon();
	}
	
}

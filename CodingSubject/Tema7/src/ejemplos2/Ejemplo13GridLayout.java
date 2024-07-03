package ejemplos2;

import java.awt.GridLayout;
import java.util.stream.Stream;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo13GridLayout extends JFrame {

	public Ejemplo13GridLayout() {
		super("Stream Deck");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(2,4,10,10));

		JButton btnStream = new JButton("Stream");
		JButton btnCamara = new JButton("Cámara");
		JButton btnSubirVolumen = new JButton("SubirVolumen");
		JButton btnBajarVolumen = new JButton("BajarVolumen");
		JButton btnPublicidad = new JButton("Publicidad");
		JButton btnSilenciar = new JButton("Silenciar micro");
		JButton btnEscena1 = new JButton("Escena 1");
		JButton btnEscena2 = new JButton("Escena 2");

		add(btnStream);
		add(btnCamara);
		add(btnSubirVolumen);
		add(btnBajarVolumen);
		add(btnPublicidad);
		add(btnSilenciar);
		add(btnEscena1);
		add(btnEscena2);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo13GridLayout();
	}

}

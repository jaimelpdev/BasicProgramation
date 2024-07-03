package hoja5;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejer02 extends JFrame implements KeyListener {

	private JLabel lblColor;

	public Ejer02() {
		super("Letras - Colores");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		lblColor = new JLabel("COLOR");

		add(lblColor);

		addKeyListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer02();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		int codigo = e.getKeyChar();

		if (codigo == 'r') {
			lblColor.setText("ROJO");
			lblColor.setForeground(Color.RED);
		} else if (codigo == 'a') {
			lblColor.setText("AZUL");
			lblColor.setForeground(Color.BLUE);
		} else if (codigo == 'v') {
			lblColor.setText("VERDE");
			lblColor.setForeground(Color.GREEN);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// NO SE USA
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// NO SE USA
	}

}

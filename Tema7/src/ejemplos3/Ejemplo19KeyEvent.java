package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo19KeyEvent extends JFrame {

	private int x = 30, y = 30;

	public Ejemplo19KeyEvent() {
		super("Eventos de teclado");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);

		JLabel lblEmoji = new JLabel(new ImageIcon("iconos/6.png"));
		lblEmoji.setBounds(x, y, 24, 24);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// No lo usamos
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// No lo usamos
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int codigo = e.getKeyCode();
				int velocidad = 5;

				if(x != 200 || x != -200) {
				if (codigo == KeyEvent.VK_UP) {
					y = y - velocidad;
					lblEmoji.setBounds(x, y, 24, 24);
				} else if (codigo == KeyEvent.VK_DOWN) {
					y = y + velocidad;
					lblEmoji.setBounds(x, y, 24, 24);
				}
				} if (codigo == KeyEvent.VK_LEFT) {
					x = x - velocidad;
					lblEmoji.setBounds(x, y, 24, 24);
				} else if (codigo == KeyEvent.VK_RIGHT) {
					x = x + velocidad;
					lblEmoji.setBounds(x, y, 24, 24);
				}
			}
		});

		add(lblEmoji);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo19KeyEvent();
	}

}

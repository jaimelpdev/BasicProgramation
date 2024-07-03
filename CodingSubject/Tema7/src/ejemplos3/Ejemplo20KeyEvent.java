package ejemplos3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo20KeyEvent extends JFrame {

	private int x = 200, y = 100;

	public Ejemplo20KeyEvent() {
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

				if (codigo == KeyEvent.VK_UP) {
					if (y - velocidad >= 0) {
						y -= velocidad;
					}
				} else if (codigo == KeyEvent.VK_DOWN) {
					if (y + velocidad <= 260 - lblEmoji.getHeight()) {
						y += velocidad;
					}
				} else if (codigo == KeyEvent.VK_LEFT) {
					x -= velocidad;
					if (x + velocidad < -24) {
						x = 400 - lblEmoji.getWidth();
					}
				} else if (codigo == KeyEvent.VK_RIGHT) {
					x += velocidad;
					if (x + velocidad > 390) {
						x = -40 + lblEmoji.getWidth();
					}
				}
				lblEmoji.setBounds(x, y, 24, 24);
			}
		});

		add(lblEmoji);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo20KeyEvent();
	}

}

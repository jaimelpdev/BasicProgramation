package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo21MouseListener extends JFrame {

	public Ejemplo21MouseListener() {
		super("Mouse Listener");
		setSize(380, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLocationRelativeTo(null);

		JLabel lblCoordenadas = new JLabel("¡Haz clic en esta ventana!");
		JLabel lblBoton = new JLabel();

		addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
//				getContentPane().setBackground(Color.GREEN);
			}

			@Override
			public void mousePressed(MouseEvent e) {
//				getContentPane().setBackground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
//				getContentPane().setBackground(Color.YELLOW);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
//				getContentPane().setBackground(Color.DARK_GRAY);
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				lblCoordenadas.setText("Coordenadas: (" + x + ", " + y + ")");

				int boton = e.getButton();
				if (boton == MouseEvent.BUTTON1) {
					lblBoton.setText("Has pulsado el botón izquierdo");
				} else if (boton == MouseEvent.BUTTON3) {
					lblBoton.setText("Has pulsado el botón derecho");
				} else if (boton == MouseEvent.BUTTON2) {
					lblBoton.setText("Has pulsado la rueda del ratón");
				}
			}
		});

		add(lblCoordenadas);
		add(lblBoton);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo21MouseListener();
	}

}

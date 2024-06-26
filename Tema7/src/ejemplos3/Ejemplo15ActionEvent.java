package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo15ActionEvent extends JFrame implements ActionListener {

	private JLabel lblBoton;
	
	public Ejemplo15ActionEvent() {
		super("Eventos");
		setSize(320, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JButton btnPulsame = new JButton("Púlsame!");

		lblBoton = new JLabel("No has pulsado el botón, todavía");

		btnPulsame.addActionListener(this);

		add(btnPulsame);
		add(lblBoton);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo15ActionEvent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		lblBoton.setText("Has pulsado el botón!!!");
	}

}

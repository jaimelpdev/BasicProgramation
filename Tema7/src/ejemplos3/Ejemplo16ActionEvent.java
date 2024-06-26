package ejemplos3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo16ActionEvent extends JFrame {

	JButton btnAzul, btnRojo;
	JLabel lblmensaje, lblContador;
	int i = 0;

	public Ejemplo16ActionEvent() {
		super("Elegir botón");
		setSize(300, 120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		btnAzul = new JButton("Azúl");
		btnAzul.setBackground(new Color(150, 150, 255));
		btnAzul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblmensaje.setText("Has pulsado el botón Azúl.");
				actualizarPulsaciones();
			}
		});

		btnRojo = new JButton("Rojo");
		btnRojo.setBackground(Color.RED);
		btnRojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblmensaje.setText("Has pulsado el botón Rojo.");
				actualizarPulsaciones();
			}
		});

		lblmensaje = new JLabel("Pulsa alguno de los botones.");
		
		lblContador = new JLabel();
	
		add(btnAzul);
		add(btnRojo);
		add(lblmensaje);

		add(lblContador);

		setVisible(true);
	}

	private void actualizarPulsaciones() {
		i++;
		lblContador.setText("Pulsaciones: " + i);
	}
	
	public static void main(String[] args) {
		new Ejemplo16ActionEvent();
	}

}

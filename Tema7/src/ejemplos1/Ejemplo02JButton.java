package ejemplos1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo02JButton extends JFrame {

	public Ejemplo02JButton() {

		super("Concurso");

		setSize(290, 300);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLocationRelativeTo(null);

		setLayout(new FlowLayout(FlowLayout.CENTER, 25, 15));

		JLabel lbl1 = new JLabel("¿Cómo se escribe 11 en hexadecimal?");

		JButton btn1 = new JButton("A");
		JButton btn2 = new JButton("B");
		JButton btn3 = new JButton("C");
		JButton btn4 = new JButton("D");
		JButton btn5 = new JButton("E");

		JLabel lbl2 = new JLabel("Pulsa la respuesta correcta.");

		add(lbl1);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(lbl2);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo02JButton ejemplo = new Ejemplo02JButton();
	}

}

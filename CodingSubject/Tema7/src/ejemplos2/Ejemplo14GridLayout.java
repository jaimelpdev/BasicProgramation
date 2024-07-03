package ejemplos2;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo14GridLayout extends JFrame {

	public Ejemplo14GridLayout() {
		super("Biblioteca");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new GridLayout(1, 2, 0, 0));

		JPanel panelIzquierdo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(15);

		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(15);

		JButton btnAlta = new JButton("Alta");

		panelIzquierdo.add(lblTitulo);
		panelIzquierdo.add(txtTitulo);
		panelIzquierdo.add(lblAutor);
		panelIzquierdo.add(txtAutor);

		add(panelIzquierdo);
		add(btnAlta);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo14GridLayout();
	}

}

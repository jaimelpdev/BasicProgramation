package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ejer03 extends JFrame {

	public Ejer03() {
		super("Comentarios");
		setSize(300, 210);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JLabel lblComentario = new JLabel("Deja un comentario");
		JTextArea txtComentario = new JTextArea();
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		
		scrComentario.setPreferredSize(new Dimension(250, 100));
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblComentario);
		add(scrComentario);
		add(btnEnviar);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ejer03();
	}

}

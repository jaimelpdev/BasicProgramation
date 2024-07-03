package ejemplos1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.concurrent.Flow;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo09JToolBar extends JFrame {

	public Ejemplo09JToolBar() {
		super("Barra de herramientas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);

		ImageIcon imgAbrir = new ImageIcon("iconos/52.png");
		JButton btnAbrir = new JButton(imgAbrir);

		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);

		tlbHerramientas.add(btnNuevo);
		tlbHerramientas.add(btnAbrir);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnGuardar);

		// Añadimos un panel a la parte central de la ventana, dentro del cual aparecerá
		// un JLabel y un JScrollPane.
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new FlowLayout());
//		panelCentral.setBackground(Color.RED);
		
		JLabel lblComentarios = new JLabel("Comentarios");
		JTextArea txtComentarios = new JTextArea();
		JScrollPane scrComentarios = new JScrollPane();

		scrComentarios.setPreferredSize(new Dimension(450, 200));
		scrComentarios.add(txtComentarios);

		panelCentral.add(lblComentarios);
		panelCentral.add(scrComentarios);
		
		add(tlbHerramientas, BorderLayout.NORTH);
		add(panelCentral, BorderLayout.CENTER);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo09JToolBar();
	}

}

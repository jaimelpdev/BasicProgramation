package hoja3;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Barra de herramientas");
		setSize(470, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new BorderLayout());

		JToolBar tlbHerramientas = new JToolBar();

		ImageIcon imgNuevo = new ImageIcon("iconos/1.png");
		JButton btnNuevo = new JButton(imgNuevo);

		ImageIcon imgEstadistica = new ImageIcon("iconos/11.png");
		JButton btnEstadistica = new JButton(imgEstadistica);

		ImageIcon imgGuardar = new ImageIcon("iconos/22.png");
		JButton btnGuardar = new JButton(imgGuardar);

		ImageIcon imgAyuda = new ImageIcon("iconos/3.png");
		JButton btnAyuda = new JButton(imgAyuda);

		ImageIcon imgCalendario = new ImageIcon("iconos/44.png");
		JButton btnCalendario = new JButton(imgCalendario);

		ImageIcon imgCaptura = new ImageIcon("iconos/66.png");
		JButton btnCaptura = new JButton(imgCaptura);

		ImageIcon imgTv = new ImageIcon("iconos/67.png");
		JButton btnTv = new JButton(imgTv);

		ImageIcon imgConfig = new ImageIcon("iconos/73.png");
		JButton btnConfig = new JButton(imgConfig);

		tlbHerramientas.add(btnNuevo);
		tlbHerramientas.add(btnEstadistica);
		tlbHerramientas.add(btnGuardar);
		tlbHerramientas.add(btnAyuda);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnCalendario);
		tlbHerramientas.add(btnCaptura);
		tlbHerramientas.add(btnTv);
		tlbHerramientas.addSeparator();
		tlbHerramientas.add(btnConfig);

		add(tlbHerramientas, BorderLayout.NORTH);

		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejer01();
	}

}

package ejemplos1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo10JList extends JFrame {

	public Ejemplo10JList() {
		super("Países");
		setSize(200, 250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		JLabel lblPais = new JLabel("Elige tu país preferido");
		
		String[] paises = {"España", "Reino Unido", "Italia", "Alemania", "Bélgica", "Holanda", "Luxemburgo"};
		JList<String> lstPais = new JList<>(paises);
		
		JScrollPane scrPais = new JScrollPane(lstPais);
		scrPais.setPreferredSize(new Dimension(150, 80));
	
		add(lblPais);
		add(scrPais);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo10JList();
	}

}

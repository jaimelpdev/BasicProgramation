package hoja2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejer04 extends JFrame {

	public Ejer04() {
		super("Suscripcion");
		setSize(300, 320);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JLabel lblNombre = new JLabel("Nombre");
		JTextField txtNombre = new JTextField(25);

		JLabel lblEmail = new JLabel("Email");
		JTextField txtEmail = new JTextField(25);

		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		JTextArea txtMotivo = new JTextArea();

		JScrollPane scrMotivo = new JScrollPane(txtMotivo);
		scrMotivo.setPreferredSize(new Dimension(290, 100));

		JCheckBox chkRecibirCorreo = new JCheckBox("Recibir informacion porCorreo", true);

		JButton btnEnviar = new JButton("Enviar");

		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(scrMotivo);
		add(chkRecibirCorreo);
		add(btnEnviar);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer04();
	}

}

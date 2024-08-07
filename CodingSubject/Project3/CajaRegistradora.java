package Project3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CajaRegistradora extends JFrame {
	private String stock[][] = { { "Croissant", "1.80" }, { "Café con leche", "1.20" }, { "Té verde", "1.80" } };
	private Cuenta cuenta;
	private JComboBox<String> cmbArticulos;
	private JTextField txtUnidades;
	private JTextArea txtCuenta;

	public CajaRegistradora() {
		super("Caja registradora");
		setSize(800, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// LookAndFeel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al aplicar el Look and Feel a la ventana.",
					"Caja registradora", JOptionPane.ERROR_MESSAGE);
		}

		setLayout(new BorderLayout());
		setLocationRelativeTo(null);

		// Panel izquierdo
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelIzquierdo.setPreferredSize(new Dimension(300, getHeight()));

		// Panel superior
		JPanel panelSuperior = new JPanel();
		panelSuperior.setLayout(new FlowLayout(FlowLayout.LEADING));

		JLabel lblArticulos = new JLabel("Producto");
		cmbArticulos = new JComboBox<>();
		cmbArticulos.addItem("Croissant");
		cmbArticulos.addItem("Café con leche");
		cmbArticulos.addItem("Té verde");
		cmbArticulos.setPreferredSize(new Dimension(265, 20));

		panelSuperior.add(lblArticulos);
		panelSuperior.add(cmbArticulos);
		panelSuperior.setPreferredSize(new Dimension(275, 50));
		panelIzquierdo.add(panelSuperior, BorderLayout.NORTH);

		JPanel panelUnidades = new JPanel();
		panelUnidades.setLayout(new FlowLayout(FlowLayout.LEADING));
		panelUnidades.setPreferredSize(new Dimension(110, 70));
		JLabel lblUnidades = new JLabel("Unidades");
		txtUnidades = new JTextField();
		txtUnidades.setPreferredSize(new Dimension(100, 25));

		panelUnidades.add(lblUnidades);
		panelUnidades.add(txtUnidades);

		panelIzquierdo.add(panelUnidades);
		panelIzquierdo.add(panelUnidades, BorderLayout.WEST);

		// Panel de botones
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btnAnyadir = new JButton("Añadir");
		btnAnyadir.setPreferredSize(new Dimension(130, 25));
		btnAnyadir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				anyadirProducto();
			}
		});

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setPreferredSize(new Dimension(130, 25));
		btnCalcular.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				calcularCuenta();
			}
		});

		JButton btnNuevaCuenta = new JButton("Nueva cuenta");
		btnNuevaCuenta.setPreferredSize(new Dimension(130, 25));
		btnNuevaCuenta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevaCuenta();
			}
		});

		panelBotones.add(btnAnyadir);
		panelBotones.add(btnCalcular);
		panelBotones.add(btnNuevaCuenta);
		panelBotones.setPreferredSize(new Dimension(285, 80));
		panelIzquierdo.add(panelBotones, BorderLayout.AFTER_LAST_LINE);

		add(panelIzquierdo);

		// Panel derecho
		JPanel panelDerecho = new JPanel();
		panelDerecho.setLayout(new BorderLayout());
		panelDerecho.setPreferredSize(new Dimension(490, getHeight()));

		JLabel lblCuenta = new JLabel("Cuenta");
		txtCuenta = new JTextArea(20, 30);

		panelDerecho.add(lblCuenta, BorderLayout.NORTH);
		panelDerecho.add(txtCuenta, BorderLayout.CENTER);
		add(panelDerecho, BorderLayout.EAST);

		setVisible(true);
	}

	public static void main(String[] args) {
		new CajaRegistradora();
	}

	// Método para añadir un producto a la cuenta.
	public void anyadirProducto() {
		if (cuenta == null) {
			cuenta = new Cuenta(10);
		}

		String producto = (String) cmbArticulos.getSelectedItem();
		String unidades = txtUnidades.getText();
		String precio = "0.00";

		for (int i = 0; i < stock.length; i++) {
			if (producto.equals(stock[i][0])) {
				precio = stock[i][1];
				break;
			}
		}

		cuenta.addArticulo(producto, precio, unidades);
		// Concatenamos el nuevo listado de artículos al texto existente.
		txtUnidades.setText("1");
		txtCuenta.setText(cuenta.listadoArticulos());
	}

	public void calcularCuenta() {
		String listaArticulos = cuenta.listadoArticulos();
		String totales = cuenta.totales();

		// Modifico el JTextArea con la lista de artículos y los totales
		txtCuenta.setText(txtCuenta.getText() + "\n\n" + totales);
	}

	public void nuevaCuenta() {
		int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que quiere descartar la cuenta actual?",
				"Caja registradora", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (confirmacion == JOptionPane.YES_OPTION) {
			cuenta.resetear();
			txtCuenta.setText("");
		}
	}

}
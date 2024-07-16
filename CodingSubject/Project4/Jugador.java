package Project4;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

public class Jugador extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JList<String> lista;
	private DefaultListModel<String> modeloLista;

	private final String NOMBRE_ARCHIVO = "ficheros/jugadores.txt";
	private int puntuacion;
	private String nombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jugador frame = new Jugador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Jugador() {
		super("Puntuaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 405);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 18, 275, 290);
		contentPane.add(scrollPane);

		modeloLista = new DefaultListModel<>();
		lista = new JList<>();
		lista.setBounds(12, 18, 235, 290);
		contentPane.add(lista);

		JLabel lblEncabezado = new JLabel("*** Hall of Fame ***");
		lblEncabezado.setBounds(86, 0, 136, 21);
		contentPane.add(lblEncabezado);

		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoJugador();
			}
		});
		btnNuevo.setBounds(34, 320, 99, 36);
		contentPane.add(btnNuevo);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int decision = JOptionPane.showConfirmDialog(null, "¿Seguro que quieres borrar los datos de jugadores?", "Advertencia", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if(decision == JOptionPane.OK_OPTION) {
					borrarArchivo();	
				} else {
					JOptionPane.showMessageDialog(null, "Operación cancelada. No se ha borrado ningún dato.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnBorrar.setBounds(165, 320, 99, 36);
		contentPane.add(btnBorrar);

		cargarJugadores();
	}

	/**
	 * Añade un jugador nuevo y su puntuación. Este método es llamado desde el
	 * listener del botón Nuevo.
	 */
	private void nuevoJugador() {
		Jugador jugador = leerDatosJugador();
		
		if (jugador != null) {
			guardarJugador(jugador);
			
			modeloLista.clear();
			cargarJugadores();
		}
	}

	/**
	 * Pide al usuario los datos de un nuevo jugador y devuelve un objeto Jugador.
	 *
	 * @return Un objeto Jugador con los datos leídos, o null si los datos no son
	 *         válidos.
	 */

	private Jugador leerDatosJugador() {
		String nombre = JOptionPane.showInputDialog(null, "¿Nombre del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		String puntuacionString = JOptionPane.showInputDialog(null, "¿Puntuación del jugador?", "Nuevo",
				JOptionPane.QUESTION_MESSAGE);

		int puntuacion = 0;

		try {
			puntuacion = Integer.parseInt(puntuacionString);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "La puntuación debe ser un número entero.");
			return null;
		}
		return new Jugador(nombre, puntuacion);
	}

	/**
	 * Guarda la información de un jugador en el archivo de disco, en formato csv.
	 *
	 * @param jugador Objeto Jugador con el nombre y la puntuación a añadir.
	 */
	public void guardarJugador(Jugador jugador) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true));
			bw.write(jugador.getNombre() + ", " + jugador.getPuntuacion() + "\n");

			bw.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error de escritura en disco.");
		}
	}

	/**
	 * Lee los datos sobre nombres y puntuaciones de jugadores. Los añade a la lista
	 * que se muestra en la ventana.
	 */
	public void cargarJugadores() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(NOMBRE_ARCHIVO));

			String linea = br.readLine();
			
			while (linea != null) {
				String[] partes = linea.split(",");
				String nombre = partes[0];
				String puntuacion = partes[1];
				modeloLista.addElement(nombre + "..." + puntuacion);
				
				linea = br.readLine();
			}

			br.close();
			
			lista.setModel(modeloLista);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error de lectura, se creará un archivo llamado jugadores.txt.");
		}
	}

	/**
	 * Borra el contenido del archivo de jugadores, dejándolo en blanco. Y la lista
	 * de jugadores en la ventana. Este método es llamado desde el listener del
	 * botón Borrar.
	 */
	public void borrarArchivo() {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO));
			bw.write("");
			bw.close();
			lista.setModel(modeloLista);
			
			modeloLista.clear();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al borrar el archivo.");
		}

	}

	public Jugador(String nombre, int puntuacion) {
		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

}

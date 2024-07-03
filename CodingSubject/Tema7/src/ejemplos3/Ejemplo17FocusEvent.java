package ejemplos3;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo17FocusEvent extends JFrame {

	private JTextField txtNum1, txtNum2, txtNum3;
	private JLabel lblPromedio;

	public Ejemplo17FocusEvent() {
		super("Media aritmética");
		setSize(240, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		txtNum1 = new JTextField("0", 5);
		txtNum1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int num3 = Integer.parseInt(txtNum3.getText());
				double media = (num1 + num2 + num3) / 3.0;

				lblPromedio.setText("Promedio = " + media);
			}
		});
		
		txtNum2 = new JTextField("0", 5);
		txtNum2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				try {
					int num1 = Integer.parseInt(txtNum1.getText());
					int num2 = Integer.parseInt(txtNum2.getText());
					int num3 = Integer.parseInt(txtNum3.getText());
					double media = (num1 + num2 + num3) / 3.0;

					lblPromedio.setText("Promedio = " + media);

				} catch (NumberFormatException nfe) {
					lblPromedio.setText("ERROR");
				}			
			}
		});
		txtNum3 = new JTextField("0", 5);
		txtNum3.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				try {
					int num1 = Integer.parseInt(txtNum1.getText());
					int num2 = Integer.parseInt(txtNum2.getText());
					int num3 = Integer.parseInt(txtNum3.getText());
					double media = (num1 + num2 + num3) / 3.0;

					lblPromedio.setText("Promedio = " + media);

				} catch (NumberFormatException nfe) {
					lblPromedio.setText("ERROR");
				}			
			}
		});

		lblPromedio = new JLabel("Promedio = 0");

		add(txtNum1);
		add(txtNum2);
		add(txtNum3);
		add(lblPromedio);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo17FocusEvent();
	}

}

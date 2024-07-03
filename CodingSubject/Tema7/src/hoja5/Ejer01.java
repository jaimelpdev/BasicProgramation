package hoja5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ejer01 extends JFrame {

	public Ejer01() {
		super("Texto decorado");
		setSize(400, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setLayout(new FlowLayout());

		JTextField txt1 = new JTextField();
		txt1.setPreferredSize(new Dimension(80, 20));

		txt1.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt1.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txt1.setBackground(Color.YELLOW);
			}
		});

		JTextField txt2 = new JTextField();
		txt2.setPreferredSize(new Dimension(80, 20));

		txt2.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt2.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txt2.setBackground(Color.YELLOW);
			}
		});

		JTextField txt3 = new JTextField();
		txt3.setPreferredSize(new Dimension(80, 20));

		txt3.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent e) {
				txt3.setBackground(Color.WHITE);
			}

			@Override
			public void focusGained(FocusEvent e) {
				txt3.setBackground(Color.YELLOW);
			}
		});

		add(txt1);
		add(txt2);
		add(txt3);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejer01();
	}

}

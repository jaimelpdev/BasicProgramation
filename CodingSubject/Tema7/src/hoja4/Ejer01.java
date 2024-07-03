package hoja4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejer01 extends JFrame implements ActionListener {

    private JButton btnFoto1, btnFoto2, btnFoto3, btnFoto4;
    private JLabel lblImagen;

    public Ejer01() {
        super("Fotogramas");
        setSize(1100, 730);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        JPanel panelSuperior = new JPanel(new FlowLayout());

        btnFoto1 = new JButton("Black rain");
        btnFoto1.addActionListener(this);
        btnFoto2 = new JButton("El caso Winslow");
        btnFoto2.addActionListener(this);
        btnFoto3 = new JButton("Asalto al distrito 13");
        btnFoto3.addActionListener(this);
        btnFoto4 = new JButton("Blade runner");
        btnFoto4.addActionListener(this);

        panelSuperior.add(btnFoto1);
        panelSuperior.add(btnFoto2);
        panelSuperior.add(btnFoto3);
        panelSuperior.add(btnFoto4);

        JPanel panelCentral = new JPanel(new FlowLayout());
        lblImagen = new JLabel();
        lblImagen.setIcon(new ImageIcon("pelis/imagen1.jpg"));
        panelCentral.setPreferredSize(new Dimension(400, 300));
        panelCentral.add(lblImagen);

        add(panelSuperior, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton btnImagen = (JButton) e.getSource();

        if (btnImagen == btnFoto1) {
            lblImagen.setIcon(new ImageIcon("pelis/imagen1.jpg"));
        } else if (btnImagen == btnFoto2) {
            lblImagen.setIcon(new ImageIcon("pelis/imagen2.jpeg"));
        } else if (btnImagen == btnFoto3) {
            lblImagen.setIcon(new ImageIcon("pelis/imagen3.jpg"));
        } else if (btnImagen == btnFoto4) {
            lblImagen.setIcon(new ImageIcon("pelis/imagen4.jpg"));
        }

    }

    public static void main(String[] args) {
        new Ejer01();
    }

}
package hoja3;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Ejer04 extends JFrame {

		public Ejer04() {
			super("Asistente matemático");
			setSize(400,300);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			setLayout(new FlowLayout());
			setLocationRelativeTo(null);
			
			JMenu menuAritmetica = new JMenu("Aritmética");
			JMenuItem itemSuma = new JMenuItem("Suma");
			JMenuItem itemResta = new JMenuItem("Resta");
			JMenuItem itemMultiplicar = new JMenuItem("Multiplicación");
			JMenuItem itemDividir = new JMenuItem("División");
			JMenuItem itemPorcentaje = new JMenuItem("Porcentaje");
			
			menuAritmetica.add(itemSuma);
			menuAritmetica.add(itemResta);
			menuAritmetica.addSeparator();
			menuAritmetica.add(itemMultiplicar);
			menuAritmetica.add(itemDividir);
			menuAritmetica.addSeparator();
			menuAritmetica.add(itemPorcentaje);
			
			JMenu menuCalculo = new JMenu("Cálculo");
			JMenuItem itemDerivada = new JMenuItem("Derivada");
			JMenuItem itemIntegral = new JMenuItem("Integral");
			JMenuItem itemPolinomio = new JMenuItem("Polinomio de Taylor");
			JMenuItem itemEcuacion = new JMenuItem("Ecuación diferencial");
			
			menuCalculo.add(itemDerivada);
			menuCalculo.add(itemIntegral);
			menuCalculo.addSeparator();
			menuCalculo.add(itemPolinomio);
			menuCalculo.add(itemEcuacion);
			
			JMenuBar menuMates = new JMenuBar();
			menuMates.add(menuAritmetica);
			menuMates.add(menuCalculo);
			
			setJMenuBar(menuMates);
			
			setVisible(true);
		}
		
		public static void main(String[] args) {
		new Ejer04();	
		}
		
}

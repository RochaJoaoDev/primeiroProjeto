package CalculadoraDeMedia;

import javax.swing.JOptionPane;

public class CalculadoraDeMedia {

	public static void main(String[] args) {
		
		String nota1 = JOptionPane.showInputDialog("Insira o valor da nota 1: ");
		String nota2 = JOptionPane.showInputDialog("Insira o valor da nota 2: ");
		String nota3 = JOptionPane.showInputDialog("Insira o valor da nota 3: ");
		String nota4 = JOptionPane.showInputDialog("Insira o valor da nota 4: ");
		
		double total1 = Double.parseDouble(nota1);
		double total2 = Double.parseDouble(nota2);
		double total3 = Double.parseDouble(nota3);
		double total4 = Double.parseDouble(nota4);
		double media = (total1 + total2 + total3 + total4) / 4;
		
		if (media >= 50 && media <= 69) {
			JOptionPane.showMessageDialog(null, "Em recuperação. Media = " + media);
		}else if (media > 70 && media < 89) {
			JOptionPane.showMessageDialog(null, "Aprovado. Media = " + media);
		}else if (media > 90) {
			JOptionPane.showMessageDialog(null, "PARABENS RAPA AI SIM!!! Media = " + media);
		}else {
			JOptionPane.showMessageDialog(null, "Reprovado. Media: " + media);
		}
		
		
		
		/*Media para aprovação é 70*/
		
		
		
		
	}

}

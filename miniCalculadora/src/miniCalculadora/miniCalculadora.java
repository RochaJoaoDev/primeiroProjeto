package miniCalculadora;

import javax.swing.JOptionPane;

public class miniCalculadora {

	public static void main(String[] args) {
		
		
		String primeiroValorInput = JOptionPane.showInputDialog("Insira o primeiro valor: ");
		String operador = JOptionPane.showInputDialog("Insira o operador matematico: ");
		String segundoValorInput = JOptionPane.showInputDialog("Insira o segundo valor: ");
		double resultado = 0;
		
		double primeiroInputValor = Double.parseDouble(primeiroValorInput);
		double segundoInputValor = Double.parseDouble(segundoValorInput);
		
		if (operador.equals ("+")) {
			resultado = primeiroInputValor + segundoInputValor;
		}else if (operador.equals ("x")) {
			resultado = primeiroInputValor * segundoInputValor;
		}else if (operador.equals ("/")) {
			resultado = primeiroInputValor / segundoInputValor;
		}else if (operador.equals ("-")) {
			resultado = primeiroInputValor - segundoInputValor;
		}else {
			JOptionPane.showMessageDialog(null, "Insira um valor valido e repita a operação.");
		}
		
		
		JOptionPane.showMessageDialog(null, "O resultado da operação é: " + resultado);
		
	}

}

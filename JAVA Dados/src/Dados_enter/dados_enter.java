package Dados_enter;

import javax.swing.JOptionPane;

public class dados_enter {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		/* criando uma opção de confirmação*/
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao);
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + resto);
		}
	}

}

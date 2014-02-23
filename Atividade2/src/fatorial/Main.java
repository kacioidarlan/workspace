package fatorial;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/* declaração de variáveis */
		String inputDados;
		int valor = 0;
		int fatorial = 1;

		try {

			/* Valor para cálculo do fatorial */
			inputDados = JOptionPane
					.showInputDialog("Informe a quantidade de funcionários:");
			valor = new Integer(inputDados);
			
			//Verificação de valores negativos
			if (valor < 0) {
				System.out.println("Informe somente valores positivos.");
			} else {
				//Loop para calcular o fatorial
				for (int i = 1; i <= valor; i++) {
					fatorial = fatorial * i;
				}
				System.out.println("O fatorial de " + valor + " é " + fatorial);
			}

		} catch (HeadlessException e) {
			System.out.println("Informe somente valores inteiros.");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("Erro inesperado!");
			e.printStackTrace();
		}

	}

}

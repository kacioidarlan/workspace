package calculadora;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/* declaração de variáveis */
		String inputDados;
		Object inputSelecao;
		String operador;

		/* Seleção do tipo da operação */
		Object[] valoresPossiveis = { "+", "-", "*", "/" };
		inputSelecao = JOptionPane.showInputDialog(null,
				"Selecione o tipo de operação", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, valoresPossiveis,
				valoresPossiveis[0]);
		operador = (String) inputSelecao;

		/* Informação do primeiro valor */
		inputDados = JOptionPane.showInputDialog("Informe valor A:");

		try {
			/* Bloco de valores inteiros verificação se é valor inteiro*/
			if (ConverteValores.ValorInteiro(inputDados)) {
				
				//atribuição do valor A informado inicialmente
				int valorA = new Integer(inputDados);
				
				//Informação do segundo valor, somente do tipo inteiro
				inputDados = JOptionPane.showInputDialog("Informe valor B:");
				int valorB = new Integer(inputDados);
				
				//Imprime o resultado da operação, chamando overload do calcular com parâmetros integers
				System.out.println("Resultado da operação Valor A" + operador
						+ "Valor B é: "
						+ Calculadora.calcular(valorA, valorB, operador));
			}
			/* Bloco de valores reais, verificação se é valor real */
			else if (ConverteValores.ValorReal(inputDados)) {
				
				//atribuição do valor A informado inicialmente				
				double valorA = new Double(inputDados);
				
				//Informação do segundo valor, somente do tipo real
				inputDados = JOptionPane.showInputDialog("Informe valor B:");					
				double valorB = new Double(inputDados);
				
				//Imprime o resultado da operação, chamando overload do calcular com parâmetros double
				System.out.println("Resultado da operação Valor A" + operador
						+ "Valor B é: "
						+ Calculadora.calcular(valorA, valorB, operador));
			} 
			//Imprime mensagem caso o primeiro valor informado não seja nem inteiro nem real
			else				
				System.out
						.println("Operação só disponível para valores inteiros ou reais.");
			
		/*Bloco de tratamento de exceções de formatação e geral*/			
		} catch (NumberFormatException e) {
			System.out
					.println("Operação só disponível para dois valores inteiros ou dois valores reais, sendo possível usar somente um tipo por vez.");
			e.printStackTrace();
		} catch (HeadlessException e) {
			System.out.println("Erro inesperado!");
			e.printStackTrace();
		}
	}
}

package calculadora;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		/* declara��o de vari�veis */
		String inputDados;
		Object inputSelecao;
		String operador;

		/* Sele��o do tipo da opera��o */
		Object[] valoresPossiveis = { "+", "-", "*", "/" };
		inputSelecao = JOptionPane.showInputDialog(null,
				"Selecione o tipo de opera��o", "Input",
				JOptionPane.INFORMATION_MESSAGE, null, valoresPossiveis,
				valoresPossiveis[0]);
		operador = (String) inputSelecao;

		/* Informa��o do primeiro valor */
		inputDados = JOptionPane.showInputDialog("Informe valor A:");

		try {
			/* Bloco de valores inteiros verifica��o se � valor inteiro*/
			if (ConverteValores.ValorInteiro(inputDados)) {
				
				//atribui��o do valor A informado inicialmente
				int valorA = new Integer(inputDados);
				
				//Informa��o do segundo valor, somente do tipo inteiro
				inputDados = JOptionPane.showInputDialog("Informe valor B:");
				int valorB = new Integer(inputDados);
				
				//Imprime o resultado da opera��o, chamando overload do calcular com par�metros integers
				System.out.println("Resultado da opera��o Valor A" + operador
						+ "Valor B �: "
						+ Calculadora.calcular(valorA, valorB, operador));
			}
			/* Bloco de valores reais, verifica��o se � valor real */
			else if (ConverteValores.ValorReal(inputDados)) {
				
				//atribui��o do valor A informado inicialmente				
				double valorA = new Double(inputDados);
				
				//Informa��o do segundo valor, somente do tipo real
				inputDados = JOptionPane.showInputDialog("Informe valor B:");					
				double valorB = new Double(inputDados);
				
				//Imprime o resultado da opera��o, chamando overload do calcular com par�metros double
				System.out.println("Resultado da opera��o Valor A" + operador
						+ "Valor B �: "
						+ Calculadora.calcular(valorA, valorB, operador));
			} 
			//Imprime mensagem caso o primeiro valor informado n�o seja nem inteiro nem real
			else				
				System.out
						.println("Opera��o s� dispon�vel para valores inteiros ou reais.");
			
		/*Bloco de tratamento de exce��es de formata��o e geral*/			
		} catch (NumberFormatException e) {
			System.out
					.println("Opera��o s� dispon�vel para dois valores inteiros ou dois valores reais, sendo poss�vel usar somente um tipo por vez.");
			e.printStackTrace();
		} catch (HeadlessException e) {
			System.out.println("Erro inesperado!");
			e.printStackTrace();
		}
	}
}

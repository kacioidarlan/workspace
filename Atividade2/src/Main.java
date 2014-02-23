import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/* declara��o de vari�veis */
		String inputDados;
		int qtdeFuncionarios;
		double[] vetorSalarios;
		double somaSalarios = 0;

		/* Solicitando a quantidade de funcion�rios */
		inputDados = JOptionPane
				.showInputDialog("Informe a quantidade de funcion�rios:");
		qtdeFuncionarios = new Integer(inputDados);

		/* Inicializando o vetor com a quantidade de usu�rios informados */
		vetorSalarios = new double[qtdeFuncionarios];

		/* Looping para preencher sal�rio de cada funcion�rio */
		for (int i = 0; i < vetorSalarios.length; i++) {
			inputDados = JOptionPane
					.showInputDialog("Informe a quantidade do funcion�rio " + i
							+ 1 + ":");
			vetorSalarios[i] = new Double(inputDados);
			somaSalarios += vetorSalarios[i];
		}

		/* Exibe a m�dia salarial */

		System.out.println("M�dia Salarial: R$ " + somaSalarios
				/ qtdeFuncionarios);
	}
}

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		/* declaração de variáveis */
		String inputDados;
		int qtdeFuncionarios;
		double[] vetorSalarios;
		double somaSalarios = 0;

		/* Solicitando a quantidade de funcionários */
		inputDados = JOptionPane
				.showInputDialog("Informe a quantidade de funcionários:");
		qtdeFuncionarios = new Integer(inputDados);

		/* Inicializando o vetor com a quantidade de usuários informados */
		vetorSalarios = new double[qtdeFuncionarios];

		/* Looping para preencher salário de cada funcionário */
		for (int i = 0; i < vetorSalarios.length; i++) {
			inputDados = JOptionPane
					.showInputDialog("Informe a quantidade do funcionário " + i
							+ 1 + ":");
			vetorSalarios[i] = new Double(inputDados);
			somaSalarios += vetorSalarios[i];
		}

		/* Exibe a média salarial */

		System.out.println("Média Salarial: R$ " + somaSalarios
				/ qtdeFuncionarios);
	}
}

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) throws Exception {

		// Declaração de variáveis
		float valor1 = 0f;
		float valor2 = 0f;
		String inputDados;

		// Informação dos valores
		inputDados = JOptionPane
				.showInputDialog("Informe um número para valor 1:");

		// Conversão de valor com tratamento de erros
		try {
			valor1 = new Float(inputDados);
			
			//Tratamento para o valor 1 não ser 0
			if (valor1 == 0)
				throw new Exception("Valor 1 não pode ser igual a 0.");

			inputDados = JOptionPane
					.showInputDialog("Informe um número para valor 2:");

			valor2 = new Float(inputDados);

			// Teste de cada operação da calculadora
			Calculadora calculadora = new Calculadora();
			System.out.println("Teste soma: "
					+ calculadora.somar(valor1, valor2));
			System.out.println("Teste subtração: "
					+ calculadora.subtrair(valor1, valor2));
			System.out.println("Teste divisão: "
					+ calculadora.dividir(valor1, valor2));
			System.out.println("Teste multiplicação: "
					+ calculadora.multiplicar(valor1, valor2));

		} catch (NumberFormatException e) {
			System.out
					.println("Entrada de dados inválida. Digite apenas números.");
			e.printStackTrace();
		}
	}
}

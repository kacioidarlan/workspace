import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) throws Exception {

		// Declara��o de vari�veis
		float valor1 = 0f;
		float valor2 = 0f;
		String inputDados;

		// Informa��o dos valores
		inputDados = JOptionPane
				.showInputDialog("Informe um n�mero para valor 1:");

		// Convers�o de valor com tratamento de erros
		try {
			valor1 = new Float(inputDados);
			
			//Tratamento para o valor 1 n�o ser 0
			if (valor1 == 0)
				throw new Exception("Valor 1 n�o pode ser igual a 0.");

			inputDados = JOptionPane
					.showInputDialog("Informe um n�mero para valor 2:");

			valor2 = new Float(inputDados);

			// Teste de cada opera��o da calculadora
			Calculadora calculadora = new Calculadora();
			System.out.println("Teste soma: "
					+ calculadora.somar(valor1, valor2));
			System.out.println("Teste subtra��o: "
					+ calculadora.subtrair(valor1, valor2));
			System.out.println("Teste divis�o: "
					+ calculadora.dividir(valor1, valor2));
			System.out.println("Teste multiplica��o: "
					+ calculadora.multiplicar(valor1, valor2));

		} catch (NumberFormatException e) {
			System.out
					.println("Entrada de dados inv�lida. Digite apenas n�meros.");
			e.printStackTrace();
		}
	}
}

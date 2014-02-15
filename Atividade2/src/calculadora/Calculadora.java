package calculadora;

public class Calculadora {

	//Retorna o resultado da operação de dois inteiros
	public static int calcular(int i, int j, String operacao){
		int resultado = 0;
		
		switch (operacao) {
		case "+":
			resultado = i + j;
			break;
		case "-":
			resultado = i - j;
			break;
		case "*":
			resultado = i * j;
			break;
		case "/":
			resultado = i / j;
			break;
		default:
			resultado = -1;
			break;
		}
		return resultado;
	}
	
	//Retorna o resultado da operação de dois doubles
	public static double calcular(double i, double j, String operacao){
		double resultado = 0;
		
		switch (operacao) {
		case "+":
			resultado = i + j;
			break;
		case "-":
			resultado = i - j;
			break;
		case "*":
			resultado = i * j;
			break;
		case "/":
			resultado = i / j;
			break;
		default:
			resultado = -1;
			break;
		}
		return resultado;
	}
}

package calculadora;

public class ConverteValores {
	
	/*Retorna true se um valor é inteiro*/
	public static boolean ValorInteiro(String valor) {
		try {
			Integer.parseInt(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/*Retorna false se um valor é Double*/
	public static boolean ValorReal(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}

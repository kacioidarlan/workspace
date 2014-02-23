package calculadora;

public class ConverteValores {
	
	/*Retorna true se um valor � inteiro*/
	public static boolean ValorInteiro(String valor) {
		try {
			Integer.parseInt(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/*Retorna false se um valor � Double*/
	public static boolean ValorReal(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}

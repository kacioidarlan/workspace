
public class Calculo {
	
	public static int calcular(int i){
		return -i;
	}
	
	public static int  calcular(int i, int j){
		return i + j;
	}
	
	public Calculo(){
	
	}
	
	public Calculo(String mensagem){
		System.out.println("Classe pai:" + mensagem);
	}
	
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
		case "%":
			resultado = i % j;
			break;			
		default:
			break;
		}
		return resultado;
	}

}

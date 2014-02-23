
public class InteiroBinario {
	
	public static String ConverterParaBinario(int decimal){
						
		int valor=12;
		int quociente;
		int resto;
		String binario;
		
		quociente=valor/2;
		resto=valor%2;
		binario = Integer.toString(resto);
		
		while (quociente>0){
			resto=quociente%2;
			quociente=quociente/2;
			binario = binario + Integer.toString(resto);
		}		
		
		return new StringBuilder(binario).reverse().toString();
	}

}

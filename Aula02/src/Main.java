public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int c = 12;
		//
		// System.out.println(InteiroBinario.ConverterParaBinario(c));
		//
		// int valor=12;
		// int quociente;
		// int resto;
		//
		// quociente=valor/2;
		// resto=valor%2;
		// System.out.println(resto);
		//
		// while (quociente>0){
		// resto=quociente%2;
		// quociente=quociente/2;
		// System.out.println(resto);
		// }
		//
		// String bin = Integer.toString(valor,2);
		// System.out.println(bin);

		int[] intArray = { 3, 5, 1, 9 };
		int maximo = 0;
		int minimo = 0;
		int soma = 0;
		float media;

		for (int i = 0; i < intArray.length; i++) {

			if (i == 0) {
				maximo = intArray[i];
				minimo = intArray[i];
				soma = intArray[i];
				continue;
			}

			if (intArray[i] > maximo)
				maximo = intArray[i];
			
			if (minimo < intArray[i])
				minimo = intArray[i];

			soma += intArray[i];
		}
		media = (float) soma / (float) intArray.length;
		
		System.out.println("Soma:" + soma);
		System.out.println("Máx: " + maximo);
		System.out.println("Mín: " + minimo);
		System.out.println("Média: " + media);
		
	}
}

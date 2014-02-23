public class Calculadora {
	public static void Media(String nome, Integer... args) {
		Integer qtdItens = 0;
		Integer somaItens = 0;		
		for (Integer valor : args) {
			qtdItens += 1;
			somaItens += valor;
		}
		
		System.out.println(nome + "> Média: " + Math.round((somaItens/qtdItens)));
	}
}

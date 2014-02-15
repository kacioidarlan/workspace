import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;


public class MainPessoa {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(new Pessoa("Jo�o Garcia", 20,'M',"AIK Enterprises"));
		pessoas.add(new Pessoa("Maria Martins", 44,'F',"Simples"));
		pessoas.add(new Pessoa("Henrique Fernando", 43,'M',"AIK Enterprises"));
		pessoas.add(new Pessoa("In�cio Lu�s", 33,'M',"Magazine Andr�"));
		pessoas.add(new Pessoa("Fernando Ferreira", 87,'M',"Casas Recife"));
		
//		a.	Sortear a lista e retirar uma pessoa;				
			System.out.println(pessoas.get(ThreadLocalRandom.current().nextInt(pessoas.size())));					
			
//		b.	Ordena��o da lista baseado no atributo nome;
			Collections.sort(pessoas);
			System.out.println(pessoas);
			
//		c.	Inverter a ordem da lista baseado no atributo nome; 
			Collections.reverse(pessoas);
			System.out.println(pessoas);
	}

}

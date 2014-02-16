import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;

public class mainAgenda {

	public static void main(String[] args) {
		telaPrincipal();
	}

	private static void telaPrincipal() {
		imprimeCabecalhoTelaPrincipal();
		System.out.println(retornaAtividadesContatosIniciais());
		System.out.println(opcoesTelaPrincipal());
		String opcaoDigitada = inputDados();
		tratarOpcaoTelaPrincipal(opcaoDigitada);
	}

	private static void imprimeCabecalhoTelaPrincipal() {
		System.out
				.println("***********************************************************************************");
		System.out
				.println("****************************Bem Vindo a Agenda Java !!!****************************");
		System.out
				.println("***********************************************************************************\n");
		System.out
				.println("Planejador de Atividades                           Organizador de Contatos         ");
		System.out
				.println("Próximas Atividades                                Últimos Contatos Adicionados    ");
		System.out
				.println("Dt. Início Dt. Fim    Nome                         Nome                 Telefone   ");
		// 22/12/2014 22/12/2014 Fazer Atividade Final********Java José das
		// Colves 11 97210 3903
	}

	private static String retornaAtividadesContatosIniciais() {
		Atividade atividade1 = new Atividade(new Date(), new Date(),
				"Atividade de Java 1", "FIAP");
		Atividade atividade2 = new Atividade(new Date(), new Date(),
				"Atividade de Java 2", "FIAP");
		Atividade atividade3 = new Atividade(new Date(), new Date(),
				"Atividade de Java 3", "FIAP");
		Atividade atividade4 = new Atividade(new Date(), new Date(),
				"Atividade de Java 4", "FIAP");
		Atividade atividade5 = new Atividade(new Date(), new Date(),
				"Atividade de Java 5", "FIAP");

		Contato contato1 = new Contato("Meu contato 1", "", "11 97210 3903",
				"", "", "");
		Contato contato2 = new Contato("Meu contato 2", "", "11 97210 3903",
				"", "", "");
		Contato contato3 = new Contato("Meu contato 3", "", "11 97210 3903",
				"", "", "");
		Contato contato4 = new Contato("Meu contato 4", "", "11 97210 3903",
				"", "", "");
		Contato contato5 = new Contato("Meu contato 5", "", "11 97210 3903",
				"", "", "");

		return Util.padRight(atividade1.toString(), 51)
				+ contato1.toStringResumido() + "\n"
				+ Util.padRight(atividade2.toString(), 51)
				+ contato2.toStringResumido() + "\n"
				+ Util.padRight(atividade3.toString(), 51)
				+ contato3.toStringResumido() + "\n"
				+ Util.padRight(atividade4.toString(), 51)
				+ contato4.toStringResumido() + "\n"
				+ Util.padRight(atividade5.toString(), 51)
				+ contato5.toStringResumido();
	}

	private static String opcoesTelaPrincipal() {
		return "\nDigite: \n" + Util.padRight("1 para Nova Atividade", 30)
				+ Util.padRight("2 para Listar Atividades", 30)
				+ Util.padRight("3 para Incluir Novo Contato", 30) + "\n"
				+ Util.padRight("4 para Pesquisar Contato", 30)
				+ Util.padRight("5 para Listar Todos Contatos", 30)
				+ "x para fechar aplicação";
	}

	private static String inputDados() {
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader stdin = new BufferedReader(isr);
		try {
			return stdin.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	private static void tratarOpcaoTelaPrincipal(String opcaoDigitada) {
		switch (opcaoDigitada.toUpperCase()) {
		case "1":
			// Nova Atividade
			break;
		case "2":
			// Listar Atividades
			break;
		case "3":
			// Incluir Novo Contato
			break;
		case "4":
			// Pesquisar Contato
			break;
		case "5":
			// Listar Atividades
			break;
		case "X":
			// Fechar Programa
			System.out.println("Deseja sair do aplicativo?"); 
			
			System.out.println("\nDigite:\n"+
								"1. Confirmar    2. Cancelar");
			
			break;
		default: {
			System.out.println(opcaoDigitada + " não é uma opção válida.");
			System.out.println(opcoesTelaPrincipal());
			tratarOpcaoTelaPrincipal(inputDados());
			break;
		}

		}

	}
}

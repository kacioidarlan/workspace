import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainCriptografia {

	public static void main(String[] args) throws IOException {
		/* Bloco para criptografar a mensagem */
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader stdin = new BufferedReader(isr);

		FileWriter fw = new FileWriter("c:\\temp\\mensagemCodificada.txt");
		PrintWriter out = new PrintWriter(fw);

		System.out.println("Digite um texto e pressione <Enter> para sair");
		String linha = null;
		linha = stdin.readLine();
		out.println(Criptografia.Criptografar(linha));

		while (!linha.equals("")) {
			linha = stdin.readLine();
			out.println(Criptografia.Criptografar(linha));
		}
		out.close();

		/* Bloco para descriptografar a mensagem */
		File arquivoCriptografado = new File("c:\\temp\\mensagemCodificada.txt");
		BufferedReader leitorArquivoCriptografado = new BufferedReader(
				new FileReader(arquivoCriptografado));
		FileWriter fw2 = new FileWriter("c:\\temp\\mesagemDecodificada.txt");
		PrintWriter out2 = new PrintWriter(fw2);

		linha = leitorArquivoCriptografado.readLine();
		while (linha != null) {
			out2.print(Criptografia.Descriptografar(linha));
			linha = leitorArquivoCriptografado.readLine();
		}
		leitorArquivoCriptografado.close();
		out2.close();
	}

}

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MainArquivo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		InputStream is  = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader stdin  = new BufferedReader(isr);

		FileWriter fw = new FileWriter("d:\\temp\\aquivo.txt");
		PrintWriter out = new PrintWriter(fw); 
		
		System.out.println("Digite um texto e pressione <Enter> para sair");
		String linha = null;
		linha = stdin.readLine();
		out.println(linha);		
		
		while (!linha.equals("")){
			linha = stdin.readLine();
			out.println(linha);			
		}
		out.close();		 	
	}
}

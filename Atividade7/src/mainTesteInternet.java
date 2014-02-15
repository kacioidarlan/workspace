import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class mainTesteInternet {

	public static void main(String[] args) {

		try {
			// google.com.br, HTTP (porta 80)
			testeConexao("google.com.br", "HTTP", 80);
			
			//google.com.br, HTTPS (porta 443)
			testeConexao("google.com.br", "HTTPS", 443);
			
			//google.com.br, FTP (porta 21)
			testeConexao("google.com.br", "FTP", 21);
			
			//uol.com.br, SMTP (porta 25)
			testeConexao("uol.com.br", "SMTP", 25);
			
			//terra.com.br, WEBSERVICES (porta 8080)
			testeConexao("terra.com.br", "WEBSERVICES", 8080);		

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private static void testeConexao(String url, String servico, Integer porta)
			throws IOException {
		System.out.println("\nEndereço: " + url);
		System.out.println("Serviço: " + servico);
		System.out.println("Porta: " + porta);

		try {
			InetSocketAddress isUrl = new InetSocketAddress(url, porta);
			Socket socket = new Socket();
			socket.connect(isUrl);
			socket.close();
			System.out.println("Conectividade: OK");
		} catch (Exception e) {
			System.out.println("Conectividade: Não Disponível");
		}

	}

}

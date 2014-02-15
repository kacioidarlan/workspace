import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

	public static void main(String[] args) {

		Logger logger1 = Logger.getLogger("pai");

		try {
			logger1.info("Abrindo arquivo texto.txt");
			new Main().readTxtFile(new File("C:\\texto.txt"));
		} catch (Exception e) {
			logger1.log(Level.SEVERE, e.getMessage(), e);		
		}
	}

	public void readTxtFile(File file) throws Exception {
		Logger logger1 = Logger.getLogger("pai.filho1");
		
		// leitor
		BufferedReader br = new BufferedReader(new FileReader(file));
		// lê linha a linha		
		String linha = br.readLine();
		while (linha != null) {			
			logger1.info("Lendo linha do arquivo: " + linha);
			linha = br.readLine();
		}
		br.close();
	}

}

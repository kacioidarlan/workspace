import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Refatoracao {

	private void testeArquivo() {
		try {
			FileInputStream arquivo = new FileInputStream("arquivoTexto.txt");

		} catch (IOException e) {
			System.out.println("Opera��o Cancelada, erro de arquivo/IO");
		} catch (Exception e2) {
			System.out.println("Opera��o Cancelada, erro " + e2.getMessage());
		}
	}

}

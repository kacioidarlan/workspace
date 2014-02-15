import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainStringBuffer {

	public static void main(String[] args) throws IOException {
		BufferedReader inReader = new BufferedReader(new InputStreamReader(System.in)); 
		String linha = inReader.readLine();
		
		StringBuffer acumulaStrings = new StringBuffer();		
		
		while (!linha.equals(":q")) {			
			acumulaStrings.append("\n"+linha);
			linha = inReader.readLine();
		}
		System.out.println(acumulaStrings.toString());
	}

}

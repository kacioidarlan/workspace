import java.text.SimpleDateFormat;
import java.util.Date;

public class MainDatas {

	public static void main(String[] args) {
		Date dataAtual = new Date();
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy ");

		// • 2012-09-10 12:00
		formataData = new SimpleDateFormat("yyyy-mm-dd HH:mm");
		System.out.println(formataData.format(dataAtual));
		// • 10-09-12 12:00:00
		formataData = new SimpleDateFormat("dd-MM-yy HH:mm:ss");
		System.out.println(formataData.format(dataAtual));
		// • Monday (dia da semana)
		formataData = new SimpleDateFormat("E");
		System.out.println(formataData.format(dataAtual));
		// • 2012 (ano)
		formataData = new SimpleDateFormat("y");
		System.out.println(formataData.format(dataAtual));
		// • AD (era)
		formataData = new SimpleDateFormat("G");
		System.out.println(formataData.format(dataAtual));
	}

}

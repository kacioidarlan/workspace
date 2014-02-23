import java.text.SimpleDateFormat;
import java.util.Date;

public class ProcessoDataHora extends Thread {

	public void run() {
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dataAtual;
		while (true) {
			dataAtual = new Date();
			System.out.println(formataData.format(dataAtual));
			
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

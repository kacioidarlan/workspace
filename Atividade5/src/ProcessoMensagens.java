import java.util.ArrayList;

public class ProcessoMensagens extends Thread {

	private ArrayList<String> listaMensagens;
	private final int QTDE_ITENS = 20;

	public ProcessoMensagens() {
		super();
		listaMensagens = new ArrayList<String>();
		for (int i = 0; i < QTDE_ITENS; i++) {
			listaMensagens.add("Mensagem " + String.valueOf(i + 1));
		}
	}

	public void run() {

		while (listaMensagens.size() > 0) {
			System.out.println(listaMensagens.remove(0));

			try {
				sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

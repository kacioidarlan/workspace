public class MainProcessos {

	public static void main(String[] args) {
		ProcessoMensagens processoMensagens = new ProcessoMensagens();
		ProcessoDataHora processoDataHora = new ProcessoDataHora();

		processoMensagens.start();
		processoDataHora.start();

		while (true) {
			System.out.println("Processo de Mensagens isAlive: "
					+ processoMensagens.isAlive());
			System.out.println("Processo de Data e Hora isAlive: "
					+ processoDataHora.isAlive());

			try {
				Thread.sleep(5000);
			} catch (InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
		}
	}
}

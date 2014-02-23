public class Buffer {
	private int conteudo;
	private boolean disponivel = false;

	public synchronized int get() {
		while (!disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Consumidor - Valor [" + conteudo + "] consumido.");
		disponivel = false;
		notifyAll();
		return conteudo;
	}

	public synchronized void put(int valor) {
		while (disponivel) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		conteudo = valor;
		System.out.println("Produtor - Valor [" + valor + "] produzido.");
		disponivel = true;
		notifyAll();
	}
}
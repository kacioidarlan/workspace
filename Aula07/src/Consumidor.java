public class Consumidor extends Thread {
	private Buffer buffer;

	public Consumidor(Buffer buffer, int numero) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			int valor = buffer.get();
			try {
				sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
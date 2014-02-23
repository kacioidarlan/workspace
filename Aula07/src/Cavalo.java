public class Cavalo extends Thread {
	private String nomeCavalo;
	
	public Cavalo(String nomeCavalo) {
		super();
		this.nomeCavalo = nomeCavalo;
	}
	
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Cavalo: " + nomeCavalo + " número: " + i);
			try {
				Thread.sleep (( int )( Math.random () * 5000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Cavalo: " + nomeCavalo + " cruza  a linha de chegada.");
	}


}

public class Aviao extends Thread {
	private String nomeVoo;
	private Aeroporto aeroporto;

	public Aviao(String nomeVoo, Aeroporto aeroporto) {
		super();
		this.nomeVoo = nomeVoo;
		this.aeroporto = aeroporto;
	}

	private void Decolar() {
		while (this.aeroporto.AguardarPistaDisponivel())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("Vôo " + nomeVoo + " decolando.");
	}

	private void Aterrissar() {
		while (this.aeroporto.AguardarPistaDisponivel())
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Vôo " + nomeVoo + " aterrissando.");
	}

	private void Voar() {
		try {
			System.out.println("Vôo " + nomeVoo + " voando.");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run(){
		Decolar();
		Voar();
		Aterrissar();		
	}
}

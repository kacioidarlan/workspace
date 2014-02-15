public class Aeroporto extends Thread {
	private String nome;
	private Boolean estadoPista = false;

	public Aeroporto(String nome) {
		super();
		this.nome = nome;
	}

	public boolean AguardarPistaDisponivel() {
		return this.estadoPista;
	}

	private void AlterarEstadoPista() {
		while (true) {

			try {
				Thread.sleep(3000);
				this.estadoPista = !this.estadoPista;
				if (this.estadoPista){
					System.out.println(nome + "Pista Liberada. " + this.estadoPista);
				}
				else
				{
					System.out.println(nome + "Pista Obstruída. " + this.estadoPista);
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void run() {
		AlterarEstadoPista();
	}

}

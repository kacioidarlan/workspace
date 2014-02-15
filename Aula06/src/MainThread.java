
public class MainThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Processo processoA = new Processo("A");
		Processo processoB = new Processo("B");
		Processo processoC = new Processo("C");
		Processo processoD = new Processo("D");
		
		processoA.start();
		processoB.start();
		processoC.start();
		processoD.start();
	}

}

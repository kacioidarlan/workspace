
public class Processo extends Thread{	
	
	private String id;
	


	public Processo(String id) {
		super();
		this.id = id;
	}
	
	public void run() {		
		while (true)
			System.out.println("Thread " + id);		
	}

}

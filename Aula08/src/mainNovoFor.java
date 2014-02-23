import java.util.ArrayList;


public class mainNovoFor {

	public static void main(String[] args) {
		ArrayList<Integer> listaInt = new ArrayList<Integer>();
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		listaInt.add(1);
		
		Integer total = 0;
		for (Integer i : listaInt) {
			total += i;
		}
		
		System.out.println("Total: " + total);
	}

}

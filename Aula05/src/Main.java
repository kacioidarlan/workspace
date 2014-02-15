import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listaString = new ArrayList<String>();
		listaString.add("item 1");
		ArrayList<ArrayList<String>> arraysDeArrays = new ArrayList<ArrayList<String>>();
		arraysDeArrays.add(listaString);
	}

}

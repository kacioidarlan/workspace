import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class MainColecoes {

	public static void main(String[] args) {
		
		long tempoInicio;
		long tempoFim;
		Integer qtdItens = 30000;
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();

		Stack<Integer> stack = new Stack<>();
		HashSet<Integer> hashSet = new HashSet<>();

		HashMap<Integer, Integer> hashMap = new HashMap<>();
		WeakHashMap<Integer, Integer> weakHashMap = new WeakHashMap<>();

		//Arraylist
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			arrayList.add(i, i);
		}		
		tempoFim = System.nanoTime();		
		System.out.println("ArrayList - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
		System.out.println("Elemento 15000: " + arrayList.get(15000));
		tempoFim = System.nanoTime();		
		System.out.println("ArrayList - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		
		//LinkedList
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			linkedList.add(i, i);
		}
		tempoFim = System.nanoTime();		
		System.out.println("LinkedList - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
		System.out.println("Elemento 15000: " + linkedList.get(15000));
		tempoFim = System.nanoTime();		
		System.out.println("LinkedList - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		
		//Stack
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			stack.add(i, i);
		}
		tempoFim = System.nanoTime();		
		System.out.println("Stack - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
		System.out.println("Elemento 15000: " + stack.get(15000));
		tempoFim = System.nanoTime();		
		System.out.println("Stack - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		
		//HashSet
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			hashSet.add(i);
		}
		tempoFim = System.nanoTime();		
		System.out.println("HashSet - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
	    for (Iterator<Integer> item = hashSet.iterator(); item.hasNext(); ) {
	    	Integer elemento = item.next();
	        if (elemento==15000)
	            System.out.println("Elemento 15000: " + elemento);
	    }
		tempoFim = System.nanoTime();		
		System.out.println("HashSet - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		
		
		//HashMap
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			hashMap.put(i, i);
		}

		tempoFim = System.nanoTime();		
		System.out.println("HashMap - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
		System.out.println("Elemento 15000: " + hashMap.get(15000));
		tempoFim = System.nanoTime();		
		System.out.println("HashMap - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		
		
		//WeakHashMap
		tempoInicio = System.nanoTime();
		for (int i = 0; i < qtdItens; i++) {
			weakHashMap.put(i, i);
		}
		tempoFim = System.nanoTime();		
		System.out.println("WeakHashMap - inserção: " + (tempoFim - tempoInicio) / 1000000d);
		
		tempoInicio = System.nanoTime();
		System.out.println("Elemento 15000: " + weakHashMap.get(15000));
		tempoFim = System.nanoTime();		
		System.out.println("WeakHashMap - pegar elemento: " + (tempoFim - tempoInicio) / 1000000d);
		

	}

}

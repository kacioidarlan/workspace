import java.util.BitSet;

import javax.swing.JOptionPane;

public class mainBitSet {

	public static void main(String[] args) {
		String inputBinario1;
		String inputBinario2;
		// Informa��o dos valores
		inputBinario1 = JOptionPane
				.showInputDialog("Informe o primeiro bin�rio: ");
		inputBinario2 = JOptionPane
				.showInputDialog("Informe o segundo bin�rio: ");

		BitSet bits1 = fromString(inputBinario1);
		BitSet bits2 = fromString(inputBinario2);
		
		bits1.or(bits2);
		System.out.println("OR: " + toString(bits1));
		
		bits1 = fromString(inputBinario1);
		bits1.and(bits2);
		System.out.println("AND: " + toString(bits1));
		
		bits1 = fromString(inputBinario1);
		bits1.xor(bits2);
		System.out.println("XOR: " + toString(bits1));	
	
		

	}

	private static BitSet fromString(final String s) {
		return BitSet.valueOf(new long[] { Long.parseLong(s, 2) });
	}

	private static String toString(BitSet bs) {
		return Long.toString(bs.toLongArray()[0], 2);
	}

}

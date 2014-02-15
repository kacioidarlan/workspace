
public class Caracteres {

	public String texto;
	
	@Override
	public boolean equals(Object obj){
		Caracteres c;
		c = (Caracteres)obj;
		
		String textoSemNumero;
		String textoSemNumero2;
		
		textoSemNumero = this.texto.replaceAll("[0-9]","");
		textoSemNumero2 = c.texto.replaceAll("[0-9]","");
		
		return (textoSemNumero.equals(textoSemNumero2));
	}
	
	public static void Duplicador(int[] intArray){
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = intArray[i]*intArray[i];
		}
	}
}

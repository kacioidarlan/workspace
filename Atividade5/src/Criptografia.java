public class Criptografia {
	public static String Criptografar(String strOriginal) {
		StringBuilder strCriptografada = new StringBuilder(strOriginal);
		if (strOriginal.length() > 0)
		{
			int ascii;
			char caracterCriptgrafado; 
			for (int i = 0; i < strOriginal.length(); i++) {
				ascii = (int)strOriginal.charAt(i);
				caracterCriptgrafado = (char)(ascii+1);
				strCriptografada.setCharAt(i, caracterCriptgrafado);	
			}		
		}
		return strCriptografada.toString();
	}
	
	public static String Descriptografar(String strOriginal) {
		StringBuilder strCriptografada = new StringBuilder(strOriginal);
		if (strOriginal.length() > 0)
		{
			int ascii;
			char caracterCriptgrafado; 
			for (int i = 0; i < strOriginal.length(); i++) {
				ascii = (int)strOriginal.charAt(i);
				caracterCriptgrafado = (char)(ascii-1);
				strCriptografada.setCharAt(i, caracterCriptgrafado);	
			}		
		}
		return strCriptografada.toString();
	}
}

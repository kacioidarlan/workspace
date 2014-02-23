public class mainAeroporto {

	public static void main(String[] args) {
		Aeroporto aeroporto = new Aeroporto("Fortaleza - Pinto Martins");
		Aviao tam = new Aviao("TAN 123", aeroporto);
		Aviao ole = new Aviao("OLÉ 111", aeroporto);
		Aviao linha = new Aviao("LINHA 222", aeroporto);
		
		aeroporto.start();
		tam.start();
		ole.start();
		linha.start();
	}

}

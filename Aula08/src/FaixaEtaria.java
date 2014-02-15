public enum FaixaEtaria {
	BEBE(0, 2), CRIANCA(3, 12), ADOLESCENTE(13, 17), ADULTO(18, 59), IDOSO(60,
			150);
	private int idadeInicial;
	private int idadeFinal;

	FaixaEtaria(int idadeInicial, int idadeFinal) {
		this.idadeInicial = idadeInicial;
		this.idadeFinal = idadeFinal;
	}
	
	public boolean isIdadeCompativel(int idade){
		return (idade >= idadeInicial) && (idade <= idadeFinal);
	}
}
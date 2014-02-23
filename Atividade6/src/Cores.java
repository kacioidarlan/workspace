public enum Cores {
	BRANCO("branco", 21), PRETO("preto", 22), VERMELHO("vermelho", 23), AMARELO(
			"amarelo", 24), AZUL("azul", 25);

	private String nome;
	private Integer codigo;

	private Cores(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}
	
	public String NomeCor(){
		return nome;
	}
	
	public Integer CodigoCor(){
		return codigo;
	}
}

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private Integer idade;
	private char sexo;
	private String empresa;

	public Pessoa(String nome, Integer idade, char sexo, String empresa) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo
				+ ", empresa=" + empresa + "]";
	}

	@Override
	public int compareTo(Pessoa outraPessoa) {
		return this.nome.compareTo(outraPessoa.nome);
	}

}

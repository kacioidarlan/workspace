import java.util.Arrays;

public class Funcionario {
	private String nome;
	private Integer idade;
	private String[] habilidades;
	private String[] filhos;

	public Funcionario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String... habilidades) {
		this.habilidades = habilidades;
	}

	public String[] getFilhos() {
		return filhos;
	}

	public void setFilhos(String... filhos) {
		this.filhos = filhos;
	}

	@Override
	public String toString() {

		String retorno = "----------- Nome Funcionário ----------- \n" + nome
				+ "\n" + "---------------- Idade ----------------- \n" + idade
				+ "\n" + "---------------- Filhos ---------------- \n";
		for (String filho : filhos)
			retorno += filho + "\n";

		retorno += "-------------- Habilidades ------------- \n";
		for (String habilidade : habilidades)
			retorno += habilidade + "\n";

		retorno += "------------- Total Filhos ------------- \n"
				+ filhos.length + "\n"
				+ "---------- Total Habilidades ----------- \n"
				+ habilidades.length + "\n"
				+ "---------------------------------------- \n\n";

		return retorno;
	}

}

public class Contato {
	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String twitter;
	private String linkedin;

	public Contato(String nome, String email, String telefone, String endereco,
			String twitter, String linkedin) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.twitter = twitter;
		this.linkedin = linkedin;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email=" + email + ", telefone="
				+ telefone + ", endereco=" + endereco + ", twitter=" + twitter
				+ ", linkedin=" + linkedin + "]";
	}
	
	public String toStringResumido(){
		      
		return
			   //22/12/2014 22/12/2014 Fazer Atividade Final********Java José das Colves 11 97210 3903
				Util.padRight(nome,20) + " " + telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public int getId() {
		return id;
	}

}

import java.text.SimpleDateFormat;
import java.util.Date;

public class Atividade {
	private int id;
	private Date dataInicio;
	private Date dataFim;
	private String nome;
	private String local;
	
	
	public Atividade(Date dataInicio, Date dataFim, String nome, String local) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nome = nome;
		this.local = local;
	}
	
	
	@Override
	public String toString() {
	 //     		  "Dt. Início Dt. Fim    Nome                         Nome                 Telefone   "
	 //****************22/12/2014 22/12/2014 Fazer Atividade Final     ***Java José das Colves 11 97210 3903
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		return               
				formataData.format(dataInicio) 
				+ " " + formataData.format(dataFim)
				+ " " + nome;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public int getId() {
		return id;
	}
	
	
}

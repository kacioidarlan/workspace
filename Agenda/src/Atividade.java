import java.text.SimpleDateFormat;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "atividades")
public class Atividade {
	public static final String NOME_CAMPO_DATA_INICIO = "DataInicio";
	public static final String NOME_CAMPO_DATA_FIM = "DataFim";
	public static final String NOME_CAMPO_NOME = "Nome";
	public static final String NOME_CAMPO_LOCAL = "Local";
	
	@DatabaseField(generatedId = true)
	private int id;	
	@DatabaseField(columnName = NOME_CAMPO_DATA_INICIO, canBeNull = false)
	private Date dataInicio;
	@DatabaseField(columnName = NOME_CAMPO_DATA_FIM, canBeNull = false)
	private Date dataFim;
	@DatabaseField(columnName = NOME_CAMPO_NOME, canBeNull = false)
	private String nome;
	@DatabaseField(columnName = NOME_CAMPO_LOCAL, canBeNull = true)
	private String local;
	
	
	public Atividade(Date dataInicio, Date dataFim, String nome, String local) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.nome = nome;
		this.local = local;
	}
	public Atividade(){
		
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

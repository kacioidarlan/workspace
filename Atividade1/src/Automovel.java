
public class Automovel {
/*Atributos*/	
	private String cor;
	private String fabricante;
	private String modelo;
	private Boolean flex;
	private String motor;
	private int valor;

/*Propriedades, Getters e Setters*/	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Boolean getFlex() {
		return flex;
	}
	public void setFlex(Boolean flex) {
		this.flex = flex;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}

/*Construtores*/
	/*contrutor padrão sem parâmetros*/
	public Automovel() {

	}
	
	/*contrutor com todos os atributos*/
	public Automovel(String cor, String fabricante, String modelo,
			Boolean flex, String motor, int valor) {
		this.cor = cor;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.flex = flex;
		this.motor = motor;
		this.valor = valor;
	}
	
/*Métodos*/
	public void Ligar(){
		System.out.println("Ligando Automóvel !");
	}
	
	public void Desligar(){
		System.out.println("Desligando Automóvel !");
	}

}

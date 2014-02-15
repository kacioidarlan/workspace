public class Bicicleta {

	private String cor;
	private int velocidade;
	private int marcha;
	private float valor;

	public Bicicleta() {

	}

	public Bicicleta(String cor) {
		this();
		this.cor = cor;
	}

	public Bicicleta(String cor, int velocidade, int marcha, float valor) {
		this(cor);
		this.velocidade = velocidade;
		this.marcha = marcha;
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}
}

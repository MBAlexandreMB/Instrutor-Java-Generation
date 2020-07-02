package projeto1;

public class Carro {
	private String modelo;
	private String cor;
	private String ano;
	private String marca;
	private String chassi;
	private Proprietario proprietario;
	private short velocidadeMaxima;
	private int velocidadeAtual;
	private byte numDePortas;
	private boolean temTetoSolar;
	private byte numDeMarchas;
	private boolean temCambioAutomatico;
	private short volumeDeCombustivel;
	
	public void acelera() {
		this.setVelocidadeAtual(this.getVelocidadeAtual() + 1);
	}
	
	public void freia() {
		this.setVelocidadeAtual(0);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public short getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(short velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public byte getNumDePortas() {
		return numDePortas;
	}
	public void setNumDePortas(byte numDePortas) {
		this.numDePortas = numDePortas;
	}
	public boolean isTemTetoSolar() {
		return temTetoSolar;
	}
	public void setTemTetoSolar(boolean temTetoSolar) {
		this.temTetoSolar = temTetoSolar;
	}
	public byte getNumDeMarchas() {
		return numDeMarchas;
	}
	public void setNumDeMarchas(byte numDeMarchas) {
		this.numDeMarchas = numDeMarchas;
	}
	public boolean isTemCambioAutomatico() {
		return temCambioAutomatico;
	}
	public void setTemCambioAutomatico(boolean temCambioAutomatico) {
		this.temCambioAutomatico = temCambioAutomatico;
	}
	public short getVolumeDeCombustivel() {
		return volumeDeCombustivel;
	}
	public void setVolumeDeCombustivel(short volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}
}

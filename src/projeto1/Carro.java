package projeto1;

public class Carro {
	private String modelo;
	private String cor;
	private String ano;
	private Marca marca;
	private String chassi;
	private Proprietario proprietario;
	private short velocidadeMaxima;
	private int velocidadeAtual;
	private byte numDePortas;
	private boolean temTetoSolar;
	private byte numDeMarchas;
	private boolean temCambioAutomatico;
	private short volumeDeCombustivel;
	private byte marchaAtual;
	
	public Carro(Proprietario proprietario) throws Exception {
		if (proprietario == null) {
			throw new Exception("Proprietario não pode ser nulo!");
		}
		
		this.proprietario = proprietario;
		this.marchaAtual = 0;
		this.velocidadeAtual = 0;
	}
	
	public void acelera() {
		int velFutura = this.getVelocidadeAtual() + 1;
		
		if (velFutura <= this.getVelocidadeMaxima()) {
			this.setVelocidadeAtual(velFutura);
		} else {
			System.out.println("A velocidade máxima já foi atingida!");
		}
	}
	
	public void freia() {
		this.setVelocidadeAtual(0);
		System.out.println("O carro freou (0km/h)!");
	}
	
	public void trocaMarcha(byte novaMarcha) {
		if (novaMarcha <= numDeMarchas && novaMarcha >= -1) {
			if (novaMarcha == -1 && !(this.getVelocidadeAtual() == 0)) {
				System.out.println("Não é possível engatar a marcha ré com a velocidade diferente de 0km/h.");
				return;
			}
			this.setMarchaAtual(novaMarcha);
			
			String message = novaMarcha == -1 ? "Marcha ré foi engatada" : (novaMarcha + "a marcha foi engatada.");
			System.out.println(message);
		} else {
			System.out.println(novaMarcha + "a marcha não existe nesse carro!");
		}
	}
	
	private void _reduzMarcha() {
		byte marchaFutura = (byte) (this.getMarchaAtual() - 1);
		this.trocaMarcha(marchaFutura);
	}
	
	public int calculaAutonomia(int consumoMedioEmKmPorLitro) {
		return this.getVolumeDeCombustivel() * consumoMedioEmKmPorLitro;
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
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
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
	public short getVolumeDeCombustivel() { // Projeto 1, passo 18
		return volumeDeCombustivel;
	}
	public void setVolumeDeCombustivel(short volumeDeCombustivel) {
		this.volumeDeCombustivel = volumeDeCombustivel;
	}
	public byte getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(byte marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
}

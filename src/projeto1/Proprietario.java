package projeto1;

public class Proprietario {
	private String cpf;
	private String nome;
	private String rg;
	private String dataDeNascimento;
	private Endereco endereco;
	// Os atributos abaixo foram substituidos pela classe "Endereço" no passo 12 do projeto 1
	// ---------------------
	//	private String rua;
	//	private String bairro;
	//	private String cidade;
	//	private String estado;
	//	private String cep;
	//	private String complemento;
	// ---------------------

	public Proprietario(String nome, String cpf, String rg) {
		if (nome == "" || !(nome instanceof String)) {
			System.out.println("Nome precisa ser preenchido!");
			return;
		}
		
		if (cpf == "" || !(cpf instanceof String)) {
			System.out.println("CPF precisa ser preenchido!");
			return;
		}
		
		if (rg == "" || !(rg instanceof String)) {
			System.out.println("RG precisa ser preenchido!");
			return;
		}
			
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	// Os getters e setters abaixo foram substituidos pela classe "Endereco" no passo 12 do projeto 1
	// ---------------------
	//	public String getRua() {
	//		return rua;
	//	}
	//	public void setRua(String rua) {
	//		this.rua = rua;
	//	}
	//	public String getBairro() {
	//		return bairro;
	//	}
	//	public void setBairro(String bairro) {
	//		this.bairro = bairro;
	//	}
	//	public String getCidade() {
	//		return cidade;
	//	}
	//	public void setCidade(String cidade) {
	//		this.cidade = cidade;
	//	}
	//	public String getEstado() {
	//		return estado;
	//	}
	//	public void setEstado(String estado) {
	//		this.estado = estado;
	//	}
	//	public String getCep() {
	//		return cep;
	//	}
	//	public void setCep(String cep) {
	//		this.cep = cep;
	//	}
	//	public String getComplemento() {
	//		return complemento;
	//	}
	//	public void setComplemento(String complemento) {
	//		this.complemento = complemento;
	//	}
	// ---------------------
}

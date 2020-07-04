package projeto1;

import java.time.LocalDate;

public class Proprietario {
	private String cpf;
	private String nome;
	private String rg;
	private LocalDate dataDeNascimento;
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

	public Proprietario(String nome, String cpf, String rg, Endereco endereco) throws Exception {
		if (nome == "" || nome == null) {
			throw new RuntimeException("Nome precisa ser preenchido!");
		}
		
		if (cpf == "" || cpf == null) {
			throw new RuntimeException("CPF precisa ser preenchido!");
		}
		
		if (rg == "" || rg == null) {
			throw new RuntimeException("RG precisa ser preenchido!");
		}
		
		if (endereco == null) {
			throw new RuntimeException("Endereco precisa ser uma instância da classe Endereco");
		}
		
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
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
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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

package projeto1;

public class Endereco {
		private String rua;
		private String bairro;
		private String cidade;
		private String estado;
		private String cep;
		private String complemento;
		
		public Endereco(String rua, String bairro, String cidade, String estado, String cep, String complemento) {
			if (rua == "" || !(rua instanceof String)) {
				System.out.println("Rua precisa ser preenchida!");
				return;
			}
			
			if (bairro == "" || !(bairro instanceof String)) {
				System.out.println("Bairro precisa ser preenchido!");
				return;
			}
			
			if (cidade == "" || !(cidade instanceof String)) {
				System.out.println("Cidade precisa ser preenchida!");
				return;
			}
			
			if (estado == "" || !(estado instanceof String)) {
				System.out.println("Estado precisa ser preenchido!");
				return;
			}
			
			if (cep == "" || !(cep instanceof String)) {
				System.out.println("CEP precisa ser preenchido!");
				return;
			}
			
			if (complemento == "" || !(complemento instanceof String)) {
				System.out.println("Complemento precisa ser preenchido!");
				return;
			}
			
			this.rua = rua;
			this.bairro = bairro;
			this.cidade = cidade;
			this.estado = estado;
			this.cep = cep;
			this.complemento = complemento;
		}
		
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) {
			this.rua = rua;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}
		public String getCidade() {
			return cidade;
		}
		public void setCidade(String cidade) {
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) {
			this.cep = cep;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}
}

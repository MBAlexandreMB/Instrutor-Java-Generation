package projeto1;

public class Endereco {
		private String rua;
		private String bairro;
		private String cidade;
		private String estado;
		private String cep;
		private String complemento;
		
		public Endereco(
				String rua, String bairro, String cidade,
				String estado, String cep, String complemento
		) throws Exception {
			if (rua == "" || rua == null) { // ERRO PRECISA DAR THROW, SE VIRA
				throw new Exception("Rua precisa ser preenchida");
			}
			
			if (bairro == "" || bairro == null) {
				throw new Exception("Bairro precisa ser preenchido!");
			}
			
			if (cidade == "" || cidade == null) {
				throw new Exception("Cidade precisa ser preenchida!");
			}
			
			if (estado == "" || estado == null) {
				throw new Exception("Estado precisa ser preenchido!");
			}
			
			if (cep == "" || cep == null) {
				throw new Exception("CEP precisa ser preenchido!");
			}
			
			if (complemento == "" || complemento == null) {
				throw new Exception("Complemento precisa ser preenchido!");
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

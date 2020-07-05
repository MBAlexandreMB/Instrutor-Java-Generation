package projeto1.models;

/**
 * 
 * @author Alexandre Montesso Bonomi
 * @since 02/06/2020
 *
 */

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
			this.setRua(rua);
			this.setBairro(bairro);
			this.setCidade(cidade);
			this.setEstado(estado);
			this.setCep(cep);
			this.setComplemento(complemento);
		}
		
		public String getRua() {
			return rua;
		}
		public void setRua(String rua) throws Exception {
			if (rua == "" || rua == null) {
				throw new RuntimeException("Rua precisa ser preenchida!");
			}
			
			this.rua = rua;
		}
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) throws Exception {
			if (bairro == "" || bairro == null) {
				throw new RuntimeException("Bairro precisa ser preenchido!");
			}
			
			this.bairro = bairro;
		}
		public String getCidade() {			
			return cidade;
		}
		public void setCidade(String cidade) throws Exception {
			if (cidade == "" || cidade == null) {
				throw new RuntimeException("Cidade precisa ser preenchida!");
			}
			
			this.cidade = cidade;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) throws Exception {
			if (estado == "" || estado == null) {
				throw new RuntimeException("Estado precisa ser preenchido!");
			}
			
			this.estado = estado;
		}
		public String getCep() {
			return cep;
		}
		public void setCep(String cep) throws Exception {
			if (cep == "" || cep == null) {
				throw new RuntimeException("CEP precisa ser preenchido!");
			}
			
			this.cep = cep;
		}
		public String getComplemento() {
			return complemento;
		}
		public void setComplemento(String complemento) throws Exception {
			if (complemento == null) {
				throw new RuntimeException("Complemento não pode ser nulo!");
			}
			
			this.complemento = complemento;
		}
}

package projeto1.models;

/**
 * 
 * @author Alexandre Montesso Bonomi
 * @since 02/06/2020
 *
 */

public class Marca {
	private String nome;
	private short nrDeModelos;
	private short anoDeLancamento;
	private int codId;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws Exception {
		if (nome == null) {
			throw new RuntimeException("Nome não pode ser nulo!");
		}
		
		this.nome = nome;
	}
	public short getNrDeModelos() {
		return nrDeModelos;
	}
	public void setNrDeModelos(short nrDeModelos) {
		this.nrDeModelos = nrDeModelos;
	}
	public short getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public void setAnoDeLancamento(short anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}
	public int getCodId() {
		return codId;
	}
	public void setCodId(int codId) {
		this.codId = codId;
	}
}

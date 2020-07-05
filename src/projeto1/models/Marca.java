package projeto1.models;

public class Marca {
	private String nome;
	private short nrDeModelos;
	private short anoDeLancamento;
	private int codId;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
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

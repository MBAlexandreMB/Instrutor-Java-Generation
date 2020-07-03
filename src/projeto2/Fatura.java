package projeto2;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantComprada;
	private double precoItem;
	
	public Fatura(String numero, String descricao, int quantComprada, double precoItem) {
		this.setNumero(numero);
		this.setDescricao(descricao);
		this.setQuantComprada(quantComprada);
		this.setPrecoItem(precoItem);
	}
	
	public double getTotalFatura() {
		double total = this.getPrecoItem() * this.getQuantComprada();
		return total > 0 ? total : 0.0;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantComprada() {
		return quantComprada;
	}
	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}
	public double getPrecoItem() {
		return precoItem;
	}
	public void setPrecoItem(double precoItem) {
		if (precoItem < 0) {
			precoItem = 0.0;
		}
		
		this.precoItem = precoItem;
	}
	
	
}

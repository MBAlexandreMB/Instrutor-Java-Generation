package projeto3;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	private static int numDeEmpregados = 0;
	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setSalarioMensal(salarioMensal);
		Empregado.numDeEmpregados++;
	}
	
	public void receberAumento(double aumentoEmPercentual) {
		this.setSalarioMensal(this.getSalarioMensal() * (1 + aumentoEmPercentual));
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	public int getNumDeEmpregados() {
		return numDeEmpregados;
	}
}

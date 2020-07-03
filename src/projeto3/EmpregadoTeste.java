package projeto3;

public class EmpregadoTeste {
	public static void main(String[] args) {
		Empregado empregado1 = new Empregado("João", "Arruda", 5000.00);
		Empregado empregado2 = new Empregado("Maria", "Eclesiana", 6000.00);
		
		System.out.printf("%s %s recebe R$%.2f por mês%n", 
				empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioMensal());
		System.out.printf("%s %s recebe R$%.2f por mês%n", 
				empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioMensal());
		
		empregado1.receberAumento(0.1);
		empregado2.receberAumento(0.1);
		
		System.out.printf("Após o aumento, %s %s recebe R$%.2f por mês%n", 
				empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioMensal());
		System.out.printf("Após o aumento, %s %s recebe R$%.2f por mês%n", 
				empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioMensal());
	}
}

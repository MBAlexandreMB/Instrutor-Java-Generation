package projeto4;

public class InteiroSet {
	
	private boolean[] conjunto;
	
	public InteiroSet() {
		conjunto = new boolean[101];
	}
	
	static boolean[] union(boolean[] cj1, boolean[] cj2) {
		boolean[] resposta = new boolean[101];
		
		for (int i = 0; i < 101; i++) {
			resposta[i] = cj1[i] || cj2[i];
		}
		
		return resposta;
	}
	
	static boolean[] intersection(boolean[] cj1, boolean[] cj2) {
		boolean[] resposta = new boolean[101];
		
		for (int i = 0; i < 101; i++) {
			resposta[i] = cj1[i] && cj2[i];
		}
		
		return resposta;
	}
	
	public void insereElemento(int elemento) {
		if (elemento >= 0 && elemento <= 100) {
			this.conjunto[elemento] = true;
		}
	}
	
	public boolean[] getConjunto() {
		return this.conjunto;
	}
	
	public static void main(String[] args) {
		InteiroSet cj1 = new InteiroSet();
		InteiroSet cj2 = new InteiroSet();
		cj2.insereElemento(5);
		cj2.insereElemento(90);
		cj1.insereElemento(90);

		boolean[] resultado = InteiroSet.intersection(cj1.getConjunto(), cj2.getConjunto());
		System.out.println(resultado[4]);
		System.out.println(resultado[5]);
		System.out.println(resultado[90]);
	}
}

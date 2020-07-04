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
	
	public void deleteElemento(int elemento) {
		if (elemento >= 0 && elemento <= 100) {
			this.conjunto[elemento] = false;
		}
	}
	
	public String toSetString() {
		String resposta = "";
		
		for (int i = 0; i < 101; i++) {
			if (this.conjunto[i]) {
				resposta += " " + i;				
			}
		}
		
		if (resposta == "") {
			resposta = "-";
		}
		
		return resposta.trim();
	}
	
	public static boolean ehIgualTo(boolean[] cj1, boolean[] cj2) {
		for (int i = 0; i < 101; i++) {
			if (cj1[i] != cj2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean[] getConjunto() {
		return this.conjunto;
	}
}

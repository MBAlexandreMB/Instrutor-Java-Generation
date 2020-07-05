package projeto4;

public class InteiroSet {
	
	private boolean[] conjunto;
	private static final int[] INTERVALO = {0, 100};
	private static final int TAMANHO = getTamanhoConjunto();
	
	public InteiroSet() {
		conjunto = new boolean[TAMANHO];
	}
	
	static boolean[] union(boolean[] cj1, boolean[] cj2) {
		boolean[] resposta = new boolean[TAMANHO];
		
		for (int i = 0; i < TAMANHO; i++) {
			resposta[i] = cj1[i] || cj2[i];
		}
		
		return resposta;
	}
	
	static boolean[] intersection(boolean[] cj1, boolean[] cj2) {
		boolean[] resposta = new boolean[TAMANHO];
		
		for (int i = 0; i < TAMANHO; i++) {
			resposta[i] = cj1[i] && cj2[i];
		}
		
		return resposta;
	}
	
	public void insereElemento(int elemento) {
		if (elemento >= INTERVALO[0] && elemento <= INTERVALO[1]) {
			this.conjunto[indexReal(elemento)] = true;
		}
	}
	
	public void deleteElemento(int elemento) {
		if (elemento >= INTERVALO[0] && elemento <= INTERVALO[1]) {
			this.conjunto[indexReal(elemento)] = false;
		}
	}
	
	public static String toSetString(boolean[] conjunto) {
		String resposta = "";
		
		for (int i = 0; i < TAMANHO; i++) {
			if (conjunto[i]) {
				resposta += " " + indexReal(i);				
			}
		}
		
		if (resposta == "") {
			resposta = "-";
		}
		
		return resposta.trim();
	}
	
	public static boolean ehIgualTo(boolean[] cj1, boolean[] cj2) {
		for (int i = 0; i < TAMANHO; i++) {
			if (cj1[i] != cj2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean[] getConjunto() {
		return this.conjunto;
	}
	
	private static void setIntervalo() {
		INTERVALO[0] = Math.min(INTERVALO[0], INTERVALO[1]);
		INTERVALO[1] = Math.max(INTERVALO[0], INTERVALO[1]);
	}
	
	public static int getTamanhoConjunto() {
		setIntervalo();
		return INTERVALO[1] - INTERVALO[0] + 1; 
	}
	
	public static int indexReal(int inteiro) {
		return inteiro - INTERVALO[0];
	}
}

package projeto2;

/**
 * 
 * @author Alexandre Montesso Bonomi
 * @since 02/06/2020
 *
 */

public class FaturaTeste {
	public static void main(String[] args) throws Exception {
		Fatura novaFatura = new Fatura("1", "Mouse optico", 3, 15.5);
		
		System.out.println("Fatura:");
		System.out.printf("Número: %s%n", novaFatura.getNumero());
		System.out.printf("Descrição: %s%n", novaFatura.getDescricao());
		System.out.printf("Quantidade: %d%n", novaFatura.getQuantComprada());
		System.out.printf("Preço unitário: R$%.2f%n", novaFatura.getPrecoItem());
		System.out.println("----------------");
		System.out.printf("Total: R$%.2f%n%n", novaFatura.getTotalFatura());
		
		System.out.println("Agora tentando com um preço negativo");
		Fatura novaFatura2 = new Fatura("2", "Teclado", 10, -2.5);
		System.out.println("Fatura:");
		System.out.printf("Número: %s%n", novaFatura2.getNumero());
		System.out.printf("Descrição: %s%n", novaFatura2.getDescricao());
		System.out.printf("Quantidade: %d%n", novaFatura2.getQuantComprada());
		System.out.printf("Preço unitário: R$%.2f%n", novaFatura2.getPrecoItem());
		System.out.println("----------------");
		System.out.printf("Total: R$%.2f%n%n", novaFatura2.getTotalFatura());
		
		System.out.println("Agora tentando com uma quantidade negativa");
		novaFatura2.setPrecoItem(2.5);
		novaFatura2.setQuantComprada(-10);
		System.out.println("Fatura:");
		System.out.printf("Número: %s%n", novaFatura2.getNumero());
		System.out.printf("Descrição: %s%n", novaFatura2.getDescricao());
		System.out.printf("Quantidade: %d%n", novaFatura2.getQuantComprada());
		System.out.printf("Preço unitário: R$%.2f%n", novaFatura2.getPrecoItem());
		System.out.println("----------------");
		System.out.printf("Total: R$%.2f%n%n", novaFatura2.getTotalFatura());
	}
}

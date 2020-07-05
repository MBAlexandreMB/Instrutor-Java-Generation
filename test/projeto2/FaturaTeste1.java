package projeto2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FaturaTeste1 {
	Fatura novaFatura;
	
	@BeforeEach
	public void criaObjetosParaTestes() {
		try {
			novaFatura = new Fatura("1T", "descricao1", 2, 10);			
		} catch (Exception e) {
			fail("Falha ao criar fatura: " + e);
		}
	}
	
	@Test
	@DisplayName("É possível gerar uma nova fatura")
	void devePoderGerarUmaFatura() {
		try {
			Fatura fatura = new Fatura("1", "d", 1, 1);
			assertTrue(fatura instanceof Fatura);
		} catch (Exception e) {
			fail("Erro ao gerar fatura:" + e);
		}
	}
	

	@Test
	@DisplayName("Número da fatura não pode ser vazio")
	void numeroDeFaturaNaoPodeSerVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Fatura("", "d", 1, 1)
		);
		
		assertEquals(exception.getMessage(), "É necessário informar um número de fatura!");
	}
	
	@Test
	@DisplayName("Número da fatura não pode ser nulo")
	void numeroDeFaturaNaoPodeSerNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Fatura(null, "d", 1, 1)
		);
		
		assertEquals(exception.getMessage(), "É necessário informar um número de fatura!");
	}
	
	@Test
	@DisplayName("Descrição da fatura não pode ser vazia")
	void descricaoDeFaturaNaoPodeSerVazia() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Fatura("1", "", 1, 1)
		);
		
		assertEquals(exception.getMessage(), "É necessário informar uma descrição para a fatura!");
	}
	
	@Test
	@DisplayName("Descrição da fatura não pode ser nula")
	void descricaoDeFaturaNaoPodeSerNula() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Fatura("1", null, 1, 1)
		);
		
		assertEquals(exception.getMessage(), "É necessário informar uma descrição para a fatura!");
	}
	
	@Test
	@DisplayName("Um preço negativo deve ser salvo como 0.0")
	void deveSalvarPrecosNegativosComoZero() {
		novaFatura.setPrecoItem(-10);
		assertEquals(0.0, novaFatura.getPrecoItem());
	}
	
	@Test
	@DisplayName("Uma quantidade pode ser negativa")
	void deveSalvarQuantidadesNegativas() {
		novaFatura.setQuantComprada(-10);
		assertEquals(-10, novaFatura.getQuantComprada());
	}
	
	@Test
	@DisplayName("Deve calcular o valor total da fatura")
	void deveCalcularTotalFatura() {
		assertEquals(20.0, novaFatura.getTotalFatura());
	}
	
	@Test
	@DisplayName("Uma fatura com valor negativo deve retornar 0.0")
	void deveRetornarZeroParaFaturasNegativas() {
		novaFatura.setQuantComprada(-10);
		novaFatura.setPrecoItem(2);
		assertEquals(0.0, novaFatura.getTotalFatura());
	}
	
	@Test
	@DisplayName("Pode alterar o número da fatura")
	void devePoderAlterarNumero() {
		try {
			novaFatura.setNumero("2F");
			assertEquals("2F", novaFatura.getNumero());
		} catch (Exception e) {
			fail("Erro ao alterar número da fatura: " + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para número vazio")
	void naoDevePoderAlterarParaNumeroVazio() {
		Exception exception = assertThrows(RuntimeException.class, () -> novaFatura.setNumero(""));
		assertEquals(exception.getMessage(), "É necessário informar um número de fatura!");
	}
	
	@Test
	@DisplayName("Não pode alterar para número nulo")
	void naoDevePoderAlterarParaNumeroNulo() {
		Exception exception = assertThrows(RuntimeException.class, () -> novaFatura.setNumero(null));
		assertEquals(exception.getMessage(), "É necessário informar um número de fatura!");
	}
	
	@Test
	@DisplayName("Pode alterar a descrição da fatura")
	void devePoderAlterarDescricao() {
		try {
			novaFatura.setDescricao("d2");
			assertEquals("d2", novaFatura.getDescricao());
		} catch (Exception e) {
			fail("Erro ao alterar descricao da fatura: " + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para descrição vazia")
	void naoDevePoderAlterarParaDescricaoVazia() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novaFatura.setDescricao("")
		);
		assertEquals(exception.getMessage(), "É necessário informar uma descrição para a fatura!");
	}
	
	@Test
	@DisplayName("Não pode alterar para número nulo")
	void naoDevePoderAlterarParaDescricaoNula() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novaFatura.setDescricao(null)
		);
		assertEquals(exception.getMessage(), "É necessário informar uma descrição para a fatura!");
	}
}

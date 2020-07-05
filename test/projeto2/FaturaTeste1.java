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
	@DisplayName("Número e descrição da fatura não podem ser vazios ou nulos")
	void naoDeveInstanciarFaturaSemAtributosObrigatorios() {
		Exception exceptionNum = assertThrows(
				RuntimeException.class,
				() -> new Fatura("", "d", 1, 1)
		);
		Exception exceptionNumNull = assertThrows(
				RuntimeException.class,
				() -> new Fatura(null, "d", 1, 1)
		);
		
		Exception exceptionDesc = assertThrows(
				RuntimeException.class,
				() -> new Fatura("1", "", 1, 1)
		);		
		Exception exceptionDescNull = assertThrows(
				RuntimeException.class,
				() -> new Fatura("1", null, 1, 1)
		);
		
		assertEquals(exceptionNum.getMessage(), "É necessário informar um número de fatura!");
		assertEquals(exceptionNumNull.getMessage(), "É necessário informar um número de fatura!");
		
		assertEquals(exceptionDesc.getMessage(), "É necessário informar uma descrição para a fatura!");
		assertEquals(exceptionDescNull.getMessage(), "É necessário informar uma descrição para a fatura!");
	}
	
	@Test
	@DisplayName("Um preço negativo deveria ser salvo como 0.0")
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
	@DisplayName("Deveria calcular o valor total da fatura")
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

}

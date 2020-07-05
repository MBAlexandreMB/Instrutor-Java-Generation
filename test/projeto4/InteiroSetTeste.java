package projeto4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InteiroSetTeste {
	InteiroSet set1;
	InteiroSet set2;
	
	@BeforeEach
	public void criaObjetosParaTeste() {
		try {
			set1 = new InteiroSet();
			set2 = new InteiroSet();
		} catch (Exception e) {
			fail("Falha ao criar objetos: " + e);
		}
	}
	
	@Test
	@DisplayName("É possível instanciar um novo InteiroSet")
	void devePoderInstanciarNovoIntieroSet() {
		try {
			InteiroSet inteiroSet = new InteiroSet();
			assertTrue(inteiroSet instanceof InteiroSet);
		} catch (Exception e) {
			fail("Erro ao gerar InteiroSet:" + e);
		}
	}
	
	@Test
	@DisplayName("É possível inserir um inteiro em um conjunto")
	void deveInserirInteiroNoConjunto() {
		set1.insereElemento(0);
		assertTrue(set1.getConjunto()[0]);
	}
	
	@Test
	@DisplayName("É possível remover um inteiro em um conjunto")
	void deveRemoverInteiroNoConjunto() {
		set1.insereElemento(0);
		assertTrue(set1.getConjunto()[0]);
		
		set1.deleteElemento(0);
		assertFalse(set1.getConjunto()[0]);
	}
	
	@Test
	@DisplayName("É possível unir dois conjuntos")
	void deveUnirDoisConjuntos() {
		set1.insereElemento(0);
		set1.insereElemento(2);
		boolean[] resposta = InteiroSet.union(set1.getConjunto(), set2.getConjunto());
		
		assertTrue(resposta[0]);
		assertFalse(resposta[1]);
		assertTrue(resposta[2]);
		assertFalse(resposta[35]);
	}
	
	@Test
	@DisplayName("É possível criar a intersecção de dois conjuntos")
	void deveFazerAInterseccaoDeDoisConjuntos() {
		set1.insereElemento(0);
		set2.insereElemento(0);
		
		set1.insereElemento(90);
		set2.insereElemento(90);
		
		set1.insereElemento(2);
		
		boolean[] resposta = InteiroSet.intersection(set1.getConjunto(), set2.getConjunto());
		
		assertTrue(resposta[0]);
		assertFalse(resposta[1]);
		assertFalse(resposta[2]);
		assertFalse(resposta[35]);
		assertTrue(resposta[90]);
	}
	
	@Test
	@DisplayName("Retorna uma string como uma lista de números separados por espaço")
	void deveRetornarStringComNumerosDoConjunto() {
		set1.insereElemento(0);
		set1.insereElemento(2);
		
		assertEquals("0 2", InteiroSet.toSetString(set1.getConjunto()));
	}
	
	@Test
	@DisplayName("Retorna '-' se o conjunto estiver vazio")
	void deveRetornarTracoSeConjuntoVazio() {		
		assertEquals("-", InteiroSet.toSetString(set1.getConjunto()));
	}
	
	@Test
	@DisplayName("Deve verificar que dois conjuntos são iguais")
	void deveVerificarQueDoisConjuntosSaoIguais() {
		assertTrue(InteiroSet.ehIgualTo(set1.getConjunto(), set2.getConjunto()));
	}
	
	@Test
	@DisplayName("Deve verificar que dois conjuntos são diferentes")
	void deveVerificarQueDoisConjuntosSaoDiferentes() {
		set1.insereElemento(0);
		assertFalse(InteiroSet.ehIgualTo(set1.getConjunto(), set2.getConjunto()));
	}
}

package projeto1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projeto1.models.Marca;

class MarcaTeste {
	Marca novaMarca;
	
	@BeforeEach
	public void criaObjetosParaTestes() {
		try {
			novaMarca = new Marca();
		} catch (Exception e) {
			System.out.println("Falha na criação: " + e.getMessage());
		}
	}
	
	@Test
	@DisplayName("É possível instanciar uma nova marca")
	void instanciaUmNovoEndereco() {
		try {
			Marca marca = new Marca();
			assertTrue(marca instanceof Marca);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	@DisplayName("É possível alterar nome")
	void devePoderAlterarNome() {
		try {
			novaMarca.setNome("nome1");
			assertEquals("nome1", novaMarca.getNome());
		} catch (Exception e) {
			fail("Erro ao alterar nome:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para nome nulo")
	void naoDeveAlterarParaNomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novaMarca.setNome(null)
		);
		assertEquals(exception.getMessage(), "Nome não pode ser nulo!");
	}
	
	@Test
	@DisplayName("É possível alterar AnoDeLancamento")
	void devePoderAlterarAnoDeLancamento() {
		novaMarca.setAnoDeLancamento((short) 1900);
		assertEquals(1900, novaMarca.getAnoDeLancamento());
	}
	
	@Test
	@DisplayName("É possível alterar CodId")
	void devePoderAlterarCodId() {
		novaMarca.setCodId(1);
		assertEquals(1, novaMarca.getCodId());
	}
	
	@Test
	@DisplayName("É possível alterar NrDeModelos")
	void devePoderAlterarNrDeModelos() {
		novaMarca.setNrDeModelos((short) 10);
		assertEquals(10, novaMarca.getNrDeModelos());
	}
}

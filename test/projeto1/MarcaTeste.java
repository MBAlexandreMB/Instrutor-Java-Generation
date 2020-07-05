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
	@DisplayName("É possível alterar os dados de uma Marca")
	void devePoderAlterarDadosDoEndereco() {
		novaMarca.setNome("nomeDaMarca");
		assertEquals("nomeDaMarca", novaMarca.getNome());
		
		novaMarca.setAnoDeLancamento((short) 1900);
		assertEquals(1900, novaMarca.getAnoDeLancamento());
		
		novaMarca.setCodId(1);
		assertEquals(1, novaMarca.getCodId());
		
		novaMarca.setNrDeModelos((short) 10);
		assertEquals(10, novaMarca.getNrDeModelos());
	}
}

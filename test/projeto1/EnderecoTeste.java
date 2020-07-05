package projeto1;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projeto1.models.Endereco;

class EnderecoTeste {
	Endereco novoEndereco;
	
	@BeforeEach
	public void criaObjetosParaTestes() {
		try {
			novoEndereco = new Endereco("1", "2", "3", "4", "5", "6");
		} catch (Exception e) {
			System.out.println("Falha na criação: " + e.getMessage());
		}
	}
	
	@Test
	@DisplayName("É possível instanciar um novo endereco")
	void instanciaUmNovoEndereco() {
		try {
			
			Endereco endereco = new Endereco("rua1", "bairro2", "cidade3", "estado4", "cep5", "comp6");
			assertTrue(endereco instanceof Endereco);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@DisplayName("Os atributos do endereco são obrigatórios")
	void falhaSeInstanciaSemAtributosObrigatorios() {
		Exception exceptionRua = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("", "b", "c", "d", "e", "f")
		);
		
		Exception exceptionBairro = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "", "c", "d", "e", "f")
		);
		
		Exception exceptionCidade = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "", "d", "e", "f")
		);
		
		Exception exceptionEstado = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "", "e", "f")
		);
		
		Exception exceptionCep = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "d", "", "f")
		);
		
		assertEquals(exceptionRua.getMessage(), "Rua precisa ser preenchida!");
		assertEquals(exceptionBairro.getMessage(), "Bairro precisa ser preenchido!");
		assertEquals(exceptionCidade.getMessage(), "Cidade precisa ser preenchida!");
		assertEquals(exceptionEstado.getMessage(), "Estado precisa ser preenchido!");
		assertEquals(exceptionCep.getMessage(), "CEP precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Complemento pode ser '', mas não pode ser nulo")
	void falhaSeInstanciaComComplementoNulo() {
		try {
			Endereco compVazio = new Endereco("a", "b", "c", "d", "e", "");			
			assertEquals("", compVazio.getComplemento());
		} catch (Exception e) {
			fail("Falha ao criar endereço com complemento vazio: ", e);
		}
		
		Exception exceptionNulo = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "d", "e", null)
		);
		
		assertEquals(exceptionNulo.getMessage(), "Complemento não pode ser nulo!");
	}
	
	@Test
	@DisplayName("É possível alterar os dados de um endereco")
	void devePoderAlterarDadosDoEndereco() {
		try {
			novoEndereco.setRua("rua1");
			assertEquals("rua1", novoEndereco.getRua());
		} catch (Exception e) {
			fail("Erro ao alterar rua:", e);
		}
		
		try {
			novoEndereco.setBairro("bairro1");
			assertEquals("bairro1", novoEndereco.getBairro());	
		} catch (Exception e) {
			fail("Erro ao alterar bairro:", e);
		}

		try {
			novoEndereco.setCidade("cidade1");
			assertEquals("cidade1", novoEndereco.getCidade());
		} catch (Exception e) {
			fail("Erro ao alterar cidade:", e);
		}
		
		try {
			novoEndereco.setEstado("estado1");
			assertEquals("estado1", novoEndereco.getEstado());
		} catch (Exception e) {
			fail("Erro ao alterar estado:", e);
		}
		
		try {
			novoEndereco.setCep("cep1");
			assertEquals("cep1", novoEndereco.getCep());
		} catch (Exception e) {
			fail("Erro ao alterar cep:", e);
		}

		try {
			novoEndereco.setComplemento("comp1");
			assertEquals("comp1", novoEndereco.getComplemento());	
		} catch (Exception e) {
			fail("Erro ao alterar complemento:", e);
		}
	}
}

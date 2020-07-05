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
			
			Endereco endereco = new Endereco(
					"rua1", "bairro2", "cidade3",
					"estado4", "cep5", "comp6"
			);
			assertTrue(endereco instanceof Endereco);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	@DisplayName("O atributo rua não pode ser vazio")
	void falhaSeInstanciaComRuaVazia() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("", "b", "c", "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Rua precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("O atributo rua não pode ser nulo")
	void falhaSeInstanciaComRuaNula() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco(null, "b", "c", "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Rua precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("O atributo bairro não pode ser vazio")
	void falhaSeInstanciaComBairroVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "", "c", "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Bairro precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("O atributo bairro não pode ser nulo")
	void falhaSeInstanciaComBairroNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", null, "c", "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Bairro precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("O atributo cidade não pode ser vazio")
	void falhaSeInstanciaComCidadeVazia() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "", "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Cidade precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("O atributo cidade não pode ser nulo")
	void falhaSeInstanciaComCidadeNula() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", null, "d", "e", "f")
		);
		assertEquals(exception.getMessage(), "Cidade precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("O atributo estado não pode ser vazio")
	void falhaSeInstanciaComEstadoVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "", "e", "f")
		);
		assertEquals(exception.getMessage(), "Estado precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("O atributo estado não pode ser nulo")
	void falhaSeInstanciaComEstadoNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", null, "e", "f")
		);
		assertEquals(exception.getMessage(), "Estado precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("O atributo CEP não pode ser vazio")
	void falhaSeInstanciaComCepVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "d", "", "f")
		);
		assertEquals(exception.getMessage(), "CEP precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("O atributo CEP não pode ser nulo")
	void falhaSeInstanciaComCepNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Endereco("a", "b", "c", "d", null, "f")
		);
		assertEquals(exception.getMessage(), "CEP precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Complemento pode ser vazio, mas não pode ser nulo")
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
	@DisplayName("Deve alterar a rua")
	void devePoderAlterarRua() {
		try {
			novoEndereco.setRua("rua3");			
		} catch (Exception e) {
			fail("Erro ao tentar alterar rua:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para rua vazia")
	void naoDeveAlterarParaRuaVazia() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setRua("")
		);
		assertEquals(exception.getMessage(), "Rua precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("Não pode alterar para rua nula")
	void naoDeveAlterarParaRuaNula() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setRua(null)
		);
		assertEquals(exception.getMessage(), "Rua precisa ser preenchida!");
	}

	@Test
	@DisplayName("Deve alterar o bairro")
	void devePoderAlterarBairro() {
		try {
			novoEndereco.setBairro("bairro3");			
		} catch (Exception e) {
			fail("Erro ao tentar alterar estado:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para bairro vazio")
	void naoDeveAlterarParaBairroVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setBairro("")
		);
		assertEquals(exception.getMessage(), "Bairro precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar para bairro nulo")
	void naoDeveAlterarParaBairroNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setBairro(null)
		);
		assertEquals(exception.getMessage(), "Bairro precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Deve alterar a cidade")
	void devePoderAlterarCidade() {
		try {
			novoEndereco.setCidade("cidade3");			
		} catch (Exception e) {
			fail("Erro ao tentar alterar cidade:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para cidade vazia")
	void naoDeveAlterarParaCidadeVazia() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setCidade("")
		);
		assertEquals(exception.getMessage(), "Cidade precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("Não pode alterar para cidade nula")
	void naoDeveAlterarParaCidadeNula() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setCidade(null)
		);
		assertEquals(exception.getMessage(), "Cidade precisa ser preenchida!");
	}
	
	@Test
	@DisplayName("Deve alterar o estado")
	void devePoderAlterarEstado() {
		try {
			novoEndereco.setEstado("estado3");			
		} catch (Exception e) {
			fail("Erro ao tentar alterar estado:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para estado vazio")
	void naoDeveAlterarParaEstadoVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setEstado("")
		);
		assertEquals(exception.getMessage(), "Estado precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar para estado nulo")
	void naoDeveAlterarParaEstadoNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setEstado(null)
		);
		assertEquals(exception.getMessage(), "Estado precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Deve alterar o CEP")
	void devePoderAlterarCep() {
		try {
			novoEndereco.setCep("cep3");			
		} catch (Exception e) {
			fail("Erro ao tentar alterar CEP:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar para CEP vazio")
	void naoDeveAlterarParaCepVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setCep("")
		);
		assertEquals(exception.getMessage(), "CEP precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar para CEP nulo")
	void naoDeveAlterarParaCepNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> novoEndereco.setCep(null)
		);
		assertEquals(exception.getMessage(), "CEP precisa ser preenchido!");
	}
}

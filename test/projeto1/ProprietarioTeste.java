package projeto1;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import projeto1.models.Endereco;
import projeto1.models.Proprietario;

class ProprietarioTeste {
	Endereco novoEndereco;
	Proprietario novoProprietario;
	
	@BeforeEach
	public void criaObjetosParaTestes() {
		try {
			novoEndereco = new Endereco("1", "2", "3", "4", "5", "6");
			novoProprietario = new Proprietario("a", "b", "c", novoEndereco);
		} catch (Exception e) {
			System.out.println("Falha na criação: " + e.getMessage());
		}
	}

	@Test
	@DisplayName("É possível instanciar um novo proprietário")
	void instanciaUmNovoProprietario() {
		try {
			
			Proprietario proprietario = new Proprietario("a", "b", "c", novoEndereco);
			assertTrue(proprietario instanceof Proprietario);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	@DisplayName("O endereço do proprietário não pode ser nulo")
	void falhaSeInstanciaSemProprietario() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "b", "c", null)
		);
		
		assertEquals(exception.getMessage(), "Endereco precisa ser uma instância da classe Endereco");
	}
	
	@Test
	@DisplayName("Nome não pode ser vazio ao instanciar")
	void falhaSeInstanciaComNomeVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("", "b", "c", novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "Nome precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Nome não pode ser nulo ao instanciar")
	void falhaSeInstanciaComNomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario(null, "b", "c", novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "Nome precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("CPF não pode ser vazio ao instanciar")
	void falhaSeInstanciaComCpfVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "", "c", novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "CPF precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("CPF não pode ser nulo ao instanciar")
	void falhaSeInstanciaComCpfNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", null, "c", novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "CPF precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("RG não pode ser vazio ao instanciar")
	void falhaSeInstanciaComRgVazio() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "b", "", novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "RG precisa ser preenchido!");
	}

	@Test
	@DisplayName("RG não pode ser nulo ao instanciar")
	void falhaSeInstanciaComRgNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "b", null, novoEndereco)
		);
		
		assertEquals(exception.getMessage(), "RG precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("É possível alterar nome")
	void devePoderAlterarNome() {
		try {
			novoProprietario.setNome("nome2");
			assertEquals("nome2", novoProprietario.getNome());
		} catch (Exception e) {
			fail("Erro ao alterar nome: " + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar nome para vazio")
	void naoDevePoderAlterarNomeParaVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setNome("")
		);
			
		assertEquals(exception.getMessage(), "Nome precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar nome para nulo")
	void naoDevePoderAlterarNomeParaNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setNome(null)
		);
			
		assertEquals(exception.getMessage(), "Nome precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("É possível alterar CPF")
	void devePoderAlterarCpf() {
		try {
			novoProprietario.setCpf("321");
			assertEquals("321", novoProprietario.getCpf());
		} catch (Exception e) {
			fail("Erro ao alterar CPF: " + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar CPF para vazio")
	void naoDevePoderAlterarCpfParaVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setCpf("")
		);
			
		assertEquals(exception.getMessage(), "CPF precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar CPF para nulo")
	void naoDevePoderAlterarCpfParaNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setCpf(null)
		);
			
		assertEquals(exception.getMessage(), "CPF precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("É possível alterar RG")
	void devePoderAlterarRg() {
		try {
			novoProprietario.setRg("321");
			assertEquals("321", novoProprietario.getRg());
		} catch (Exception e) {
			fail("Erro ao alterar RG: " + e);
		}
	}
	
	@Test
	@DisplayName("Não pode alterar RG para vazio")
	void naoDevePoderAlterarRgParaVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setRg("")
		);
			
		assertEquals(exception.getMessage(), "RG precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("Não pode alterar RG para nulo")
	void naoDevePoderAlterarRgParaNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setRg(null)
		);
			
		assertEquals(exception.getMessage(), "RG precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("É possível adicionar a data de nascimento")
	void devePoderAdicionarDataDeNascimento() {
		try {
			LocalDate dataNascimento = LocalDate.of(1991, 10, 4);
			novoProprietario.setDataDeNascimento(dataNascimento);
			assertEquals(LocalDate.of(1991, 10, 4), novoProprietario.getDataDeNascimento());
		} catch (Exception e) {
			fail("Erro ao alterar data de nascimento: " + e);
		}
	}
	
	@Test
	@DisplayName("Data de nascimento não pode ser nula")
	void naoDevePoderAdicionarDataDeNascimentoNula() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> novoProprietario.setDataDeNascimento(null)
		);
			
		assertEquals(exception.getMessage(), "Data de nascimento não pode ser nula!");
	}
}

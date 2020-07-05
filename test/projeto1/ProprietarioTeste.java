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
	@DisplayName("O endereço do proprietário não pode ser vazio")
	void falhaSeInstanciaSemProprietario() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "b", "c", null)
		);
		
		assertEquals(exception.getMessage(), "Endereco precisa ser uma instância da classe Endereco");
	}

	@Test
	@DisplayName("Os atributos nome, cpf e rg são obrigatórios")
	void falhaSeInstanciaSemAtributosObrigatorios() {
		Exception exceptionNome = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("", "b", "c", novoEndereco)
		);
		
		Exception exceptionCpf = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "", "c", novoEndereco)
		);
		
		Exception exceptionRg = assertThrows(
				RuntimeException.class, 
				() -> new Proprietario("a", "b", "", novoEndereco)
		);
		
		assertEquals(exceptionNome.getMessage(), "Nome precisa ser preenchido!");
		assertEquals(exceptionCpf.getMessage(), "CPF precisa ser preenchido!");
		assertEquals(exceptionRg.getMessage(), "RG precisa ser preenchido!");
	}
	
	@Test
	@DisplayName("É possível alterar os dados de um proprietario")
	void devePoderAlterarDadosDoProprietario() {
		try {
			novoProprietario.setCpf("cpf1");
			assertEquals("cpf1", novoProprietario.getCpf());
		} catch (Exception e) {
			fail("Erro ao alterar CPF: " + e);
		}
		
		try {
			LocalDate dataNascimento = LocalDate.of(1991, 10, 4);
			novoProprietario.setDataDeNascimento(dataNascimento);
			assertEquals(LocalDate.of(1991, 10, 4), novoProprietario.getDataDeNascimento());
		} catch (Exception e) {
			fail("Erro ao alterar data de nascimento: " + e);
		}

		try {
			novoProprietario.setNome("nome1");
			assertEquals("nome1", novoProprietario.getNome());
		} catch (Exception e) {
			fail("Erro ao alterar Nome: " + e);
		}
		
		try {
			novoProprietario.setRg("rg1");
			assertEquals("rg1", novoProprietario.getRg());
		} catch (Exception e) {
			fail("Erro ao alterar RG: " + e);
		}
		
		try {
			Endereco endereco1 = new Endereco("rua1", "bairro1", "cidade1", "estado1", "cep1", "comp1");			
			novoProprietario.setEndereco(endereco1);
			assertSame(endereco1, novoProprietario.getEndereco());
		} catch (Exception e) {
			fail("Não foi possível criar um novo endereço");
		}
	}
}

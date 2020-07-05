package projeto3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmpregadoTeste1 {
	Empregado empregado1;
	Empregado empregado2;
	
	@BeforeEach
	public void criaObjetosParaTeste() {
		try {
			empregado1 = new Empregado("João", "Arruda", 5000.00);
			empregado2 = new Empregado("Maria", "Eclesiana", 6000.00);
		} catch (Exception e) {
			fail("Falha ao criar objetos: " + e);
		}
	}
	
	@Test
	@DisplayName("É possível instanciar um novo Empregado")
	void devePoderInstanciarNovoEmpregado() {
		try {
			Empregado empregado = new Empregado("a", "b", 10.0);
			assertTrue(empregado instanceof Empregado);
		} catch (Exception e) {
			fail("Erro ao gerar empregado:" + e);
		}
	}
	
	@Test
	@DisplayName("Não pode instanciar com nome vazio")
	void naoDevePoderInstanciarComNomeVazio() {

		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Empregado("", "b", 10.0)
		);
		assertEquals(exception.getMessage(), "Preencha o nome!");

	}
	
	@Test
	@DisplayName("Não pode instanciar com nome nulo")
	void naoDevePoderInstanciarComNomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Empregado(null, "b", 10.0)
		);
		assertEquals(exception.getMessage(), "Preencha o nome!");
	}
	
	@Test
	@DisplayName("Não pode instanciar com sobrenome vazio")
	void naoDevePoderInstanciarComSobrenomeVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Empregado("a", "", 10.0)
		);
		assertEquals(exception.getMessage(), "Preencha o sobrenome!");
	}
	
	@Test
	@DisplayName("Não pode instanciar com sobrenome nulo")
	void naoDevePoderInstanciarComSobrenomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> new Empregado("a", null, 10.0)
		);
		assertEquals(exception.getMessage(), "Preencha o sobrenome!");
	}
	
	@Test
	@DisplayName("É possível dar aumento para um empregado")
	void devePoderReceberAumento() {
		empregado1.receberAumento(0.1);
		assertEquals(5500.0, empregado1.getSalarioMensal());
	}
	
	@Test
	@DisplayName("É possível verificar quantos empregados já passaram pela empresa")
	void deveMostrarNumeroDeEmpregadosQuePassaramNaEmpresa() {
		assertEquals(2, Empregado.numDeEmpregados);
	}

	@Test
	@DisplayName("É possível alterar atributo nome")
	void devePoderAlterarNome() {
		try {
			empregado1.setNome("Roberto");
			assertEquals("Roberto", empregado1.getNome());			
		} catch (Exception  e) {
			fail("Falha ao alterar nome: " + e);
		}
	}
	
	@Test
	@DisplayName("O atributo nome não pode ser vazio")
	void naoDevePoderAlterarNomeVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> empregado1.setNome("")
		);
		assertEquals(exception.getMessage(), "Preencha o nome!");
	}
	
	@Test
	@DisplayName("O atributo nome não pode ser nulo")
	void naoDevePoderAlterarNomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> empregado1.setNome(null)
		);
		assertEquals(exception.getMessage(), "Preencha o nome!");
	}
	
	@Test
	@DisplayName("É possível alterar atributo sobrenome")
	void devePoderAlterarSobrenome() {
		try {
			empregado1.setSobrenome("Dias");
			assertEquals("Dias", empregado1.getSobrenome());			
		} catch (Exception  e) {
			fail("Falha ao alterar nome: " + e);
		}
	}
	
	@Test
	@DisplayName("O atributo sobrenome não pode ser vazio")
	void naoDevePoderAlterarSobrenomeVazio() {
		Exception exception = assertThrows(
				RuntimeException.class,
				() -> empregado1.setSobrenome("")
		);
		assertEquals(exception.getMessage(), "Preencha o sobrenome!");
	}
	
	@Test
	@DisplayName("O atributo sobrenome não pode ser nulo")
	void naoDevePoderAlterarSobrenomeNulo() {
		Exception exception = assertThrows(
				RuntimeException.class, 
				() -> empregado1.setSobrenome(null)
		);
		assertEquals(exception.getMessage(), "Preencha o sobrenome!");
	}
	
	@Test
	@DisplayName("É possível alterar atributo salarioMensal")
	void devePoderAlterarSalarioMensal() {
		empregado1.setSalarioMensal(1000);
		assertEquals(1000, empregado1.getSalarioMensal());			
	}
}

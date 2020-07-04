package projeto1;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarroTeste {
	Endereco novoEndereco;
	Proprietario novoProprietario;
	Carro novoCarro;
	
	@Before 
	public void criaObjetosParaTestes() throws Exception {
		novoEndereco = new Endereco("1", "2", "3", "4", "5", "6");
		novoProprietario = new Proprietario("a", "b", "c", novoEndereco);
		novoCarro = new Carro(novoProprietario);
	}

	@Test
	@DisplayName("Todo carro tem um proprietário")
	void falhaSeInstanciaSemProprietario() {
		// Ao tentar criar uma instância de carro, o proprietário deve ser passado.
		// A tentativa de instanciar com "null" retorna a mensagem "Proprietario não pode ser nulo!"
		Exception exception = assertThrows(RuntimeException.class, () -> new Carro(null));
		
		assertTrue(exception.getMessage().contains("Proprietario não pode ser nulo!"));
	}
	
	@Test
	@DisplayName("Um carro deve iniciar parado e em ponto morto")
	void iniciaParado() {
		assertEquals(0, novoCarro.getVelocidadeAtual());
		assertEquals(0, novoCarro.getMarchaAtual());
	}

}

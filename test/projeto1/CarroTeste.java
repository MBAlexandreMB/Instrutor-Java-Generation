package projeto1;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarroTeste {
	Endereco novoEndereco;
	Proprietario novoProprietario;
	Carro novoCarro;
	
	@BeforeEach
	public void criaObjetosParaTestes() throws Exception {
		try {
			novoEndereco = new Endereco("1", "2", "3", "4", "5", "6");
			novoProprietario = new Proprietario("a", "b", "c", novoEndereco);
			novoCarro = new Carro(novoProprietario);
			
			novoCarro.setVelocidadeMaxima((short) 2);
			novoCarro.setNumDeMarchas((byte) 5);
			novoCarro.setVolumeDeCombustivel((short) 40);
		} catch (Exception e) {
			System.out.println("Falha na criação: " + e.getMessage());
		}
	}
	
	@Test
	@DisplayName("É possível instanciar um novo carro")
	void instanciaUmNovoCarro() throws Exception {
		try {
			Carro carro = new Carro(novoProprietario);
			assertTrue(carro instanceof Carro);
		} catch (Exception e) {
			fail(e.getMessage());
		}
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
	@DisplayName("Deve iniciar parado e em ponto morto")
	void iniciaParado() {		
		assertEquals(0, novoCarro.getVelocidadeAtual());
		assertEquals(0, novoCarro.getMarchaAtual());
	}
	
	@Test
	@DisplayName("Deve acelerar 1km/h por vez")
	void aceleraUmKmPorVez() {
		assertEquals(0, novoCarro.getVelocidadeAtual());
		novoCarro.acelera();
		assertEquals(1, novoCarro.getVelocidadeAtual());
	}
	
	@Test
	@DisplayName("Não deve passar da velocidade máxima")
	void naoDevePassarDaVelocidadeMaxima( ) {		
		assertEquals(0, novoCarro.getVelocidadeAtual());
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		assertEquals(2, novoCarro.getVelocidadeAtual());
	}
	
	@Test
	@DisplayName("Deve frear")
	void deveFrear( ) {
		novoCarro.setVelocidadeAtual(2);
		assertEquals(2, novoCarro.getVelocidadeAtual());
		novoCarro.freia();
		assertEquals(0, novoCarro.getVelocidadeAtual());
	}
	
	@Test
	@DisplayName("Deve mudar de marcha")
	void mudaDeMarcha() {
		assertEquals(0, novoCarro.getMarchaAtual());
		novoCarro.trocaMarcha((byte) 2);
		assertEquals(2, novoCarro.getMarchaAtual());
	}
	
	@Test
	@DisplayName("Não deve mudar para uma marcha inexistente")
	void naoMudaParaMarchaInexistente() {
		assertEquals(0, novoCarro.getMarchaAtual());
		novoCarro.trocaMarcha((byte) -2);
		assertEquals(0, novoCarro.getMarchaAtual());
		novoCarro.trocaMarcha((byte) 8);
		assertEquals(0, novoCarro.getMarchaAtual());
	}
	
	@Test
	@DisplayName("Não deve mudar para marcha ré se o carro estiver em movimento")
	void naoMudaParaMarchaReEmMovimento() {
		assertEquals(0, novoCarro.getMarchaAtual());
		novoCarro.acelera();
		novoCarro.trocaMarcha((byte) -1);
		assertEquals(0, novoCarro.getMarchaAtual());
	}
	
	@Test
	@DisplayName("Deve poder mudar para marcha ré se o carro estiver parado")
	void podeMudarParaMarchaReQuandoParado() {
		assertEquals(0, novoCarro.getMarchaAtual());
		novoCarro.trocaMarcha((byte) -1);
		assertEquals(-1, novoCarro.getMarchaAtual());
	}
	
	@Test
	@DisplayName("Deve mostrar o volume de combustível")
	void mostraVolumeDeCombustivel() {
		assertEquals(40, novoCarro.getVolumeDeCombustivel());
	}
	
	@Test
	@DisplayName("Deve calcular autonomia de viagem")
	void deveCalcularAutonomiaDeViagem() {
		assertEquals(400, novoCarro.calculaAutonomia(10));
	}
}

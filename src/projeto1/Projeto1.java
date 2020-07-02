package projeto1;

public class Projeto1 {

	public static void main(String[] args) {
		Endereco novoEndereco = new Endereco("rua 1", "bairro 1", "cidade 1", "estado 1", "cep 1", "complemento 1");
		Proprietario novoProprietario = new Proprietario("Alexandre", "123.456.789-99", "12.123.456-2", novoEndereco);
		novoProprietario.setDataDeNascimento("04/10/1991");
		
		Carro novoCarro = new Carro(novoProprietario);
		novoCarro.setModelo("HB20");
		novoCarro.setCor("Preta");
		novoCarro.setAno("2015/2016");
		novoCarro.setMarca("Hyundai");
		novoCarro.setChassi("123a456b789c");
		novoCarro.setVelocidadeMaxima((short) 120);
		novoCarro.setNumDeMarchas((byte) 5);
		novoCarro.setNumDePortas((byte) 4);
		novoCarro.setTemTetoSolar(false);
		novoCarro.setTemCambioAutomatico(false);
		novoCarro.setVolumeDeCombustivel((short) 55);
		
		System.out.println("----- Dados do carro: -----");
		System.out.println(" Modelo: " + novoCarro.getModelo());
		System.out.println(" Cor: " + novoCarro.getCor());
		System.out.println(" Ano: " + novoCarro.getAno());
		System.out.println(" Marca: " + novoCarro.getMarca());
		System.out.println(" Chassi: " + novoCarro.getChassi());
		System.out.println(" Velocidade Máxima: " + novoCarro.getVelocidadeMaxima());
		System.out.println(" Número de Marchas: " + novoCarro.getNumDeMarchas());
		System.out.println(" Número de Portas:" + novoCarro.getNumDePortas());
		System.out.println(" Tem teto solar: " + novoCarro.isTemTetoSolar());
		System.out.println(" Tem câmbio automático: " + novoCarro.isTemCambioAutomatico());
		System.out.println(" Volume de combustível: " + novoCarro.getVolumeDeCombustivel());
		System.out.println(" ");
		System.out.println(" --- Dados do proprietário: ---");
		System.out.println("  Nome: " + novoCarro.getProprietario().getNome());
		System.out.println("  CPF: " + novoCarro.getProprietario().getCpf());
		System.out.println("  RG: " + novoCarro.getProprietario().getRg());
		System.out.println("  Data de nascimento: " + novoCarro.getProprietario().getDataDeNascimento());
		System.out.println("  Endereço: ");
		System.out.println("   Rua: " + novoCarro.getProprietario().getEndereco().getRua());
		System.out.println("   Bairro:" + novoCarro.getProprietario().getEndereco().getBairro());
		System.out.println("   Cidade:" + novoCarro.getProprietario().getEndereco().getCidade());
		System.out.println("   Estado:" + novoCarro.getProprietario().getEndereco().getEstado());
		System.out.println("   CEP:" + novoCarro.getProprietario().getEndereco().getCep());
		System.out.println("   Complemento:" + novoCarro.getProprietario().getEndereco().getComplemento());
		
		System.out.println(" ");
		System.out.println("Acelerando!");
		novoCarro.trocaMarcha((byte) 1);
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		novoCarro.acelera();
		System.out.println(" ");
		System.out.println("Tentando engatar a ré!");
		novoCarro.trocaMarcha((byte) -1);
		System.out.println("Freando!");
		novoCarro.freia();
		novoCarro.trocaMarcha((byte) -1);
	}

}

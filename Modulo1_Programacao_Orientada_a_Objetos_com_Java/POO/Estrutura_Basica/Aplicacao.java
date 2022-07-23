package modulo_1_POO_JAVA.POO.Estrutura_Basica;

public class Aplicacao {

	public static void main(String[] args) {

		Carro carro = new Carro();
		
		carro.setCor("Azul");
		carro.setModelo("Fiat");
		carro.setCapacidadeDoTanque(100);

		System.out.println("Cor: " + carro.getCor());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Capacidade do tanque: " + carro.getCapacidadeDoTanque() + " litros");

		double valorDoCombustivel = 6.80;
		double valorTanqueCheio = carro.ValorTanqueCheio(valorDoCombustivel);

		System.out.println("Preço a pagar para encher o tanque: R$ " + valorTanqueCheio + "\n");

		Carro carro1 = new Carro("Branco", "Civic", 200);

		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Capacidade do tanque: " + carro1.getCapacidadeDoTanque() + " litros");

		double valorDoCombustivel1 = 7.80;
		double valorTanqueCheio1 = carro1.ValorTanqueCheio(valorDoCombustivel);

		System.out.println("Preço a pagar para encher o tanque: R$ " + valorTanqueCheio);

	}

}

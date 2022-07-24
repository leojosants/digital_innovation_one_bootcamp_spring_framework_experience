package modulo_1_POO_JAVA.POO.Estrutura_Basica;

public class Carro {
	
	String cor;
	String modelo;
	int capacidadeDoTanque;
	
	Carro() {}
	
	Carro(String cor, String modelo, int capacidadeDoTanque) {
		this.cor = cor;
		this.modelo = modelo;
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	String getCor() {
		return cor;
	}

	void setCor(String cor) {
		this.cor = cor;
	}

	String getModelo() {
		return modelo;
	}

	void setModelo(String modelo) {
		this.modelo = modelo;
	}

	int getCapacidadeDoTanque() {
		return capacidadeDoTanque;
	}

	void setCapacidadeDoTanque(int capacidadeDoTanque) {
		this.capacidadeDoTanque = capacidadeDoTanque;
	}

	double ValorTanqueCheio(double valorDoCombustivel) {
		return capacidadeDoTanque * valorDoCombustivel;
		
	}
	
}

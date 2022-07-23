package com.springframework;

import org.springframework.beans.factory.annotation.Autowired;

public class Condutor {

	public static void main(String[] args) {

		Condutor condutor = new Condutor(new Carro());
		Condutor condutor2 = new Condutor(new Moto());
		
		condutor.automovel();
		condutor2.automovel();
		
	} // fim main
	
	@Autowired
	private Veiculo veiculo;
	
	public Condutor(Veiculo obj) {
		this.veiculo = obj;
	}
	
	public void automovel() {
		veiculo.acao();
	}
	
}

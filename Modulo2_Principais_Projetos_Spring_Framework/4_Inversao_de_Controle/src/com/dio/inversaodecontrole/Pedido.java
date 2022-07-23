package com.dio.inversaodecontrole;

public class Pedido {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		
		pedido.gravar();
	
	} //fim - main

		private EnviarEmails enviar = EnviarEmails.obterDadosEmail();
		
		public void gravar() {
			this.enviar.retornar("Pedido criado!");
		}
		
}

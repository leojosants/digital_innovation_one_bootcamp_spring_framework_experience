package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Interface;

public class Aplicacao {

	public static void main(String[] args) {

		Calculadora operacao = new Calculadora();
		
		operacao.soma(4, 4);
		operacao.subtracao(5, 4);
		operacao.multiplicacao(5, 4);
		operacao.divisao(5, 4);
		
//		int soma = operacao.soma(3, 4);
//		System.out.println("Soma: " + soma);
//		
//		int subtracao = operacao.subtracao(5, 2);
//		System.out.println("subtracao: " + subtracao);
//		
//		int divisao = operacao.divisao(1, 6);
//		System.out.println("divisao: " + divisao);
//		
//		int multiplicacao = operacao.multiplicacao(5, 2);
//		System.out.println("multiplicacao: " + multiplicacao);
		
	}

}

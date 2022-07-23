package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Interface;

public class Calculadora implements OperacaoMatematica {

	@Override
	public void soma(int num1, int num2) {
		System.out.println("Soma: " + (num1 + num2));
	}

	@Override
	public void subtracao(int num1, int num2) {
		System.out.println("Subtração: " + (num1 - num2));
		
	}

	@Override
	public void multiplicacao(int num1, int num2) {
		System.out.println("Multiplicação: " + (num1 * num2));
	}

	@Override
	public void divisao(int num1, int num2) {
		System.out.println("Divisão: " + (num1 / num2));
	}

//	@Override
//	public int soma(int num1, int num2) {
//		return num1 + num2;
//	}
//
//	@Override
//	public int subtracao(int num1, int num2) {
//		return num1 - num2;
//	}
//
//	@Override
//	public int multiplicacao(int num1, int num2) {
//		return num1 * num2;
//	}
//
//	@Override
//	public int divisao(int num1, int num2) {
//		return num1 / num2;
//	}



}

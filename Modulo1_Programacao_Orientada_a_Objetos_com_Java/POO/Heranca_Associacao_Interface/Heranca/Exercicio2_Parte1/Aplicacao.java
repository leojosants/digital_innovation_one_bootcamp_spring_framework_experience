package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Heranca.Exercicio2_Parte1;

public class Aplicacao {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();

		// UPCAST
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		Funcionario faxineiro = new Faxineiro();

		// DOWNCAST - DEVE-SE EVITAR ESTE USO
//		Gerente gerente_ = new Funcionario(); // NÃO VÁLIDO
		Vendedor vendedor_ = (Vendedor) new Funcionario(); // ERRO DE EM TEMPO DE EXECUÇÃO (ERRO DE CAST)
		
	}

}

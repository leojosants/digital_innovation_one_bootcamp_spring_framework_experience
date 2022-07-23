package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Heranca.Exercicio2_Parte2;

public class Aplicacao {

	public static void main(String[] args) {

		ClasseMae[] classes = new ClasseMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClasseMae()};
		
		for (ClasseMae classe : classes) {
			classe.metodo1();
		}
		
		System.out.println();
		
		for (ClasseMae classe : classes) {
			classe.metodo2();
		}
		
		System.out.println();
		
		ClasseFilha2 classeFilha2 = new ClasseFilha2();
		
		classeFilha2.metodo2();
		
		
	}

}

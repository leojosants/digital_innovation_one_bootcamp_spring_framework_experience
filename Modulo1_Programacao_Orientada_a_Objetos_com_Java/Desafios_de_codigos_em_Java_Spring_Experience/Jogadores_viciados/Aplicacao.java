package modulo_1_POO_JAVA.Desafios_em_Java_Spring_Experience.Jogadores_viciados;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		System.out.print("\nInforme o numero de publicacoes: ");
		int numeroDePublicacoes = leitor.nextInt();
		
		System.out.print("Id do usuario: ");
		int idDoUsuario = leitor.nextInt();
		
		int cont = 0;
		int cs = 0;
		int lol = 1;
		
		for (int i = 0; i < 7; i++) {
			System.out.printf("Publicacao %d°%n", (i + 1));
			System.out.print("Numero do id publicado: ");
			int idDaPublicacao = leitor.nextInt();
			
			System.out.print("Id do game [0/1]");
			int idDoGame = leitor.nextInt();
			
			if (idDoUsuario == idDaPublicacao && idDoGame == 0) {
				cont ++;
			}
			
		}
		
		System.out.println(cont);
	
        leitor.close();

	}

}

/*
 *	public class Main{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   
     int number,id;

     number=sc.nextInt(); // pega o primeiro numero (representa as quantidades de linhas depois dessa)
     id=sc.nextInt(); // pega o id do usuário que precisamos para usar como comparação.

     int count=0; // declaração
     while(number>0){ // inicia um loop

      int id1,num; // declaração

// aqui começa, vamos lá, a estrutura é ID | TIPO DO JOGO certo? então sempre que der nextInt ele vai pegar na sequencia: ID e no proximo nextInt() o numero que representa o jogo, isso num loop até não ter mais proximos números. 
      id1=sc.nextInt(); // pega o id da lista que veio com os dados
      num=sc.nextInt(); // pega o numero que representa um jogo

// aqui você colocou count no lugar do numero, porém como sabemos agora o que é o "num" (baseado na lógica atrás), então sabemos que ele quer que comparemos com um jogo específico, que foi descrito no enunciado.
// e o id a mesma logica, ele quer comparar o seu id (que foi pego na primeira linha) com o id dos dados de entrada. 
// basicamente eles querem comparar o id do usuário com o id da lista. 
      if(id==   && num== count){
		 count++;
	  } 
       
      number--; // decrementa
     }
     System.out.println(count);
   
  }
} 
 */
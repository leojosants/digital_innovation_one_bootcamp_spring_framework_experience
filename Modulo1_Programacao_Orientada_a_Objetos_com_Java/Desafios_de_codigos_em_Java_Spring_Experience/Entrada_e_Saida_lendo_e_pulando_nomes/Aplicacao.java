package modulo_1_POO_JAVA.Desafios_em_Java_Spring_Experience.Entrada_e_Saida_lendo_e_pulando_nomes;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		String[] nomes = new String[10];
		
		System.out.println("\nInforme 10 nomes sem espaço em branco\n");
		
		// Leia 10 nomes, sem espaço em branco;
		for (int i = 0; i < 10; i++) {
			System.out.printf("# %dº nome: ", (i + 1));
			nomes[i] = leitor.next().toUpperCase();
		}
		
		// Imprima o terceiro nome da lista;
		System.out.println("\nTerceiro nome da lista: " + nomes[2]);
		
		// Imprima o sétimo nome da lista;
		System.out.println("Sétimo nome da lista: " + nomes[6]);
		
		// Imprima o nono nome da lista.
		System.out.println("Nono nome da lista: " + nomes[8]);
		
		leitor.close();
		
	}

}

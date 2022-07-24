package modulo_1_POO_JAVA.Desafios_de_codigos_Desafios_em_Java_Spring_Experience.Proibido_a_entrada_de_menores;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int n = leitor.nextInt();

		int[] idades = new int[n];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = leitor.nextInt();
		}

		System.out.println("Nao poderao entrar as idades: ");

		for (int i = 0; i < idades.length; i++) {

			if (idades[i] < 18) {
				System.out.println(idades[i]);
			}

		}

		leitor.close();

	}

}

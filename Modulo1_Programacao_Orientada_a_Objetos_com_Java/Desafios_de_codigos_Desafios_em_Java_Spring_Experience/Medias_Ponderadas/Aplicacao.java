package modulo_1_POO_JAVA.Desafios_de_codigos_Desafios_em_Java_Spring_Experience.Medias_Ponderadas;

import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cont = 0;

		while (cont < n) {

// 			System.out.print("Primeira nota: ");
			double nota1 = sc.nextDouble();

// 			System.out.print("Segunda nota: ");
			double nota2 = sc.nextDouble();

// 			System.out.print("Terceira nota: ");
			double nota3 = sc.nextDouble();

			double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5);
			double media = mediaPonderada / 10;

			System.out.printf("%.1f", media);
			System.out.println();

			cont++;

		}

		sc.close();

	}

}

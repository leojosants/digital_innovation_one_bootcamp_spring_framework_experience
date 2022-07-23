package modulo_1_POO_JAVA.Desafios_em_Java_Spring_Experience.Medias_Ponderadas;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("\nInforme o número de casos a serem testados: ");
		int n = leitor.nextInt();
		
		int cont = 0;
		
		while (cont < n) {
			
			System.out.print("Primeira nota: ");
			double nota1 = leitor.nextDouble();
			
			System.out.print("Segunda nota: ");
			double nota2 = leitor.nextDouble();
			
			System.out.print("Terceira nota: ");
			double nota3 = leitor.nextDouble();
			
			double mediaPonderada = (nota1 * 2 + nota2 * 3 + nota3 * 5);
			double media = mediaPonderada / 10;
			
			System.out.printf("%.1f", media);
			System.out.println();

			cont++;
		
		}
		
		leitor.close();
		
	}

}

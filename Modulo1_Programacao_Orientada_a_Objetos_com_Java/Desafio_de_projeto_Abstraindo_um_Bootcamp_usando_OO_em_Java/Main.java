package modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java;

import java.time.LocalDate;

import modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio.Bootcamp;
import modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio.Conteudo;
import modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio.Curso;
import modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio.Dev;
import modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();

		curso1.setTitulo("Curso de Java");
		curso1.setDescricao("Descrição do curso Java");
		curso1.setCargaHoraria(8);

		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso de JS");
		curso2.setDescricao("Descrição do curso JS");
		curso2.setCargaHoraria(4);

		Conteudo conteudo = new Curso();

		Mentoria mentoria = new Mentoria();
		
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descrição mentoria de Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devLeo = new Dev();
		
		devLeo.setNome("Leonardo");
		System.out.println("\nDados do Dev: " + devLeo.getNome());

		devLeo.inscreverBootcamp(bootcamp);
		System.out.println("\tConteudos Inscritos: " + devLeo.getConteudosInscritos());

		devLeo.progredir();
		devLeo.progredir();
		System.out.println("\n\tConteudos Inscritos: " + devLeo.getConteudosInscritos());
		System.out.println("\n\tConteudos Concluidos: " + devLeo.getConteudosConcluidos());
		System.out.println("\n\tXP: " + devLeo.calcularTotalXp());

		System.out.println();

		Dev devJenny = new Dev();
		
		devJenny.setNome("Jennyfer");
		System.out.println("\nDados do Dev: " + devJenny.getNome());

		devJenny.inscreverBootcamp(bootcamp);
		System.out.println("\tConteudos Inscritos: " + devJenny.getConteudosInscritos());

		devJenny.progredir();
		devJenny.progredir();
		devJenny.progredir();
		System.out.println("\n\tConteúdos Inscritos: " + devJenny.getConteudosInscritos());
		System.out.println("\n\tConteúdos Concluidos: " + devJenny.getConteudosConcluidos());
		System.out.println("\n\tXP: " + devJenny.calcularTotalXp());

	}

}

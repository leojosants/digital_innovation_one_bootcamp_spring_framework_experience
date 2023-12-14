package modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

	private LocalDate data;
	
	public Mentoria() {}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "\n\t\tMentoria -->	Título: " + getTitulo() + "\n\t\t\t\tDescrição: " + getDescricao() + "\n\t\t\t\tData: " + data;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

}

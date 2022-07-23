package modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRAO = 10d;

	private String titulo;
	private String descricao;

	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

package modulo_1_POO_JAVA.Desafio_de_projeto_Abstraindo_um_Bootcamp_usando_OO_em_Java.dominio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	public Curso() {
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "\n\t\tCurso	 -->	T�tulo: " + getTitulo() + "\n\t\t\t\tDescri��o: " + getDescricao()
				+ "\n\t\t\t\tCarga Hor�ria: " + cargaHoraria + " horas";
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria;
	}

}

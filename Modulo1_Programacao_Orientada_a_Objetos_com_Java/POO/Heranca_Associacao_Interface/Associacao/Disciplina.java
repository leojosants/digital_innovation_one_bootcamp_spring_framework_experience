package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Associacao;

public class Disciplina {

	String nomeCurso;
	Aluno aluno;
	
	public Disciplina() {}
	
	public Disciplina(String nomeCurso, Aluno aluno) {
		this.nomeCurso = nomeCurso;
		this.aluno = aluno;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	
	
}

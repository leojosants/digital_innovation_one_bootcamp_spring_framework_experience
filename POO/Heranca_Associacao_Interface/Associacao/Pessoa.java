package modulo_1_POO_JAVA.POO.Heranca_Associacao_Interface.Associacao;

public class Pessoa {

	String nome;
	Endereco endereco;

	Pessoa() {
	}

	Pessoa(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	Endereco getEndereco() {
		return endereco;
	}

	void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

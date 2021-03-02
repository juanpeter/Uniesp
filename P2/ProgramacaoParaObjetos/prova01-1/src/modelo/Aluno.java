package modelo;

// 1. Implemente uma classe Aluno como nome, matricula e curso. 
// Escolha os tipos dos dados e implemente os construtores,
// get/set e toString.

public class Aluno {
	
	// atributos
	private String nome, curso;
	private int matricula;
	
	// construtores
	public Aluno(String nome, int matricula, String curso) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
	}
	public Aluno() {}
	
	// metodos
	public String toString() {
		return "Aluno:\nNome: " + this.nome + "\nMatricula: " + this.matricula + "\nCurso: " + this.curso;
	}
	
	// gets & sets
	public String getNome() {
		return this.nome;
	}
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	public void setMatricula(int novaMatricula) {
		this.matricula = novaMatricula;
	}
	
	public String getCurso() {
		return this.curso;
	}
	public void setCurso(String novoCurso) {
		this.curso = novoCurso;
	}
}

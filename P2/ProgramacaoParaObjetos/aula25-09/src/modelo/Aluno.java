package modelo;

public class Aluno {
	//Atributos
	private String nome;
	private int matricula;
	private String curso;
	
	//Construtor com campos vazios
	public Aluno() {}
	
	public Aluno(String n, int m, String c) {
		this.nome = n;
		this.matricula = m;
		this.curso = c;
	}
	
	//get e set
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
	
	public void setCurso(String novocurso) {
		this.curso = novocurso;
	}
 }

package modelo;

//O professor pode criar quantas questões julgar necessário.

import modelo.Aluno;

public class Prova {
	
	// atributos
	private int idProva;
	private int notaMaxima;
	private int pesos[];
	private String respostaAluno[];
	private String respostaCerta[];
	private String perguntas[];	
	private String respostas[][];
	private Aluno aluno;
	
	// construtores
	public Prova(
			int idProva,
			Aluno aluno,
			int notaMaxima,
			int pesos[],
			String respostaC[],
			String perguntas[],
			String respostas[][],
			String respostaAluno[]
			) {
		this.idProva = idProva;
		this.aluno = aluno;
		this.notaMaxima = notaMaxima;
		this.pesos = pesos;
		this.respostaCerta = respostaC;
		this.perguntas = perguntas;
		this.respostas = respostas;
		this.respostaAluno = respostaAluno;
	}
	
	public Prova() {}
		
	// metodos
	public String toString() {
		return "Prova id: " + this.idProva + 
				"\nAluno:\n" + this.aluno +
				"\nPesos: " + this.pesos +
				"\nRespostas Corretas: " +this.respostaCerta+
				"\nPerguntas: " +this.perguntas+
				"\nRespostas: " +this.respostas+
				"\nRespostas do aluno: " +this.respostaAluno;
	}
	public float calcularNota() {

		float sum = 0;
		float div = 0;
		
		for (int i = 0; i < perguntas.length; i++) {
			if (respostaAluno[i].toString().equals(respostaCerta[i].toString())) {

				sum = sum + pesos[i] * notaMaxima;
			}
			
			div = div + pesos[i];			
		}
		
		float nota = sum / div;
		
		return nota;
	}

	// get & sets
	public int getIdProva() {
		return idProva;
	}

	public void setIdProva(int idProva) {
		this.idProva = idProva;
	}

	public int getNotaMaxima() {
		return notaMaxima;
	}

	public void setNotaMaxima(int notaMaxima) {
		this.notaMaxima = notaMaxima;
	}

	public int[] getPesos() {
		return pesos;
	}

	public void setPesos(int[] pesos) {
		this.pesos = pesos;
	}

	public String[] getRespostaAluno() {
		return respostaAluno;
	}

	public void setRespostaAluno(String[] respostaAluno) {
		this.respostaAluno = respostaAluno;
	}

	public String[] getRespostaCerta() {
		return respostaCerta;
	}

	public void setRespostaCerta(String[] respostaCerta) {
		this.respostaCerta = respostaCerta;
	}

	public String[] getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}

	public String[][] getRespostas() {
		return respostas;
	}

	public void setRespostas(String[][] respostas) {
		this.respostas = respostas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

}

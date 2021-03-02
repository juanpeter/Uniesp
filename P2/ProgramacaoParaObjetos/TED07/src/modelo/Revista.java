package modelo;

public class Revista extends Publicacao {
	private String periodicidade;
	
	public Revista() {
		super();
	}

	public Revista(String nome, int dataDePublicacao, String editora, String periodicidade) {
		super(nome, dataDePublicacao, editora);
		this.periodicidade = periodicidade;
	}

	
	public String toString() {
		return "Revista [periodicidade=" + periodicidade + ", nome=" + getNome() + ", dataDePublicacao="
				+ getDataDePublicacao() + ", editora=" + getEditora() + "]";
	}

	
	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	
}

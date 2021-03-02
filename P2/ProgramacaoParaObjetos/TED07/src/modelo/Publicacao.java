package modelo;

public class Publicacao {
	private String nome;
	private int dataDePublicacao;
	private String editora;
	
	public Publicacao(String nome, int dataDePublicacao, String editora) {
		this.nome = nome;
		this.dataDePublicacao = dataDePublicacao;
		this.editora = editora;
	}
	
	public Publicacao() {}
	
	public String toString() {
		return "Publicacao [nome=" + nome + ", dataDePublicacao=" + dataDePublicacao + ", editora=" + editora + "]";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataDePublicacao() {
		return dataDePublicacao;
	}
	public void setDataDePublicacao(int dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
}

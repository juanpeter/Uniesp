package modelo;

public class Livro extends Publicacao {
	private String isbn;
	
	public Livro() {
		super();
	}

	public Livro(String nome, int dataDePublicacao, String editora, String isbn) {
		super(nome, dataDePublicacao, editora);
		this.isbn = isbn;
	}


	public String toString() {
		return "Livro [isbn=" + isbn + ", nome=" + getNome() + ", dataDePublicacao=" + getDataDePublicacao()
				+ ", editora=" + getEditora() + "]";
	}

	
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}

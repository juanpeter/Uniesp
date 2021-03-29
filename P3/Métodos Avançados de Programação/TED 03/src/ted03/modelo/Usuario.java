package ted03.modelo;

public class Usuario {
	
	private String nome;
	private String tipoGenero;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipoGenero() {
		return tipoGenero;
	}

	public void setTipoGenero(String tipoGenero) {
		this.tipoGenero = tipoGenero;
	}
	
	public String saudacaoUsuario() {
		return "Bem-vindo " + this.getNome();
	}
}

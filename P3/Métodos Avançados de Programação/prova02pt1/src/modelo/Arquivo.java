package modelo;

public class Arquivo extends ArquivoAbstrato {
	
	private String nome;
	private String caminho;
	private String data;
	private String hora;
	private String proprietario;
	private String email;
	private Boolean authImpressao;
	private Boolean authCopia;
	
	public Arquivo(String nome, String caminho) {
		this.nome = nome;
		this.caminho = caminho;
		this.data = null;
		this.hora = null;
		this.email = null;
		this.authImpressao = false;
		this.authCopia = false;
	}
	
	public Arquivo(Arquivo arquivo) {
		this.nome = arquivo.getNome();
		this.caminho = arquivo.getCaminho();
		this.data = arquivo.getData();
		this.hora = arquivo.getHora();
		this.email = arquivo.getEmail();
		this.authImpressao = arquivo.getAuthImpressao();
		this.authCopia = arquivo.getAuthCopia();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getAuthImpressao() {
		return authImpressao;
	}
	
	public void setAuthImpressao(Boolean authImpressao) {
		this.authImpressao = authImpressao;
	}

	public Boolean getAuthCopia() {
		return authCopia;
	}
	
	public void setAuthCopia(Boolean authCopia) {
		this.authCopia = authCopia;
	}
	
	@Override
	public String toString() {
		return "Arquivo [nome=" + nome + ", caminho=" + caminho + ", data=" + data + ", hora=" + hora
				+ ", proprietario=" + proprietario + ", email=" + email + ", authImpressao=" + authImpressao
				+ ", authCopia=" + authCopia + "]";
	}

	public void escrever() {
		System.out.println("Escrevendo documento...");
	}
	
	public void ler() {
		System.out.println("Lendo documento...");
	}
	
	public void imprimir() {
		if (this.getAuthImpressao().equals(true)) {
			System.out.println("Documento impresso");
		} else {
			System.out.println("Impressão do documento não autorizada");
		}
	}
	
	public Arquivo copiar() {
		if (this.getAuthCopia().equals(true)) {
			System.out.println("Documento copiado");
			return new Arquivo(this);
		} else {
			System.out.println("Cópia do documento não autorizada");
			return null;
		}
	}

}

package modelo;

public class ArquivoBuilder extends ArquivoAbstrato {

	public ArquivoBuilder() {
		this.setArquivo(new Arquivo(null, null));
	}
	
	public ArquivoBuilder(String nome, String caminho) {
		this.setArquivo(new Arquivo(nome, caminho));
	}
	
	public Arquivo montarArquivo(String nome, String caminho) {
		this.getArquivo().setNome(nome);
		this.getArquivo().setCaminho(caminho);
		return this.getArquivo();
	}
	
	public Arquivo adicionarInformacoes(String data, String hora, String proprietario, String email) {
		this.getArquivo().setData(data);
		this.getArquivo().setHora(hora);
		this.getArquivo().setProprietario(proprietario);
		this.getArquivo().setEmail(email);
		return this.getArquivo();
	}
	
	public void autorizarCopia(Boolean auth) {
		this.getArquivo().setAuthCopia(auth);
	}
	
	public void autorizarImpressao(boolean auth) {
		this.getArquivo().setAuthImpressao(auth);
	}
	
}

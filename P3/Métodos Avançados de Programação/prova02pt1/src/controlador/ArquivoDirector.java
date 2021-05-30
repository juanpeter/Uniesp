package controlador;

import modelo.Arquivo;
import modelo.ArquivoBuilder;

public class ArquivoDirector {
	
	private ArquivoBuilder arquivoRequisitado;
	
	public ArquivoDirector() {
		arquivoRequisitado = new ArquivoBuilder();
	}
	
	public Arquivo montarArquivo(String nome, String caminho) {
		arquivoRequisitado.montarArquivo(nome, caminho);
		
		return arquivoRequisitado.getArquivo();
	}
	
	public Arquivo montarArquivo(String nome, String caminho, String data, String hora, String proprietario, String email) {
		arquivoRequisitado.montarArquivo(nome, caminho);

		arquivoRequisitado.adicionarInformacoes(data, hora, proprietario, email);
		
		return arquivoRequisitado.getArquivo();
	}
}

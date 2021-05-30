package visao;

import controlador.ArquivoDirector;
import modelo.Arquivo;
import modelo.EditorAbstrato;
import modelo.FabricaEditor;

public class Visao {

	public static void main(String args[]) {
		ArquivoDirector arquivoDirector = new ArquivoDirector();
		
		Arquivo arquivo1 = arquivoDirector.montarArquivo("Arquivo 1", "/docs/arquivo1");	
		System.out.println(arquivo1);
		
		EditorAbstrato editorTexto = FabricaEditor.criarEditor("texto");
		editorTexto.setArquivo(arquivo1);
		
		System.out.println(editorTexto);
		
		arquivo1.copiar();
		arquivo1.ler();
		
		Arquivo arquivo2 = arquivoDirector.montarArquivo("Arquivo 2", "/docs/arquivo2", "03/02/1997", "11:00", null, "juanpeterisrael@gmail.com");
		arquivo2.setAuthCopia(true);
		
		arquivo2.copiar();
		arquivo2.imprimir();
		
		EditorAbstrato editorApresentacao = FabricaEditor.criarEditor("apresentação");
		editorApresentacao.setArquivo(arquivo2);
		
		System.out.println(editorApresentacao);
		
	}
}

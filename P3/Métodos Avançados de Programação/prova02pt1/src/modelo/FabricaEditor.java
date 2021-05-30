package modelo;

public class FabricaEditor {

	public static EditorAbstrato criarEditor(String tipo) {
		if (tipo.equals("texto")) {
			return new EditorTexto();
		} else if (tipo.equals("apresentação")) {
			return new EditorApresentacao();
		} else if (tipo.equals("planilha")) {
			return new EditorPlanilha();
		} else {
			return null;
		}
	}
	
}

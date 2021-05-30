package modelo;

public abstract class EditorAbstrato {

	private Arquivo arquivo;

	public Arquivo getArquivo() {
		return arquivo;
	}

	public void setArquivo(Arquivo arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public String toString() {
		return "EditorAbstrato [arquivo=" + arquivo + "]";
	}
	
}

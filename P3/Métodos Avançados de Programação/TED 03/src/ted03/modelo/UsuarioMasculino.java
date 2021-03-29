package ted03.modelo;

public class UsuarioMasculino extends Usuario {
	
	public UsuarioMasculino(String nome) {
		this.setNome(nome);
		this.setTipoGenero("Masculino");
	}
	
	@Override
	public String saudacaoUsuario() {
		return "Bem-vindo Sr. " + this.getNome();
	}
}

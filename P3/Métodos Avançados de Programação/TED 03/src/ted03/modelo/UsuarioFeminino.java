package ted03.modelo;

public class UsuarioFeminino extends Usuario {
	
	public UsuarioFeminino(String nome) {
		this.setNome(nome);
		this.setTipoGenero("Feminino");
	}
	
	@Override
	public String saudacaoUsuario() {
		return "Bem-vinda Sra. " + this.getNome();
	}
	
}

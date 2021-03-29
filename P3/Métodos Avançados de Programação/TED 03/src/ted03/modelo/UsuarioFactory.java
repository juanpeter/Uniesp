package ted03.modelo;

public class UsuarioFactory {
	
	public UsuarioFactory() {}
	
	public Usuario getUsuario(String nome, String tipoGenero) {
		if (tipoGenero.equals("Masculino")) {
			return new UsuarioMasculino(nome);
		}
		else if (tipoGenero.equals("Feminino")) {
			return new UsuarioFeminino(nome);
		}
		else {
			return new UsuarioGeneroIndefinido();
		}
	}
}

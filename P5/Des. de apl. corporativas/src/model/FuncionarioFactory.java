package model;

public class FuncionarioFactory {

	public FuncionarioFactory() {}
	
	public FuncionarioAbstract getFuncionario(
			String id,
			String nome,
			String idade,
			String genero,
			String departamento,
			Boolean externo
			) {
		if (externo.equals(true)) {
			return new FuncionarioExterno(
					id,
					nome,
					idade,
					genero,
					departamento
					);
		}
		else {
			return new FuncionarioInterno(
					id,
					nome,
					idade,
					genero,
					departamento
					);
		}
		
	}
	
}

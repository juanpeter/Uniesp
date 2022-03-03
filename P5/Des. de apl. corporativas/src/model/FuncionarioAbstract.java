package model;

public abstract class FuncionarioAbstract {
	
	private FuncionarioAbstract funcionario;
	
	public FuncionarioAbstract() {}
	
	public FuncionarioAbstract(FuncionarioInterno funcionario) {
		this.setFuncionario(funcionario);
	}
	
	public FuncionarioAbstract(FuncionarioExterno funcionario) {
		this.setFuncionario(funcionario);
	}

	public FuncionarioAbstract getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioAbstract funcionario) {
		this.funcionario = funcionario;
	}
	
	
}

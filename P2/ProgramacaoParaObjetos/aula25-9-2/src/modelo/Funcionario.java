package modelo;

public class Funcionario {
	// Atributos
	private int id;
	private int idSetor;
	private int salario;
	private int rg;
	private boolean estaTrabalhando;
	
	// Construtor
	public Funcionario(int id, int idSetor, int salario, int rg, boolean estaTrabalhando) {
		this.id = id;
		this.idSetor = idSetor;
		this.salario = salario;
		this.rg = rg;
		this.estaTrabalhando = estaTrabalhando;
	}

	//Get & Set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdSetor() {
		return idSetor;
	}

	public void setIdSetor(int idSetor) {
		this.idSetor = idSetor;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public boolean isEstaTrabalhando() {
		return estaTrabalhando;
	}

	public void setEstaTrabalhando(boolean estaTrabalhando) {
		this.estaTrabalhando = estaTrabalhando;
	}
	
	// Métodos
	public int bonifica(int aumento) {
		this.salario = this.salario + aumento;
		return this.salario;
	}
	
	public void demite() {
		this.estaTrabalhando = false;
	}
}

package model;

public class FuncionarioInterno extends FuncionarioAbstract {

	private String id;
	private String nome;
	private String idade;
	private String genero;
	private String departamento;
	private Boolean externo;
	
	public FuncionarioInterno(
		String id,
		String nome,
		String idade,
		String genero,
		String departamento
		) {
	this.id = id;
	this.nome = nome;
	this.idade = idade;
	this.genero = genero;
	this.departamento = departamento;
	this.setExterno(false);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public Boolean getExterno() {
		return externo;
	}
	public void setExterno(Boolean externo) {
		this.externo = externo;
	}
	
	@Override
	public String toString() {
		return "Funcionario: " + nome + "\n" +
						"id: " + id + "\n" +
						"idade: " + idade + "\n" +
						"genero: " + genero + "\n" +
						"departamento: " + departamento + "\n" +
						"externo: " + externo + "\n";
	}
}

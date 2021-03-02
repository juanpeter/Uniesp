package modelo;

public class Circulo {
	
	// Atributos
	private float raio;
	
	// Construtor
	public Circulo(float r) {
		this.raio = r;
	}
	
	// Funciona por causa do Polimorfismo
	public Circulo() {}
	
	//Acessadores e Modificadores de Atributos
	//GET
	public float getRaio() {
		return this.raio;
	}
	
	//SET
	public void setRaio(float novoRaio) {
		this.raio = novoRaio;
	}
	
	//Métodos
	// - Area
	public float calcularArea() {
		return 3.14f * this.raio * this.raio;
	}
}

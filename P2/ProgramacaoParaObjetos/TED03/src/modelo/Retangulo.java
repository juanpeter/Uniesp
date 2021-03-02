//Implemente a classe Retângulo com os 
//atributos base e altura privativos e 
//calcule sua área. 
//Não esqueça de implementar a classe Teste.

package modelo;

// Classe
public class Retangulo {
	
	// Atributos
	private double base;
	private double altura;
	
	// Construtor
	public Retangulo(double b, double a) {
		this.base = b;
		this.altura = a;
	}
	
	//Construtor vazio
	public Retangulo() {}
	
	//Get & Set
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double novaBase) {
		this.base = novaBase;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}

	
	// Retornar todos os atributos
	public String toString() {
		return "Retângulo - Base: " + this.base + " - Altura: " + this.altura;
	}
	// Método
	public double areaRetangulo() {
		double area = base * altura;
		return area;
	}
}
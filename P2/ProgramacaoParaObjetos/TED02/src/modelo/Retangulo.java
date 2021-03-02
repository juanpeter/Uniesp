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
	
	// Método
	public double areaRetangulo() {
		double area = base * altura;
		return area;
	}
}
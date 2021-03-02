// Não existe problema em utilizar a classe retangulo dentro da moldura
// Não exagere na dependência entre classes
package modelo;

// Classe
public class Moldura {
	
	// Atributos
	private Retangulo areaExterna;
	private Retangulo areaInterna;
	
	// Construtor
	public Moldura(Retangulo a1, Retangulo a2) {
		this.areaExterna = a1;
		this.areaInterna = a2;
	}
	
	// Construtor vazio
	public Moldura() {}
	
	//Get & Set
	public Retangulo getAreaExterna() {
		return this.areaExterna;
	}
	
	public void setAreaExterna(Retangulo novaAreaExterna) {
		this.areaExterna = novaAreaExterna;
	}
	
	public Retangulo getAreaInterna() {
		return this.areaInterna;
	}
	
	public void setAreaInterna(Retangulo novaAreaInterna) {
		this.areaInterna = novaAreaInterna;
	}
	
	//	Método de calcular área da moldura fica aqui
	public double areaMoldura() {
		return this.areaExterna.areaRetangulo() - this.areaInterna.areaRetangulo();
	}
	
	// 	Método para calcular o preço da moldura
	public double precoMoldura(double precoM2) {
		return precoM2 * areaMoldura();
	}
	
}

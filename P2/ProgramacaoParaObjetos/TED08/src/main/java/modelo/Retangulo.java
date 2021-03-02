package modelo;

//- Classes para representar retângulos e quadrados. A primeira deve receber o tamanho
//da base e da altura no construtor;

public class Retangulo extends Quadrilateros {
	
    private float base;
    private float altura;

    public Retangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public Retangulo() {}
    
    @Override
    public float calcularPerimetro(){
        float perimetro = 2 * base + 2 * altura;
        return perimetro;
    }
    
    @Override
    public float calcularArea() {
        float area = base * altura;
        return area;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo: " + "base= " + base + ", altura= " + altura;
    }
    
}

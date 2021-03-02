package modelo;

//- Classes para representar retângulos e quadrados. 
// A segunda deve receber apenas o tamanho do lado;

public class Quadrado extends Quadrilateros{
	
    private float lado;

    public Quadrado(float lado) {
        this.lado = lado;
    }
    
    public Quadrado() {}
    
    @Override
    public float calcularPerimetro() {
        float perimetro = 4 * lado;
        return perimetro;
    }
    
    @Override
    public float calcularArea() {
        float area = (float) Math.pow(lado, 2);
        return area;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado: " + "lado= " + lado;
    }
    
    
}

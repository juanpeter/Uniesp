//- Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.

package modelo;

public class Circulo implements IFormaGeometrica {
    
    private float raio;

    public Circulo(float raio) {
            this.raio = raio;
    }
    
    public Circulo() {}

    @Override
    public float calcularPerimetro() {
        float perimetro = 2 * raio * (float) Math.PI;
        return perimetro;
    }
    
    @Override
    public float calcularArea() {
        float area = (float) Math.pow(raio, 2) * (float) Math.PI;
        return area;
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public String toString() {
        return "Circulo: " + "raio= " + raio;
    }
    
}

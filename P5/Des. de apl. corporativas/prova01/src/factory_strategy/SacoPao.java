package factory_strategy;

public class SacoPao extends Pao{

	public double precoTotal;
	public int quantPaes;
	
	public double getPrecoTotal() {
		return precoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		this.precoTotal = precoTotal;
	}
	public int getQuantPaes() {
		return quantPaes;
	}
	public void setQuantPaes(int quantPaes) {
		this.quantPaes = quantPaes;
	}
	@Override
	public String toString() {
		return "SacoPao [precoTotal=" + precoTotal + ", quantPaes=" + quantPaes + "]";
	}
	
	
}

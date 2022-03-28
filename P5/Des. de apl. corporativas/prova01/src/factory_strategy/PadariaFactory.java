package factory_strategy;

public abstract class PadariaFactory {

	protected Pao sacopao;
	protected PrecoPesoRegiao pesoPao;
	
	public SacoPao fazerPaes(int quant) {

		SacoPao saco = new SacoPao();
		saco.setQuantPaes(quant);
		
		double precoPao = pesoPao.calcularPreco(quant);
		saco.setPrecoTotal(precoPao);
		
		return saco;
	}
	
	public Pao entregarPaes() {
		return this.sacopao;
	}

	@Override
	public String toString() {
		return "PadariaFactory [sacopao=" + sacopao.toString() + "]";
	}
	
	
}

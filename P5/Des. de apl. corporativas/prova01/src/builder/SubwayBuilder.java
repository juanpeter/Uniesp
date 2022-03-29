package builder;

public class SubwayBuilder {
	
	private Subway subway;
	
	public void iniciarPedido() {
		
		Subway subwayPedido = new Subway();
		this.subway = subwayPedido;

	}
	
	public void escolherPao(String pao) {
	
		Pao subwayPao = new Pao(pao);
		subway.setPao(subwayPao);
	}
	
	public void adicionarAlface(String alface) {
		
		Alface alfacePedido = new Alface(alface);
		this.subway.setAlface(alfacePedido);
	}
	
	public void adicionarTomate(String tomate) {
		
		Tomate tomatePedido = new Tomate(tomate);
		this.subway.setTomate(tomatePedido);
	}
	
	public void adicionarCebola(String cebola) {
		
		Cebola cebolaPedida = new Cebola(cebola);
		this.subway.setCebola(cebolaPedida);
	}
	
	public void adicionarProteina(String proteina) {
		
		Proteina proteinaPedida = new Proteina(proteina);
		this.subway.setProteina(proteinaPedida);
	}
	
	public void adicionarMolho(String molho) {
		
		Molho molhoPedido = new Molho(molho);
		this.subway.setMolho(molhoPedido);
	}
	
	public Subway finalizarPedido() {
		return this.subway;
	}
}

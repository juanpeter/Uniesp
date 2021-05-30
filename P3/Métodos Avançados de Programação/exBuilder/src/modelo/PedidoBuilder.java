package modelo;

public class PedidoBuilder extends PedidoAbstrato {

	public PedidoBuilder() {
		this.setPedido(new Pedido());
	}
	
	@Override
	public void montarDentroDaCaixa(String hamburguer, String batata, String brinquedo) {
		this.getPedido().adicionarDentroDaCaixa(hamburguer);
		this.getPedido().adicionarDentroDaCaixa(batata);
		this.getPedido().adicionarDentroDaCaixa(brinquedo);

	}

	@Override
	public void montarForaDaCaixa(String refrigerante) {
		this.getPedido().adicionarForaDaCaixa(refrigerante);
		
	}

}

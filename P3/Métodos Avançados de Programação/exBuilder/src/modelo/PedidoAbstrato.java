package modelo;

public abstract class PedidoAbstrato {
	
	private Pedido pedido;
	
	public abstract void montarDentroDaCaixa(String hamburguer, String batata, String brinquedo);
	
	public abstract void montarForaDaCaixa(String refrigerante);
	
	public Pedido getPedido() {
		return pedido;
	}
	
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}

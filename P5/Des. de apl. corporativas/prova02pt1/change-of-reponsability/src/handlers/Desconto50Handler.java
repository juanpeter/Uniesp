package handlers;

import Pedido.Pedido;

public class Desconto50Handler extends AbstractDescontoHandler {

	public Desconto50Handler() {};

	@Override
	public Double calcularDesconto(Pedido pedido) {
		this.valorDesconto(pedido, 0.05);
		
		return pedido.getValor();
	}
}

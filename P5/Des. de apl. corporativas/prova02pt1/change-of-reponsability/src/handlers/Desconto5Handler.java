package handlers;

import Pedido.Pedido;

public class Desconto5Handler extends AbstractDescontoHandler {

	public Desconto5Handler() {
		this.proximo = new Desconto10Handler();
	};

	@Override
	public Double calcularDesconto(Pedido pedido) {
		
		if (pedido.getItens().size() > 10) {
			return this.proximo.calcularDesconto(pedido);
		}
		
		else {
			this.valorDesconto(pedido, 0.02);
			return pedido.getValor();
		}
	}
}

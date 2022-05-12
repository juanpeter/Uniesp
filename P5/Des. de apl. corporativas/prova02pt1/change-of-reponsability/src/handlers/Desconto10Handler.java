package handlers;

import Pedido.Pedido;

public class Desconto10Handler extends AbstractDescontoHandler {

	public Desconto10Handler() {
		this.proximo = new Desconto50Handler();
	};

	public Double calcularDesconto(Pedido pedido) {
		
		if (pedido.getItens().size() > 50) {
			return this.proximo.calcularDesconto(pedido);
		}
		
		else {
			this.valorDesconto(pedido, 0.03);
			return pedido.getValor();
		}
	}

}

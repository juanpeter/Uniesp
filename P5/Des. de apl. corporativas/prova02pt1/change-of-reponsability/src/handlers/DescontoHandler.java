package handlers;

import Pedido.Pedido;

public class DescontoHandler extends AbstractDescontoHandler{

	public DescontoHandler() {
		this.proximo = new Desconto5Handler();
	};
	
	public Double calcularDesconto(Pedido pedido) {
		if (pedido.getItens().size() > 5) {
			return this.proximo.calcularDesconto(pedido);
		}
		
		else {
			return pedido.getValor();
		}
	}
}

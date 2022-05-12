package handlers;

import Pedido.Item;
import Pedido.Pedido;

public abstract class AbstractDescontoHandler implements IDescontoHandler {

	protected IDescontoHandler proximo;
	
	protected void valorDesconto(Pedido pedido, Double desconto) {
		
    	Double valorDesconto = 0.0;
    	
    	for (Item item : pedido.getItens())  {
    		valorDesconto = valorDesconto + item.getValor() - desconto;
    	}

    	pedido.setValor(valorDesconto);
	}
	
}

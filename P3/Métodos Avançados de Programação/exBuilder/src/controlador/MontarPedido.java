package controlador;

import modelo.Pedido;
import modelo.PedidoBuilder;

public class MontarPedido {

	private PedidoBuilder pedidoFeito;
	
	public MontarPedido() {
		pedidoFeito = new PedidoBuilder();
	}
	
	public Pedido montar(String hamburguer, String batata, String brinquedo, String refrigerante) {
		pedidoFeito.montarDentroDaCaixa(hamburguer, batata, brinquedo);
		pedidoFeito.montarForaDaCaixa(refrigerante);
		
		return pedidoFeito.getPedido();
	}
}

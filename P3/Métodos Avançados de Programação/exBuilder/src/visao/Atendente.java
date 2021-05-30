package visao;

import controlador.MontarPedido;
import modelo.Pedido;

public class Atendente {

	public static void main(String args[]) {
		
		MontarPedido montarPedido = new MontarPedido();
		
		Pedido pedido = montarPedido.montar("Cheeseburguer", "Média", "Carrinho", "Guaraná");
				
		System.out.println(pedido);
	}
}

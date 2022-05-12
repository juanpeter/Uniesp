import Pedido.Item;
import Pedido.Pedido;
import handlers.Desconto10Handler;
import handlers.Desconto50Handler;
import handlers.Desconto5Handler;
import handlers.DescontoHandler;
import handlers.IDescontoHandler;

public class CalculaDesconto {
    public static void main(String[] args) {

        final Pedido pedido = new Pedido();
    	
    	Item item1 = new Item("Item 1", 5.00);
        pedido.addItem(item1);

    	Item item2 = new Item("Item 2", 5.00);
        pedido.addItem(item2);
    	
    	Item item3 = new Item("Item 3", 5.00);
        pedido.addItem(item3);

    	Item item4 = new Item("Item 4", 5.00);
        pedido.addItem(item4);

    	Item item5 = new Item("Item 5", 5.00);
        pedido.addItem(item5);

    	Item item6 = new Item("Item 6", 5.00);
        pedido.addItem(item6);
    	
    	Item item7 = new Item("Item 7", 5.00);
        pedido.addItem(item7);

    	Item item8 = new Item("Item 8", 5.00);
        pedido.addItem(item8);

    	Item item9 = new Item("Item 9", 5.00);    	
        pedido.addItem(item9);

    	Item item10 = new Item("Item 10", 5.00);    	
        pedido.addItem(item10);

    	Item item11 = new Item("Item 11", 5.00);
        pedido.addItem(item11);

                
        System.out.println(calculaDescontoDoPedido(pedido));
    }


    public static Double calculaDescontoDoPedido(Pedido pedido) {

    	IDescontoHandler descontoHandler = new DescontoHandler();
    	
    	return descontoHandler.calcularDesconto(pedido);
    }
}

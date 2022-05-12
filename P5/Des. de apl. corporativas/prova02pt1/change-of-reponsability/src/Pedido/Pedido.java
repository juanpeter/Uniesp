package Pedido;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Item> itens;
    private Double valor;
    
    public Pedido() {
    	this.itens = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.itens.add(item);
    }

    public List<Item> getItens(){
        return this.itens;
    }

    public Double getValor(){
    	return this.valor;
    }
    public void setValor(Double valor) {
    	this.valor = valor;
    }
}

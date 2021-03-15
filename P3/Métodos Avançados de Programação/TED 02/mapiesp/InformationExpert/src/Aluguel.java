
public class Aluguel {
	private Cliente cliente;
	private Fita fita;
    private int diasAlugada;
    private Double precoAluguel;
    private int pontosAluguel;

    public Aluguel(Cliente cliente, Fita fita, int diasAlugada) {
    	this.cliente = cliente;
        this.fita = fita;
        this.diasAlugada = diasAlugada;        
    }
    
    public Aluguel() {}

    public Cliente getCliente() {
    	return cliente;
    }
    
    public void setCliente(Cliente cliente) {
    	this.cliente = cliente;
    }
    
    public Fita getFita() {
        return fita;
    }
    
    public void setFita(Fita fita) {
        this.fita = fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
    
    public void setDiasAlugada(int diasAlugada) {
        this.diasAlugada = diasAlugada;
    }
    
    public Double getPrecoAluguel() {
    	return precoAluguel;
    }
    
    public void setPrecoAluguel(Double precoAluguel) {
    	this.precoAluguel = precoAluguel;
    }
    
    public int getPontosAluguel() {
    	return pontosAluguel;
    }
    
    public void setPontosAluguel(int pontosAluguel) {
    	this.pontosAluguel = pontosAluguel;
    }
    
    public String toString() {
    	return "\nFita alugada: " + fita.getTitulo() +
    			" | Tempo de aluguel: " + this.diasAlugada +
    			" | Preço do aluguel: " + this.precoAluguel +
    			" | Pontos do aluguel: " + this.pontosAluguel;
    }
    
	public Double calcularPrecoAluguel() {

		Double valorPreco = 0.0;

	    switch (this.getFita().getCodigoDePreco()) {
	        case normal:
	        	valorPreco += 2;
	            if (this.getDiasAlugada() > 2) {
	            	valorPreco += (this.getDiasAlugada() - 2) * 1.5;
	            }
	            break;
	        case lancamento:
	        	valorPreco += this.getDiasAlugada() * 3;
	            break;
	        case infantil:
	        	valorPreco += 1.5;
	            if (this.getDiasAlugada() > 3) {
	            	valorPreco += (this.getDiasAlugada() - 3) * 1.5;
	            }
	            break;
        }
	    

	    return valorPreco;
	}
	
	public int calcularPontosAluguel() {
		int valorPontosDeAluguel = 1;
    	if (this.getDiasAlugada() > 1 && this.getFita().getCodigoDePreco() == Tipo.lancamento) {
    		valorPontosDeAluguel++;
    	}
    	return valorPontosDeAluguel;
	}

}

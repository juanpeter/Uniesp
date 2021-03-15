import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
	
    private String nome;
    private int pontosDeAluguelFrequente;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Cliente(String nome, int pontosDeAluguelFrequente) {
        this.nome = nome;
        this.pontosDeAluguelFrequente = pontosDeAluguelFrequente;
    }
    
    public Cliente() {}

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getPontosDeAluguelFrequente() {
    	return pontosDeAluguelFrequente;
    }
    
    public void setPontosDeAluguelFrequente(int valor) {
    	this.pontosDeAluguelFrequente = valor;
    }

    public Collection<Aluguel> getFitasAlugadas() {
    	return fitasAlugadas;
    }
    
    public void setFitasAlugadas(Collection<Aluguel> fitas) {
    	this.fitasAlugadas = fitas;
    }
    
    public String toString() {
    	return "Nome: " + this.nome + 
    			"\nAlugueis: " + this.fitasAlugadas +
    			"\nPontos de aluguel: " + this.pontosDeAluguelFrequente;
    }
    
    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }
    
    public String gerarExtratoCliente() {
    	
    	Double precoAluguelTotal = 0.0;
    	int pontosAluguelTotal = 0;
        final String fimDeLinha = System.getProperty("line.separator");
    	String mensagemExtrato = "Registro de Alugueis de " + getNome() + fimDeLinha;
    	
    	for (Aluguel aluguel : fitasAlugadas) {
    		Double precoAluguel = aluguel.calcularPrecoAluguel();
    		int pontosAluguel = aluguel.calcularPontosAluguel();
    		
    		pontosAluguelTotal += pontosAluguel;
    		
    		mensagemExtrato += "\t" + aluguel.getFita().getTitulo() + "\tR$"
	          + precoAluguel + fimDeLinha;
    		precoAluguelTotal += precoAluguel;
    	}
    	
    	mensagemExtrato += "Valor total devido: R$" + precoAluguelTotal + fimDeLinha;
    	mensagemExtrato += "Voce acumulou " + pontosAluguelTotal
                     + " pontos de alugador frequente";
    	
    	return mensagemExtrato;
    }
    
}
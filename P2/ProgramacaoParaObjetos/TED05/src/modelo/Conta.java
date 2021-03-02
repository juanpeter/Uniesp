// Conta deve ter os atributos: 
// numero (int) e saldo (double), 
// além de seu construtores, gets, sets, toString.
package modelo;

public class Conta {
	//atributos
	private int numero;
	private double saldo;
	
	//construtores
	public Conta(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public Conta() {
		
	}
	//gets & sets
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int novoNumero) {
		this.numero = novoNumero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double novoSaldo) {
		this.saldo = novoSaldo;
	}
	
	// Métodos
	public String toString() {
		return "\n Conta:\n - Número: " + this.numero + "\n - Saldo: " + this.saldo;
	}
	
}

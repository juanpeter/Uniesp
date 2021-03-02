// Crie um projeto que utilize
// um ArrayList de objetos da classe Conta
// e determine o número da conta de maior saldo.
package visao;

import java.util.ArrayList;
import modelo.Conta;
import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		ArrayList<Conta> listaDeContas = new ArrayList<Conta>();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o valor do número da primeira conta: ");
		int n1 = entrada.nextInt();
		System.out.println("Insira o valor do saldo da primeira conta: ");
		double d1 = entrada.nextDouble();
		Conta c1 = new Conta(n1, d1);
		
		System.out.println("Insira o valor do número da segunda conta: ");
		int n2 = entrada.nextInt();
		System.out.println("Insira o valor do saldo da segunda conta: ");
		double d2 = entrada.nextDouble();
		Conta c2 = new Conta(n2, d2);

		entrada.close();
		
		listaDeContas.add(c1);
		listaDeContas.add(c2);
		
		double maiorSaldo = 0;
		int numeroComMaiorSaldo = 0;
		
		for (Conta temp : listaDeContas) {
			if (temp.getSaldo() > maiorSaldo) {
				maiorSaldo = temp.getSaldo();
				numeroComMaiorSaldo = temp.getNumero();
			}
		}
		System.out.println("O número de conta com maior saldo é: " + numeroComMaiorSaldo);
	}
}

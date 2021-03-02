package visao;

import modelo.Funcionario;

public class Teste {
	public static void main(String[] args) {
		
		Funcionario[] listaFuncionarios = new Funcionario[5];
		
		// Criar funcionários, por que preguiça de escrever
		for (int i=0; i<listaFuncionarios.length; i++) {
			listaFuncionarios[i] = new Funcionario(
				(i+1) * 111, 
				i+1, 
				(i+1) * 1000,
				(i+1) * 11111111, 
				true);
			System.out.println(listaFuncionarios[i].getId());
		}		
		
	}
}

package visao;

import modelo.Livro;
import modelo.Revista;

public class Teste {
	public static void main(String args[]) {
		Revista mundoEstranho = new Revista("Mundo Estranho", 12112020, "Abril", "mensal");
		Livro memoriasPostumasdeBrasCubas = new Livro("Memórias Póstumas de Brás Cubas", 12112020, "Panda Books", "978-3-16-148410-0");
	
		System.out.println(mundoEstranho.toString() + "\n" + memoriasPostumasdeBrasCubas.toString());
	}
}

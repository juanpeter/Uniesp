package visao;

import java.util.ArrayList;

public class Teste {
	public static void main(String[] args) {
		
		// Primeira forma
		ArrayList lista1 = new ArrayList();
		lista1.add(10);
		lista1.add("Java");
//		Esse irá mostrar o método toString()
//		lista1.add(new Retangulo(2,4));
		
		System.out.println("For 1:");
		for (int i=0; i<lista1.size(); i++) {
			System.out.println("Posição " +i+": "+lista1.get(i));
		}
		
		System.out.println("For 2:");
		for (Object temp : lista1) {
			System.out.println(temp);
		}
		
//		String aux = (String) lista1.get(1);
		
		// Segunda forma
		ArrayList<String> lista2 = new ArrayList<String>();
		lista2.add("Uniesp");
		lista2.add("Semana de provas");
//		lista2.add(10); ERRO
//		System.out.println(lista2.get(0));
		
//		aux = lista2.get(1);
	}
}

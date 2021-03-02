package visao;

import modelo.Aluno;

public class Teste {
	
	public static void main(String[] args) {
		
		//declarar - tamanho
		int[] numeros = new int[5];
		numeros[0] = 12;
		numeros[4] = 20;
		
		String[] listaNomes = new String[5];
		listaNomes[0] = "Leonardo";
		listaNomes[1] = "Alana";
		
//		for (int i=0; i<5; i++) {
//			System.out.println(numeros[i]);
//		}
		
//		Aluno[] listaAlunos = new Aluno[5];
//		Aluno a1 = new Aluno("Igor", 123, "Sistemas da Informação");
//		listaAlunos[0] = a1;
//		listaAlunos[1] = new Aluno("João", 321, "Sistemas para Internet");
		
		Aluno[] listaAlunos = {
				new Aluno("Igor", 123, "Sistemas da Informação"),
            	new Aluno("João", 321, "Sistemas para Internet"),
                new Aluno("Alana", 423, "Sistemas da Informação")
            };
		
//		for (int i=0; i < listaAlunos.length; i++) {
//			System.out.println(listaAlunos[i].getNome());
//		}
		
		
		// Nova lista com os elementos anteriores
		Aluno[] novaLista = new Aluno[4];
		for (int i=0; i < listaAlunos.length; i++) {
			novaLista[i] = listaAlunos[i];
		}
		novaLista[3] = new Aluno("Pedro", 222, "Sistemas para Internet");
		
		for (int i=0; i < novaLista.length; i++) {
			System.out.println(novaLista[i].getNome());
		}
	}
}

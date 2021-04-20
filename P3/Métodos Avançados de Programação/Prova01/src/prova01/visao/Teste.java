package prova01.visao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import prova01.modelo.Nome;
import prova01.modelo.NomeFactory;

/*
  	[X]  Construa um programa que receba como parâmetro um ou mais nomes, cada um
		 podendo estar em um dos seguintes formatos:
	
		● “primeiroNome sobrenome” ou
		● “sobrenome, primeiroNome” ou
		● “primeiroNome outrosNomes sobrenome”
	
	[X] Escreva no teste dois exemplos de construção de nomes, uma para cada formato.
	[X] O usuário quem deve passar essas informações.
	[X] Cada estratégia deve ser responsável por armazenar os nomes criados e imprimi-los
		quando requisitado.
	
	[X] Implemente o padrão Factory Method de forma que somente a criação do nome seja delegada às
		aplicações concretas (subclasses). 
	[X]	Seu programa deve criar as duas aplicações e construir objetos da classe Nome, que deve ter
		atributos primeiroNome e sobrenome para armazenar as informações em separado.
		 
	[X]	Os nomes não precisam ser impressos em ordem. Crie pelo menos dois exemplos de cada.
	
	Deve retornar conforme o modelo:
	
	Entrada: 
		Amado, Jorge
		Carla Barbosa Silva
		Veloso, Caetano
		Gilberto Gil
	Saída:
		Jorge Amado
		Carla Silva
		Caetano Veloso
		Gilberto Gil
*/
 

public class Teste {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		List<Nome> listaNomes = new ArrayList<Nome>();
		NomeFactory nf = new NomeFactory();
//		Nome nome1 = nf.criarNome("Amado, Jorge");
//		Nome nome2 = nf.criarNome("Carla Barbosa Silva");
//		Nome nome3 = nf.criarNome("Gilberto Gil");
//		System.out.println(nome1);
//		System.out.println(nome2);
//		System.out.println(nome3);
		
		System.out.println("Bem vindo ao sistema de nomes:"
				+ "\nPor favor insira os nomes desejados:");
		
		boolean continuar = true;
		do {
			String nomeCompleto = input.nextLine();
			Nome nomeUsuario = nf.criarNome(nomeCompleto);
			listaNomes.add(nomeUsuario);
			
			System.out.println("Deseja inserir mais um nome? S/N");
			
			String resposta = input.nextLine();
			
			if (resposta.equals("N")) {
				continuar = false;
			} else if (resposta.equals("S")) {
				System.out.println("Insira o nome desejado:");
			}
		}
		while(continuar);

		input.close();

		System.out.println("Os nomes digitados foram: " + listaNomes);
		
	}
}

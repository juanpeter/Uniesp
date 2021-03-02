package visao;

//Não esqueça de implementar a classe Teste, para mostrar a classe funcionando.

//Todas as questões precisam ter mensagens claras e interações com o usuário 
//para passagem de informações. A organização de código e boas nomenclaturas
//serão analisadas.

import java.util.Scanner;

import modelo.Aluno;
import modelo.Prova;

public class Teste {
	public static void main(String[] args) {
		
		// Criar o Scanner
		Scanner scan = new Scanner(System.in);
		
		// Iniciar coleta de dados para criação do Aluno
		System.out.println("Bem vindo ao sistema de correção de provas"
				+ "\nPor favor informe o nome do aluno que fez a prova:");
		
		String nomeAluno = scan.next();
		
		System.out.println("Ok, o aluno é " + nomeAluno + "."
				+ "\n Devido a um problema em nossa base de dados, por favor insira o número de matrícula do aluno: ");
		int numMatricula = scan.nextInt();
		
		System.out.println("Muito, obrigado! Antes de prosseguir, por favor informe o curso que o aluno " + nomeAluno + " faz: ");
		String curso = scan.next();
		
		Aluno aluno = new Aluno(nomeAluno, numMatricula, curso);
		
		System.out.println("Aluno recadastrado com sucesso!");
		// Retornar dados para o usuário
		System.out.println(aluno.toString());

		// Iniciar coleta de dados para construir a Prova
		System.out.println("Muito obrigado pela paciência, podemos proceder para a prova:");
		
		System.out.println("Qual o número identificador (Id) da prova?");
		int idProva = scan.nextInt();
		
		// Essa variável auxilia no cálculo da nota
		System.out.println("Qual a nota máxima da prova?");
		int notaMax = scan.nextInt();
		
		// Essa variável determina o tamanho dos arrays 
		System.out.println("Quantas perguntas a prova tem?");
		int quantidadeDePerguntas = scan.nextInt();
		
		//	Declarar variáveis para construir a prova
		String perguntas[] = new String[quantidadeDePerguntas];
		int pesos[] = new int[quantidadeDePerguntas];
		String respostaCerta[] = new String[quantidadeDePerguntas];
		String respostas[][] = new String[quantidadeDePerguntas][];
		String respostaAluno[] = new String[quantidadeDePerguntas];

		// Loop de coleta de dados
		for (int i = 0; i < quantidadeDePerguntas; i++) {
			
			// Por brevedade, todas as perguntas são referidas como "Questão x"
			perguntas[i] = "Questão "+ (i +1);

			// Alimentar o array pesos[]
			// Como todas as perguntas podem ter pesos diferentes, essa pergunta sempre é refeita
			// para cada questão
			System.out.println("Informe o peso da questão " + (i+1) + ":");
			pesos[i] = scan.nextInt();
			
			// Alimentar o array respostaCerta[]
			System.out.println("Qual é a resposta para a questão " + (i+1) + "?");
			respostaCerta[i] = scan.next();
			
			// As perguntas podem ter um número variável de respostas entre elas, 
			// o usuário deve informá-las
			System.out.println("Quantas opções de respostas existem para a questão " + (i + 1) + "?");
			
			// Essa variavel apenas auxilia no loop abaixo:
			int numRespostas = scan.nextInt();
			String arrayResposta[] = new String[numRespostas];
			
			// Marcar as opções para todas as perguntas:
			for (int n = 0; n < numRespostas; n++) {
				System.out.println("Por favor digite a opção número " + (n+1));
				arrayResposta[i] = scan.next();
			}
			
			System.out.println("Qual foi a resposta do aluno na questão " + (i+1) + "?");
				respostaAluno[i] = scan.next();
		}
		
		scan.close();
				
		Prova geografia = new Prova(
				idProva,
				aluno,
				notaMax,
				pesos,
				respostaCerta,
				perguntas,
				respostas,
				respostaAluno
				);
		
		// Confirmar o sucesso da prova
		System.out.println("A prova foi cadastrada com sucesso!");


		System.out.println("A nota final do aluno " +aluno.getNome()+ " na prova de Geografia é: " + geografia.calcularNota() + "/" + notaMax);
	}
}

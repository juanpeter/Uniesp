// A idéia é isolar o máximo entre si as classes
// Use a classe retangulo para fazer o cálculo

package teste;

import java.util.Scanner;

import modelo.Retangulo;
import modelo.Moldura;

public class Teste {
	
	// Aqui vai o main(String[] args)
	public static void main(String[] args) {
		
		double b, a, e;
		Retangulo r1, r2;
		Moldura m;
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Informe a base da moldura: ");
		b = input.nextDouble();
		
		System.out.println("Informe a altura da moldura: ");
		a = input.nextDouble();
		
		System.out.println("Informe a expessura da moldura: ");
		e = input.nextDouble();
		
		
		input.close();
		
		// Instanciar
		r1 = new Retangulo(b, a);
		r2 = new Retangulo(b - 2*e, a-2*e);
		m = new Moldura(r1, r2);
		
		System.out.println("Sua moldura mede " + m.areaMoldura());
		System.out.println("O preço da moldura é: " + m.precoMoldura(3));

	}
}

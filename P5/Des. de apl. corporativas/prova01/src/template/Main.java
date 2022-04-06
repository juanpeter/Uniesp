package template;

public class Main {

	public static void main(String[] args) {
		BoloMorango boloMorango = new BoloMorango();
		System.out.println(boloMorango.montarBolo());
		
		BoloChocolate boloChocolate = new BoloChocolate();
		System.out.print(boloChocolate.montarBolo());
		
		BoloRedVelvet boloRedVelvet = new BoloRedVelvet();
		System.out.print(boloRedVelvet.montarBolo());
	}
}

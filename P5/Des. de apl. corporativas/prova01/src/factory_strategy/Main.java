package factory_strategy;

public class Main {

	public static void main(String[] args) {
		
		PadariaFactoryPB ppb = new PadariaFactoryPB();
		
		SacoPao sacoPb = ppb.fazerPaes(5);
		
		System.out.println(sacoPb.toString());
		
		PadariaFactorySP psp = new PadariaFactorySP();
		
		SacoPao sacoSp = psp.fazerPaes(5);
		
		System.out.println(sacoSp.toString());

	}
}

package template;

public class BoloChocolate extends TemplateBolo {
	
	@Override
	void escolherMassa(Bolo bolo) {
		bolo.setMassa("chocolate");
	}

	@Override
	void escolherRecheio(Bolo bolo) {
		bolo.setRecheio("chocolate branco");
	}

	@Override
	void escolherFruta(Bolo bolo) {
		bolo.setFruta("Sem pedaços de frutas");
	}

	@Override
	String servir(Bolo bolo) {
		return "Aqui está seu bolo de " + bolo.getMassa() + " com recheio de " + bolo.getRecheio() + "\nBon appetit!\n";
	}
	

}

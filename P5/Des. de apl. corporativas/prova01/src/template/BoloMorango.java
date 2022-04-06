package template;

public class BoloMorango extends TemplateBolo {
	
	@Override
	void escolherMassa(Bolo bolo) {
		bolo.setMassa("branca");
	}

	@Override
	void escolherRecheio(Bolo bolo) {
		bolo.setRecheio("morango");
	}

	@Override
	void escolherFruta(Bolo bolo) {
		bolo.setFruta("pedaços de morango");
	}

	public String servir(Bolo bolo) {
		return "Aqui está seu bolo de " + bolo.getRecheio() + " com massa " + bolo.getMassa() + " e " + bolo.getFruta() + "\nBon appetit!\n";
	}
}

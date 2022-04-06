package template;

public abstract class TemplateBolo {

	public String montarBolo() {
		Bolo bolo = new Bolo();
		
		escolherMassa(bolo);
		escolherRecheio(bolo);
		escolherFruta(bolo);
		misturar();
		assar();
		retirarDoForno();
		
		return servir(bolo);		
	}
	
	abstract void escolherMassa(Bolo bolo);
	
	abstract void escolherRecheio(Bolo bolo);

	abstract void escolherFruta(Bolo bolo);
	
	public void misturar() {
		System.out.println("Misturando igredientes");
	}

	public void assar() {
		System.out.println("Assando bolo");
	}

	public void retirarDoForno() {
		System.out.println("Retirando do forno");
	}
	
	abstract String servir(Bolo bolo);

}

package prova01.modelo;


public class NomeFactory {
	
	public NomeFactory() {}
	
	public Nome criarNome(String nomeCompleto) {
		if (nomeCompleto.indexOf(", ") != -1) {
			return new SobrenomePrimeironome(nomeCompleto);
		}
		else {
			return new PrimeironomeSobrenome(nomeCompleto);
		}

	}

}

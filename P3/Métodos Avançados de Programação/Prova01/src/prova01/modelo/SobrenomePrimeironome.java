package prova01.modelo;

public class SobrenomePrimeironome extends Nome {
	
	public SobrenomePrimeironome(String nomeCompleto) {
		String sobreNome = nomeCompleto.substring(0, nomeCompleto.indexOf(", "));
		String primeiroNome = nomeCompleto.substring(
				nomeCompleto.indexOf(", ") + 2
		);
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
	}
}

package prova01.modelo;

public class PrimeironomeSobrenome extends Nome {

	public PrimeironomeSobrenome(String nomeCompleto) {
		String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "));
		String sobreNome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1);
		this.setPrimeiroNome(primeiroNome);
		this.setSobreNome(sobreNome);
	}
}

package prova01.modelo;

public class Nome {
	private String primeiroNome;
	private String sobreNome;	
	
	
	public String getPrimeiroNome() {
		return primeiroNome;
	}
	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	@Override
	public String toString() {
		return primeiroNome + " " + sobreNome;
	}
	
}

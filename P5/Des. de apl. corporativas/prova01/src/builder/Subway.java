package builder;

public class Subway {

	private Alface alface;
	private Proteina proteina;
	private Cebola cebola;
	private Tomate tomate;
	private Molho molho;
	private Pao pao;
	
	public Alface getAlface() {
		return alface;
	}
	public void setAlface(Alface alface) {
		this.alface = alface;
	}
	public Proteina getProteina() {
		return proteina;
	}
	public void setProteina(Proteina proteina) {
		this.proteina = proteina;
	}
	public Cebola getCebola() {
		return cebola;
	}
	public void setCebola(Cebola cebola) {
		this.cebola = cebola;
	}
	public Tomate getTomate() {
		return tomate;
	}
	public void setTomate(Tomate tomate) {
		this.tomate = tomate;
	}
	public Molho getMolho() {
		return molho;
	}
	public void setMolho(Molho molho) {
		this.molho = molho;
	}
	public Pao getPao() {
		return pao;
	}
	public void setPao(Pao pao) {
		this.pao = pao;
	}
	@Override
	public String toString() {
		return "Subway [alface=" + alface + ""
				+ ", proteina=" + proteina + ""
				+ ", cebola=" + cebola + ""
				+ ", tomate=" + tomate
				+ ", molho=" + molho + ""
						+ ", pao=" + pao + "]";
	}
	
}

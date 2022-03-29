package builder;

public class Main {

	public static void main(String[] args) {
		
		SubwayBuilder atendente = new SubwayBuilder();
		
		atendente.iniciarPedido();
		atendente.escolherPao("Italiano");
		atendente.adicionarAlface("Americana");
		atendente.adicionarCebola("Roxa");
		atendente.adicionarProteina("Frango Teriaki");
//		atendente.adicionarTomate("Não");
		atendente.adicionarMolho("Maionese");
		Subway pedidoFinalizado = atendente.finalizarPedido();
		
		System.out.println(pedidoFinalizado.toString());
	}
}

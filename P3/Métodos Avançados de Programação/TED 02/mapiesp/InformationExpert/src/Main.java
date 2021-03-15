
public class Main {
	public static void main(String[] args) {
		
		Cliente cliente =  new Cliente();
		cliente.setNome("João");
		cliente.setPontosDeAluguelFrequente(0);
		
		Fita fita1 = new Fita( "O Espanta Tubarões" , Tipo.infantil);		
		Aluguel aluguel1 = new Aluguel(cliente, fita1, 5);

		Fita fita2 = new Fita("Matrix", Tipo.lancamento);
		Aluguel aluguel2 = new Aluguel(cliente, fita2, 7);		

		Fita fita3 = new Fita( "Tubarão" , Tipo.normal);		
		Aluguel aluguel3 = new Aluguel(cliente, fita3, 3);
		
		cliente.adicionaAluguel(aluguel1);
		cliente.adicionaAluguel(aluguel2);
		cliente.adicionaAluguel(aluguel3);

		System.out.println(cliente.gerarExtratoCliente());
	}
}

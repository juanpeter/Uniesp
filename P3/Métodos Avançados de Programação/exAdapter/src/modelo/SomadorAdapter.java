package modelo;

import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado {

	@Override
	public int somaVetor(int[] vetor) {
		// cria lista vazia de Integer
		List<Integer> listaInteger = new ArrayList<>();
		// adiciona os elementos do vetor para a lista de Integer
		for (int i: vetor) listaInteger.add(i);
		// aciona o método da classe SomadorExistente
		int resultado = somaLista(listaInteger);
		// retorna resultado
		return resultado;
	}
	

}

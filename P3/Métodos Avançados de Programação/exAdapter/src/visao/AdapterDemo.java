package visao;

import controlador.Cliente;
import modelo.SomadorAdapter;
import modelo.SomadorEsperado;

public class AdapterDemo {

	public static void main(String[] args) {
		SomadorEsperado somador = new SomadorAdapter();

		Cliente client = new Cliente(somador);
		
		client.executar();
	}

}

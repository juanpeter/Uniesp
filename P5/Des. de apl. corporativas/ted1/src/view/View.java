package view;

import model.FuncionarioAbstract;
import model.FuncionarioFactory;
import model.ListaFuncionarios;

public class View {

	public static void main(String args[]) {
		
		ListaFuncionarios listaFuncionarios = new ListaFuncionarios();
		
		FuncionarioFactory factory = new FuncionarioFactory();
		
		FuncionarioAbstract funcionario1 = factory.getFuncionario(
												"01",
												"Pedro",
												"25",
												"Masculino",
												"TI", 
												true);
		
		listaFuncionarios.add(funcionario1);
		
		System.out.println(listaFuncionarios.toString());
	}
}

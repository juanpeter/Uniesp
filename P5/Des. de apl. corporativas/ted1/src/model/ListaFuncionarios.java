package model;

import java.util.ArrayList;
import java.util.List;

public class ListaFuncionarios {

	private ArrayList<FuncionarioAbstract> listaFuncionario = new ArrayList<FuncionarioAbstract>();
	
	public ListaFuncionarios() {}
	
	public List<FuncionarioAbstract> add(FuncionarioAbstract funcionario) {
		this.listaFuncionario.add(funcionario);
		
		return listaFuncionario;
	}
	
	public List<FuncionarioAbstract> getListaFuncionario() {
		return listaFuncionario;
	}

	public void setListaFuncionario(List<FuncionarioAbstract> listaFuncionario) {
		this.listaFuncionario = (ArrayList<FuncionarioAbstract>) listaFuncionario;
	}

	@Override
	public String toString() {
		return "ListaFuncionarios [listaFuncionario=" + listaFuncionario + "]";
	}
	
	
}

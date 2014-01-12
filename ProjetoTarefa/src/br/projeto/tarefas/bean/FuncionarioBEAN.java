package br.projeto.tarefas.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.projeto.tarefas.pojo.FuncionarioPOJO;

@ManagedBean
public class FuncionarioBEAN implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private FuncionarioPOJO funcionarioPOJO;
	private List<FuncionarioPOJO> listaFunc;
	
	
	public FuncionarioBEAN(){
		
		setFuncionarioPOJO(new FuncionarioPOJO());
	}

	// getters e setters

	public FuncionarioPOJO getFuncionarioPOJO() {
		return funcionarioPOJO;
	}

	public void setFuncionarioPOJO(FuncionarioPOJO funcionarioPOJO) {
		this.funcionarioPOJO = funcionarioPOJO;
	}

	public List<FuncionarioPOJO> getListaFunc() {
		
		
		
		
		return listaFunc;
	}

	public void setListaFunc(List<FuncionarioPOJO> listaFunc) {
		this.listaFunc = listaFunc;

	}

}

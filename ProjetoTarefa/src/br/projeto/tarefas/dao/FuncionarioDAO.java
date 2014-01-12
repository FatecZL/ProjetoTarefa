package br.projeto.tarefas.dao;

import java.util.ArrayList;
import java.util.List;

import br.projeto.tarefas.pojo.FuncionarioPOJO;

public class FuncionarioDAO extends DAO {

	
	
	
	public List<FuncionarioPOJO> pesquisarFuncionario(){
		
		
		List<FuncionarioPOJO> listaFunc = new ArrayList<FuncionarioPOJO>();
		
		
		try {
			
			
			abreConexao();
			st = cn.prepareStatement("SELECT * FROM TB_FUNCIONARIO");
			rs = st.executeQuery();
			while(rs.next()){
				
				FuncionarioPOJO funcionario = new FuncionarioPOJO();
				
				funcionario.setMatricula(rs.getString("matricula"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setEquipe(rs.getString("equipe"));
				funcionario.setSenha(rs.getString("senha"));
				funcionario.setCelular(rs.getString("celular"));
				
				listaFunc.add(funcionario);
				
			}
			
			
		} catch (Exception e) {
			 
		System.out.println(e.getMessage());
		}
		
		
		return listaFunc;
	}
	
	
}

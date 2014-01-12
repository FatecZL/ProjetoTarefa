package br.projeto.tarefas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
	
	
	protected Connection cn;
	protected PreparedStatement st;
	protected ResultSet rs;
	
	protected String erro;
	private String url="jdbc:mysql://localhost:3306/db_tarefas";
	
	
	public boolean abreConexao() throws Exception{
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url,"root","34878787");
			return true;
			
		} catch (Exception e) {
			erro = e.getMessage();
			throw e;
		}	
		
	}
	
	
	public String getErro(){
		return erro;
	}
	
	
	
	protected void fecharConexao() throws Exception{
		
		cn.close();
	}

}
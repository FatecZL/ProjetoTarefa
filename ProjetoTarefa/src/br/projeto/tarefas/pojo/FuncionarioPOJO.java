package br.projeto.tarefas.pojo;

public class FuncionarioPOJO {

	private String matricula;
	private String nome;
	private String equipe;
	private String senha;
	private String celular;

	
	public FuncionarioPOJO(){
		
		
	}
	
	public FuncionarioPOJO(String matricula, String nome, String equipe,
			String senha, String celular) {
		
		super();
	
	 this.matricula = matricula;
	 this.nome = nome;
	 this.equipe = equipe;
	 this.senha = senha;
	 this.celular = celular;

	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

}

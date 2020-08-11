package Pessoal;

import sistema.Usuario;

public abstract class Funcionario extends Usuario {
	
	private String cargo;
	private int senha;
	
	public Funcionario(String nome, String cpf, String cargo, int senha) {
		super(nome, cpf);
		this.cargo = cargo;
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}

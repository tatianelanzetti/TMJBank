package Pessoal;

import sistema.Usuario;

public abstract class Funcionario extends Usuario {
	
	private String cargo;
	
	public Funcionario(String cpf, int senha, String cargo) {
		super(cpf, senha);
		this.cargo = cargo;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}

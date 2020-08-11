package Carteira;

import sistema.Usuario;

public class Cliente extends Usuario {
	
	private int senha;
	
	public Cliente(String nome, String cpf, int senha) {
		super(nome, cpf);
		this.senha = senha;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	

}

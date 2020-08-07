package Carteira;

public class Cliente {
	
	private String cpf;
	private int senha;
	
	public Cliente(String cpf, int senha) {
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}

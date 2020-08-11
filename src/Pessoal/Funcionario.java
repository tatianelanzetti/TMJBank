package Pessoal;

public abstract class Funcionario extends Pessoa{
	
	private int senha;
	
	public Funcionario(int senha, String cpf, String tipo, String nome) {
		super(nome, cpf, tipo);
		this.senha = senha;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}

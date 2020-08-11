package Pessoal;

public abstract class Funcionario {
	
	private int senha;
	private String cpf;
	private String cargo;
	private String nome;
	
	public Funcionario(int senha, String cpf, String cargo, String nome) {
		this.senha = senha;
		this.cpf = cpf;
		this.cargo = cargo;
		this.nome = nome;
	}
	
	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}

package Pessoal;

public class Pessoa {
	private String nome;
	private String cpf;
	private String tipo;
	private int senha;
	
	
	public Pessoa(String nome, String cpf, String tipo, int senha) {
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}

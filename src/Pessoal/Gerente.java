package Pessoal;

public class Gerente extends Funcionario {
	
	private int agencia;

	public Gerente(String nome, String cpf, String tipo, int senha, int agencia) {
		super(nome, cpf, tipo, senha);
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}

package Pessoal;

public class Gerente extends Funcionario {
	
	private int agencia;

	public Gerente(int senha, String cpf, String tipo, String nome, int agencia) {
		super(senha, cpf, tipo, nome);
		this.agencia = agencia;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
}

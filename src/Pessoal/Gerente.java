package Pessoal;

public class Gerente extends Funcionario {
	
	private int agencia;

	public Gerente(String cpf, String senha, String cargo, int agencia) {
		super(cpf, senha, cargo);
		this.agencia = agencia;
	}
	
}

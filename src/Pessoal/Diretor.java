package Pessoal;

public class Diretor extends Funcionario{
	
	private int diretoria;
	
	public Diretor(String cpf, String senha, String cargo, int diretoria) {
		super(cpf, senha, cargo);
		this.diretoria = diretoria;
	}

}

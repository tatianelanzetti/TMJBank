package Pessoal;

public class Diretor extends Funcionario{
	
	private int diretoria;
	
	public Diretor(String cpf, int senha, String cargo, int diretoria) {
		super(cpf, senha, cargo);
		this.diretoria = diretoria;
	}

	public int getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(int diretoria) {
		this.diretoria = diretoria;
	}

}

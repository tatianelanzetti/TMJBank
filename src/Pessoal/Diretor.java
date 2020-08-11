package Pessoal;

public class Diretor extends Funcionario{
	
	private int diretoria;
	
	public Diretor(int senha, String cpf, String cargo, String nome, int diretoria) {
		super(senha, cpf, cargo, nome);
		this.diretoria = diretoria;
	}

	public int getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(int diretoria) {
		this.diretoria = diretoria;
	}

}

package Pessoal;

public class Diretor extends Funcionario{
	
	private int diretoria;
	
	public Diretor(String nome, String cpf, String cargo, int senha, int diretoria) {
		super(nome, cpf, cargo, senha);
		this.diretoria = diretoria;
	}

	public int getDiretoria() {
		return diretoria;
	}

	public void setDiretoria(int diretoria) {
		this.diretoria = diretoria;
	}

}

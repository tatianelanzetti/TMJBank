package sistema;

public class Usuario {
	
	private String cpf;
	private int senha;
	
	public Usuario(String cpf, int senha) {
		this.cpf = cpf;
		this.senha = senha;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

}

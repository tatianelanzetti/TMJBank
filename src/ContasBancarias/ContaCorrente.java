package ContasBancarias;

public class ContaCorrente extends Conta{
	
	private String tipo;

	public ContaCorrente(String cpf, double saldo, int agencia, String tipo) {
		super(cpf, saldo, agencia);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	

}

package ContasBancarias;

public class ContaPoupanca extends Conta {
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ContaPoupanca(String cpf, double saldo, int agencia, String tipo) {
		super(cpf, saldo, agencia);
		this.tipo = tipo;
	}


}

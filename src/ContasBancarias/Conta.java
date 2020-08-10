package ContasBancarias;

public abstract class Conta {
	
	private String cpf;
	private double saldo;
	private int agencia;
	
	public Conta(String cpf, double saldo, int agencia) {
		this.cpf = cpf;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public void Sacar() {}
	public void Depositar () {}
	public void Transferir() {}
	public void DepositarTransferencia(double valor ) {}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

}

package ContasBancarias;


public abstract class Conta {
	
	private static int totalDeContas = 0;
	private String cpf;
	private double saldo;
	private int agencia;
	private String tipo;
	
	public Conta(String cpf, double saldo, int agencia, String tipo) {
		this.cpf = cpf;
		this.saldo = saldo;
		this.agencia = agencia;
		this.tipo = tipo;
		Conta.totalDeContas++;
	}
	
	public abstract void Sacar(double valor);
	public abstract void Depositar (double valor);
	public abstract void Transferir(Conta destino, double valor);
	public abstract void DepositarTransferencia(double valor );
	
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

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

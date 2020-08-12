package ContasBancarias;

public class ContaPoupanca extends Conta implements taxas{
	
	private int qtdSaque = 0, qtdDeposito = 0, qtdTransferencia = 0;
		
	public ContaPoupanca(String cpf, double saldo, int agencia, String tipo) {
		super(cpf, saldo, agencia, tipo);
	}
	
	@Override
	public void Sacar (double valor) {
		if(this.getSaldo()>=valor + TAXASAQUE) {
		double saque = this.getSaldo() - valor - TAXASAQUE;
		this.setSaldo(saque);
		this.qtdSaque++;
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	@Override
	public void Depositar (double valor) {
		double deposite = this.getSaldo() + valor - TAXADEPOSITO;
		this.setSaldo(deposite);
		this.qtdDeposito++;
	}
	@Override
	public void DepositarTransferencia (double valor) {
		double deposite = this.getSaldo() + valor;
		this.setSaldo(deposite);
	}
	@Override
	public void Transferir (Conta Destino, double valor) {
		if (this.getSaldo() >= valor + TAXATRANSFERENCIA) {
			this.Sacar(valor + TAXASAQUE);
			Destino.DepositarTransferencia(valor);
			this.qtdTransferencia++;
			
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public int getQtdSaque() {
		return qtdSaque;
	}

	public int getQtdDeposito() {
		return qtdDeposito;
	}

	public int getQtdTransferencia() {
		return qtdTransferencia;
	}

}

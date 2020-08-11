package ContasBancarias;

public class ContaPoupanca extends Conta {
		
	public ContaPoupanca(String cpf, double saldo, int agencia, String tipo) {
		super(cpf, saldo, agencia, tipo);
	}
	
	@Override
	public void Sacar (double valor) {
		if(this.getSaldo()>=valor + 0.10) {
		double saque = this.getSaldo() - valor - 0.10;
		this.setSaldo(saque);
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	@Override
	public void Depositar (double valor) {
		double deposite = this.getSaldo() + valor - 0.10;
		this.setSaldo(deposite);
	}
	@Override
	public void DepositarTransferencia (double valor) {
		double deposite = this.getSaldo() + valor;
		this.setSaldo(deposite);
	}
	@Override
	public void Transferir (Conta Destino, double valor) {
		if (this.getSaldo() >= valor + 0.20) {
			this.Sacar(valor + 0.10);
			Destino.DepositarTransferencia(valor);
			
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}

}

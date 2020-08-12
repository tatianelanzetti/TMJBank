package ContasBancarias;

public class ContaCorrente extends Conta implements taxas{

	public ContaCorrente(String cpf, double saldo, int agencia, String tipo) {
		super(cpf, saldo, agencia, tipo);
	}
	
	@Override
	public void Sacar (double valor) {
		if(this.getSaldo()>=valor + TAXASAQUE) {
		double saque = this.getSaldo() - valor - TAXASAQUE;
		this.setSaldo(saque);
		}
		else {
			System.out.println("Saldo insuficiente.");
		}
	}
	@Override
	public void Depositar (double valor) {
		double deposite = this.getSaldo() + valor - TAXADEPOSITO;
		this.setSaldo(deposite);
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
			
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}	

}

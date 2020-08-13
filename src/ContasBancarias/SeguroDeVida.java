package ContasBancarias;

public class SeguroDeVida {
	private double valor;
	private static int nroApolice = 0;
	
	public SeguroDeVida() {
		nroApolice++;
	}
	
	public boolean contrata(Conta conta, double valor) {

		this.valor = valor;
		
		double precoSeguro = valor * taxas.TAXASEGUROVIDA;
		double saldo = ((ContaCorrente)conta).getSaldo();

		if( saldo >= precoSeguro) {
			((ContaCorrente)conta).setSaldo(saldo - precoSeguro);
			((ContaCorrente)conta).setTemSeguro(true);
			((ContaCorrente)conta).setValorSeguro(valor);
			return true;
		}
			System.out.println("Valor do saldo insuficiente!");
			return false;
	}

	public double getValor() {
		return valor;
	}
	public static int getNroApolice() {
		return nroApolice;
	}
	
}

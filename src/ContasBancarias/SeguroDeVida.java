package ContasBancarias;

import java.util.Scanner;

public class SeguroDeVida {
	private double valor;
	private static int nroApolice = 0;
	
	public SeguroDeVida() {
		nroApolice++;
	}
	
	public void contrata(Conta conta) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Contratação de Seguro de Vida");
		System.out.println("Informe o valor: ");
		valor = input.nextDouble();
		
		double precoSeguro = valor * taxas.TAXASEGUROVIDA;
		double saldo = ((ContaCorrente)conta).getSaldo();

		if( saldo >= precoSeguro) {
			((ContaCorrente)conta).setSaldo(saldo - precoSeguro);
			((ContaCorrente)conta).setTemSeguro(true);
			((ContaCorrente)conta).setValorSeguro(valor);
		}
		else {
			System.out.println("Valor do saldo insuficiente!");
			
		}
	}

	public double getValor() {
		return valor;
	}
	public static int getNroApolice() {
		return nroApolice;
	}
	
}

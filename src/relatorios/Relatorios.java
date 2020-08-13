package relatorios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import ContasBancarias.Conta;
import ContasBancarias.ContaCorrente;
import ContasBancarias.taxas;
import Pessoal.Pessoa;
import Principal.VerificaListas;

public class Relatorios {
	Scanner input = new Scanner(System.in);
	
	public double tributacao(Conta conta) {
		double qtdSaque = ((ContaCorrente)conta).getQtdSaque();
		double qtdDeposito = ((ContaCorrente)conta).getQtdDeposito();
		double qtdTransferencia = ((ContaCorrente)conta).getQtdTransferencia();
		double totalGastos = (qtdSaque*taxas.TAXASAQUE)+(qtdDeposito*taxas.TAXADEPOSITO)+(qtdTransferencia*taxas.TAXATRANSFERENCIA);
		
		
		System.out.println("                   Total de tributos pagos em operações: "+totalGastos);
		
		System.out.println("                   Quantidade de Saques: "+qtdSaque);
		System.out.println("                   Tributos pagos para saque: "+qtdSaque*taxas.TAXASAQUE);
		
		System.out.println("                   Quantidade de Depósitos: "+qtdDeposito);
		System.out.println("                   Tributos pagos para depósito: "+qtdDeposito*taxas.TAXADEPOSITO);
		
		System.out.println("                   Quantidade de transferência: "+qtdTransferencia);
		System.out.println("                   Tributos pagos para trasnferência: "+qtdTransferencia*taxas.TAXATRANSFERENCIA);
		
		System.out.println("");
		System.out.println("                              **Valor dos Tributos**");
		System.out.println("                   Tributo para saque: "+taxas.TAXASAQUE);
		System.out.println("                   Tributo para depósito: "+taxas.TAXADEPOSITO);
		System.out.println("                   Tributo para transferência: "+taxas.TAXATRANSFERENCIA);
		
		if(((ContaCorrente)conta).isTemSeguro()) {
			double valorSegurado = ((ContaCorrente)conta).getValorSeguro();
			System.out.println("                      Valor do seguro de vida contratado: " +valorSegurado );
			System.out.println("                      Taxa debitada no ato da contratação: " +valorSegurado*taxas.TAXASEGUROVIDA);
		}
		return totalGastos;
	}
	
	public void rendimento(double valor, int prazo) {	
		DecimalFormat df = new DecimalFormat("#.00");
		double rendimento = taxas.TAXARENDIMENTOPOUPANCA * prazo * valor;
		
		System.out.println("                    Rendimento após "+prazo+" dias: " +df.format(rendimento));	
		
	}	
	
	public int gerente(List<Conta> listaConta, Conta conta) {
		int contasNaAgencia = 0;
		int agencia = conta.getAgencia();
		
		for(int i = 0; i < listaConta.size(); i++) {
			if(agencia == listaConta.get(i).getAgencia())
				contasNaAgencia++;
		}
		System.out.println("                         Numeros de Contas da agência: " +contasNaAgencia);
		System.out.println("                  *********************************************");
		System.out.println("                               Final do Relatório");
		return contasNaAgencia;
		
	}
	
	public List<String> diretor(List<Conta> listaConta, List<Pessoa> listaPessoa) {
		List<String> lista = new  ArrayList<>();
		for(int i = 0; i < listaConta.size(); i++) {
			String cpf = listaConta.get(i).getCpf();
			int agencia = listaConta.get(i).getAgencia();
			String nome = VerificaListas.encontraPessoa(cpf, listaPessoa);
			String linha = "\n          *********************************************\n          Nome: "+nome +"\n          CPF:"+cpf+"\n          Agência:"+agencia;
			lista.add(linha);
			
		}
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println("                  *********************************************");
		System.out.println("                               Final do Relatório");
		return lista;
	}	
	
	public double presidente(List<Conta> listaConta) {
		double totalPassivo = 0;
		for(int i = 0; i<listaConta.size(); i++) {
			totalPassivo += listaConta.get(i).getSaldo(); 
		}
		System.out.println("                  *********************************************");
		System.out.println("                           Total Passivo: R$"+totalPassivo);
		System.out.println("                  *********************************************");
		System.out.println("                               Final do Relatório");
		
		return totalPassivo;
	}
}














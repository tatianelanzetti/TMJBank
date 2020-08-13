package Principal;

import java.io.BufferedWriter;							//Nome do Banco
import java.io.FileWriter;                      		//Número da Agência
import java.io.IOException;                     		//Data hora
import java.text.SimpleDateFormat;              		//Comprovante de Saque
import java.util.Date;									//CPF NOME
import java.util.List;

//Valor Sacado:
import ContasBancarias.Conta;							//Tributação:	
import ContasBancarias.ContaCorrente;
import ContasBancarias.SeguroDeVida;
import ContasBancarias.taxas;
import Pessoal.Diretor;
import Pessoal.Pessoa;									//SAC: 0800-340-3413
														//Ouvidoria: 0800-314-4303
														//Site: www.tmjbank.com
														//É um prazer te-lo como Cliente s2
public class EscritorDeTransacoes {
	
	static final String PATH_BASICO = "./";
	static final String EXTENSAO = ".txt";
	
	
	public static void escritorSaque(Pessoa p, Conta c, double valor) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_SAQUE_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                      Comprovante de Saque";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n\n");
		linha = "                  Valor da Operação: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "                    Valor Tributado: R$"+taxas.TAXASAQUE;
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	
	public static void escritorDeposito(Pessoa p, Conta c, double valor) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_DEPOSITO_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                     Comprovante de Depósito";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n\n");
		linha = "                  Valor da Operação: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "                    Valor Tributado: R$"+taxas.TAXADEPOSITO;
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	
	public static void escritorTransferencia(Pessoa p, Conta c, double valor, Conta destino, List<Pessoa> listaPessoa) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_TRANSFERENCIA_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                   Comprovante de Transferência";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       Conta de Origem: ";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n\n");
		linha = "                        Conta Destino: ";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+destino.getCpf()+" Nome: "+VerificaListas.encontraPessoa(destino.getCpf(), listaPessoa);
		buffWrite.append(linha + "\n\n");
		linha = "                  Valor da Operação: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "                    Valor Tributado: R$"+taxas.TAXATRANSFERENCIA;
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	
	public static void seguroDeVida(Pessoa p, Conta c, double valor) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_SEGURODEVIDA_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                   Contrato de Seguro de Vida";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                      Número da Apólice: "+SeguroDeVida.getNroApolice();
		buffWrite.append(linha + "\n\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "                  Valor da Operação: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "                    Valor Tributado: R$"+valor*taxas.TAXASEGUROVIDA;
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	public static void saldo(Pessoa p, Conta c) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_SALDO_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                          Saldo Atual";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "                  Valor do saldo: R$"+c.getSaldo();
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	
	public static void tributacao(Pessoa p, Conta c, double totalGastos) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_TRIBUTACAO_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                Extrato Geral de Tributos Pagos";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n\n");
		linha = "             Total de tributos pagos em operações: "+totalGastos;
		buffWrite.append(linha + "\n\n");
		linha = "             Quantidade de Saques: "+((ContaCorrente)c).getQtdSaque();
		buffWrite.append(linha + "\n");
		linha = "             Tributos pagos para Saque: R$"+((ContaCorrente)c).getQtdSaque()*taxas.TAXASAQUE;
		buffWrite.append(linha + "\n\n");
		linha = "             Quantidade de Depósitos: "+((ContaCorrente)c).getQtdDeposito();
		buffWrite.append(linha + "\n");
		linha = "             Tributos pagos para Depósitos: R$"+((ContaCorrente)c).getQtdDeposito()*taxas.TAXADEPOSITO;
		buffWrite.append(linha + "\n\n");
		linha = "             Quantidade de Transfêrencia: "+((ContaCorrente)c).getQtdTransferencia();
		buffWrite.append(linha + "\n");
		linha = "             Tributos pagos para Transferência: R$"+((ContaCorrente)c).getQtdTransferencia()*taxas.TAXATRANSFERENCIA;
		buffWrite.append(linha + "\n\n");
		linha = "                     **Valor dos Tributos**";
		buffWrite.append(linha + "\n");
		linha = "                     Tributo para saque: "+taxas.TAXASAQUE;
		buffWrite.append(linha + "\n");
		linha = "                    Tributo para Depósito: "+taxas.TAXADEPOSITO;
		buffWrite.append(linha + "\n");
		linha = "                  Tributo para Transferência: "+taxas.TAXATRANSFERENCIA;
		buffWrite.append(linha + "\n");
		if(((ContaCorrente)c).isTemSeguro()) {
		double valorSegurado = ((ContaCorrente)c).getValorSeguro();
		linha = "\n           Valor do seguro de vida contratado: " +valorSegurado;
		buffWrite.append(linha + "\n");
		linha = "           Taxa debitada no ato da contratação: " +valorSegurado*taxas.TAXASEGUROVIDA;
		buffWrite.append(linha + "\n");
		}
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	
	public static void Rendimento(Pessoa p, Conta c, double valor, int dias) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_RENDIMENTO_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "              Simulação de Rendimentos da Poupança";
		buffWrite.append(linha + "\n\n");
		linha = "           Valor que deseja Aplicar: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "           Prazo em dias que deseja deixar aplicado: "+dias;
		buffWrite.append(linha + "\n");
		linha = "           Rendimento Esperado: R$"+valor*dias*taxas.TAXARENDIMENTOPOUPANCA;
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "                       SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "                    Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "                         www.tmjbank.com";
		buffWrite.append(linha + "\n\n");
		linha = "                É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	public static void relatorioGerente(Pessoa p, Conta c, int contasAgencia) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_RELATORIO_GERENTE_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                  Relatório de Contas Ativas";
		buffWrite.append(linha + "\n\n");
		linha = "              Numero Total de Contas da agência: "+contasAgencia;
		buffWrite.append(linha + "\n\n");
		linha = "                        Final do Relatório";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	public static void relatorioDiretor(Pessoa p, Conta c, List<String> lista) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_RELATORIO_DIRETOR_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Diretoria: "+((Diretor)p).getDiretoria();
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "         CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                      Relatório de Clientes";
		buffWrite.append(linha + "\n\n");
		for(int i = 0; i < lista.size(); i++) {
			linha = lista.get(i);
			buffWrite.append(linha + "\n\n");			
		}
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                        Final do Relatório";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
	public static void relatorioPresidente(Pessoa p, Conta c, double totalPassivo) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat horaFormatada = new SimpleDateFormat("HH:mm:ss");
		Date data = new Date();
		
		String path = PATH_BASICO+p.getNome()+"_RELATORIO_PRESIDENTE_"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
	    linha = "                       |T|M|J| |B|A|N|K|";
	    buffWrite.append(linha + "\n");
	    linha = "                       +-+-+-+-+-+-+-+-+";
	    buffWrite.append(linha + "\n");
		linha = "                         Presidência";
		buffWrite.append(linha + "\n");
		linha = "                     " + dataFormatada.format(data)+" "+horaFormatada.format(data);
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "               CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		linha = "            Relatório do capital armazenado no banco";
		buffWrite.append(linha + "\n\n");
		linha = "                    Total Passivo: R$"+totalPassivo;
		buffWrite.append(linha + "\n\n");
		linha = "                        Final do Relatório";
		buffWrite.append(linha + "\n");
		linha = "         **********************************************";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
}











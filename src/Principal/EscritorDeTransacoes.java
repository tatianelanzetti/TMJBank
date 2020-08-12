package Principal;

import java.io.BufferedWriter;							//Nome do Banco
import java.io.FileWriter;                      		//Número da Agência
import java.io.IOException;                     		//Data hora
import java.text.SimpleDateFormat;              		//Comprovante de Saque
import java.util.Date;									//CPF NOME
														//Valor Sacado:
import ContasBancarias.Conta;							//Tributação:	
import ContasBancarias.taxas;
import Pessoal.Pessoa;									//SAC: 0800-340-3413
														//Ouvidoria: 0800-314-4303
														//Site: www.tmjbank.com
														//É um prazer te-lo como Cliente s2
public class EscritorDeTransacoes {
	
	static final String PATH_BASICO = "./";
	static final String EXTENSAO = ".txt";
	
	
	@SuppressWarnings("deprecation")
	public static void escritorSaque(Pessoa p, Conta c, double valor) throws IOException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss_");
		Date data = new Date();

		String path = PATH_BASICO+p.getNome()+"SAQUE"+simpleDateFormat.format(data)+EXTENSAO;
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		
		linha = "Agência: "+c.getAgencia();
		buffWrite.append(linha + "\n");
		linha = ""+data.getDay()+"/"+data.getMonth()+"/"+data.getYear()+" "+data.getHours()+":"+data.getMinutes()+":"+data.getSeconds();
		buffWrite.append(linha + "\n");
		linha = "Comprovante de Saque";
		buffWrite.append(linha + "\n");
		linha = "CPF: "+c.getCpf()+" Nome: "+p.getNome();
		buffWrite.append(linha + "\n");
		linha = "Valor da Operação: R$"+valor;
		buffWrite.append(linha + "\n");
		linha = "Valor Tributado: R$"+taxas.TAXASAQUE;
		buffWrite.append(linha + "\n");
		linha = "Informações, Sugestões, Reclamações ou Elogios";
		buffWrite.append(linha + "\n");
		linha = "SAC: 0800-340-3413";
		buffWrite.append(linha + "\n");
		linha = "Ouvidoria: 0800-314-4303";
		buffWrite.append(linha + "\n");
		linha = "www.tmjbank.com";
		buffWrite.append(linha + "\n");
		linha = "É um prazer te-lo como Cliente s2";
		buffWrite.append(linha + "\n");
		
		buffWrite.close();
	}
}











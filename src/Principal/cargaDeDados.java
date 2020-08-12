package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import Carteira.Cliente;
import ContasBancarias.Conta;
import ContasBancarias.ContaCorrente;
import ContasBancarias.ContaPoupanca;
import Pessoal.Gerente;
import Pessoal.Pessoa;
import Pessoal.Diretor;
import Pessoal.Presidente;
import enums.ContaEnum;
import enums.pessoaEnum;

public class cargaDeDados {

	public void leitor(String path, List<Pessoa> p, List<Conta> c) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));		
		String linha = "";
		
		while(true) {
			Pessoa funcionario = null;
			Conta conta = null;
			
			linha = buffRead.readLine();
//			System.out.println(linha);
			
			if(linha != null) {
				String[] split = linha.split(";");
				if(split[2].equalsIgnoreCase(pessoaEnum.GERENTE.name())) {
					funcionario = new Gerente(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]));
					p.add(funcionario);
				} 
				else if(split[2].equalsIgnoreCase(pessoaEnum.DIRETOR.name())) {
					funcionario = new Diretor(split[0], split[1], split[2], Integer.parseInt(split[3]), Integer.parseInt(split[4]));
					p.add(funcionario);
				}
				else if(split[2].equalsIgnoreCase(pessoaEnum.PRESIDENTE.name())) {
					funcionario = new Presidente(split[0], split[1], split[2], Integer.parseInt(split[3]));
					p.add(funcionario);
				}
				else if(split[2].equalsIgnoreCase(pessoaEnum.CLIENTE.name())) {
					funcionario = new Cliente(split[0], split[1], split[2], Integer.parseInt(split[3]));
					p.add(funcionario);
				}
				else if(split[3].equalsIgnoreCase(ContaEnum.CONTACORRENTE.name())) {
					conta = new ContaCorrente(split[0], Double.parseDouble(split[1]), Integer.parseInt(split[2]), split[3]);
					c.add(conta);
				}
				else if(split[3].equalsIgnoreCase(ContaEnum.CONTAPOUPANCA.name())) {
					conta = new ContaPoupanca(split[0], Double.parseDouble(split[1]), Integer.parseInt(split[2]), split[3]);
					c.add(conta);
				}
			}
			else
				break;
			
		}
		
		buffRead.close();
	}
}

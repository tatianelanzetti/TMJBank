package Principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Carteira.Cliente;
import ContasBancarias.Conta;
import Pessoal.Funcionario;
import Pessoal.Gerente;
import Pessoal.Pessoa;
import Pessoal.Diretor;
import Pessoal.Presidente;

public class cargaDeDados {

	public void leitor(String path, List<Pessoa> p, List<Conta> c) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));		
		String linha = "";
		
		while(true) {
			Funcionario funcionario = null;
			Cliente cliente = null;
			
			linha = buffRead.readLine();
//			System.out.println(linha);
			
			if(linha != null) {
				String[] split = linha.split(";");
				if(split[2].equalsIgnoreCase("GERENTE")) {
					funcionario = new Gerente(Integer.parseInt(split[0]), split[1], split[2], split[3], Integer.parseInt(split[4]));
					p.add(funcionario);
					System.out.println(funcionario);
				} 
				else if(split[2].equalsIgnoreCase("DIRETOR")) {
					funcionario = new Diretor(Integer.parseInt(split[0]), split[1], split[2], split[3], Integer.parseInt(split[4]));
					p.add(funcionario);
					System.out.println(funcionario);
				}
				else if(split[2].equalsIgnoreCase("PRESIDENTE")) {
					funcionario = new Presidente(Integer.parseInt(split[0]), split[1], split[2], split[3]);
					p.add(funcionario);
					System.out.println(funcionario);
				}
				else if(split[2].equalsIgnoreCase("PRESIDENTE")) {
					funcionario = new Presidente(Integer.parseInt(split[0]), split[1], split[2], split[3]);
					p.add(funcionario);
					System.out.println(funcionario);
				}
			}
			else
				break;
			
		}
		
		buffRead.close();
	}
}
